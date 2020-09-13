package culminating;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Culminating extends StateBasedGame{
    public static void main(String[] args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new Culminating("Hangman"));
      app.setShowFPS(false);
      app.setDisplayMode(800, 600, false);
      app.start();
    }

    public Culminating(String name) {
        super(name);
    
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        this.addState(new Menu(1));
       this.addState(new Sreen(2));
       this.addState(new Sreen2(3));
    }
    
}
