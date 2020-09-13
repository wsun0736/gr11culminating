/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culminating;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.Image;
/**
 *
 * @author wsun0736
 */
public class Menu extends BasicGameState{
public static StateBasedGame game; 
public Image hang,logo;
    Menu(int i) {
        
    }

    @Override
    public int getID() {
      return 1;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
       game=sbg;
       hang= new Image("Images\\Hang.png");
       logo = new Image("Images\\logo.png");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
       grphcs.setBackground(Color.white);
       grphcs.setColor(Color.black);
       grphcs.drawImage(logo, 0, 0);
       grphcs.drawString("Enter the level of Difficulty",25,150);
       grphcs.drawString("1.Easy", 50 , 200);
       grphcs.drawString("2.Hard",50, 250);
       grphcs.drawImage(hang,300,0);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        
    }
       public void keyReleased(int key, char c){
           switch(key){
                case Input.KEY_1:
    game.enterState(2, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
    break;
                case Input.KEY_2:
                game.enterState(3, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
    break;     
               
    default:
    break;
           }

    
}}
