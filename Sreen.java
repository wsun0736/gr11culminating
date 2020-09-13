package culminating;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import java.util.Random;
import org.newdawn.slick.Input;
import org.newdawn.slick.Sound;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Sreen extends BasicGameState{
    private static StateBasedGame Hangman;
    private boolean ok = false;
  String[]words = {"banjo","hijab","fruit","bagel","jewel","china","korea","south","north","juice","xylem","black","dozen","hertz","angry","bread","earth","heart","human","pecan","money","mouse","table","novel","sugar","tiger"};
  String[]description = {"Instrument","Scarf","Food","food","Stone","Country","Country","Cardinal Direction","Cardinal Direction","Beverage","Plant Organ","Colour","Number","Physics Unit","Emotion","Food","Planet","Human Organ","Animal","Food","Currency","Animal","Furniture","Book","Food","Animal"};
  
  
     int random; 
     public int spot=0;
     private int time= 0; 
     public Sound aa, buzzer, winsound, losesound;
public Image a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,smalllogo, hangman, head,line, body, arms, leftleg, rightleg, win, lose;
private int dylan = 1;
public int [] cordx = {400,460,520,580,640};
public int[] cordy = {450,450,450,450,450};
public int xs[]= {0,58,100,155,205,255,300,0,55,85,125,175,225,300,0,55,100,155,205,255,305,0,55,135,182,240};
public int ys [] = {25,30,25,25,25,25,25,85,85,85,85,85,90,85,145,145,145,145,145,145,145,210,210,210,210,215};
public int yes = 0; 

    Sreen(int i) {
         Random num = new Random();
spot = num.nextInt(description.length);
   this.dylan = i;
    }

    public int getID() {
        
      return dylan;
    }
   
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        Hangman = sbg;
      a = new Image("Images\\a.png");
      b = new Image("Images\\b.png");
      c = new Image("Images\\c.png");
      d = new Image("Images\\d.png");
       e = new Image("Images\\e.png");
       f = new Image("Images\\f.png");
       g = new Image("Images\\g.png");
       h = new Image("Images\\h.png");
       i = new Image("Images\\i.png");
       j = new Image("Images\\j.png");
       k = new Image("Images\\k.png");
       l = new Image("Images\\l.png");
       m = new Image("Images\\m.png");
       n = new Image("Images\\n.png");
       o = new Image("Images\\o.png");
       p = new Image("Images\\p.png");
       q = new Image("Images\\q.png");
       r = new Image("Images\\r.png");
       s = new Image("Images\\s.png");
       t = new Image("Images\\t.png");
       u = new Image("Images\\u.png");
       v = new Image("Images\\v.png");
       w = new Image("Images\\w.png");
       x = new Image("Images\\x.png");
       y = new Image("Images\\y.png");
       z = new Image("Images\\z.png");
     hangman = new Image("Images\\hangman.png");
     head = new Image("Images\\head.png");
      line  = new Image("Images\\line.png");
      body = new Image("Images\\body.png");
      arms  = new Image("Images\\line.png");
      leftleg = new Image("Images\\legA.png");
      rightleg = new Image("Images\\legB.png");
 win = new Image("Images\\won.png");
 lose = new Image("Images\\lose.png");
 smalllogo = new Image("Images\\smalllogo.png");
 aa = new Sound("Sound\\Ding Sound Effect.wav");
 buzzer = new Sound("Sound\\Buzzer.wav");
 winsound = new Sound("Sound\\win.wav");
        losesound= new Sound("Sound\\lose.wav");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        grphcs.setBackground(Color.white);
        grphcs.setColor(Color.black);
        grphcs.drawImage(smalllogo, 0, 0);
        for(int ff = 0 ; ff<5;ff++){
            grphcs.drawImage(line,cordx[ff],(cordy[ff]+5)); 
            
        }
     
        grphcs.drawString("Click a lettre", 125, 15);
       
        grphcs.drawImage(a,xs[0],ys[0]);
        grphcs.drawImage(b,xs[1],ys[1]);
        grphcs.drawImage(c,xs[2],ys[2]);
        grphcs.drawImage(d,xs[3],ys[3]);
        grphcs.drawImage(e,xs[4],ys[4]);
        grphcs.drawImage(f,xs[5],ys[5]);
        grphcs.drawImage(g,xs[6],ys[6]);
        grphcs.drawImage(h,xs[7],ys[7]);
        grphcs.drawImage(i,xs[8],ys[8]);
        grphcs.drawImage(j,xs[9],ys[9]);
        grphcs.drawImage(k,xs[10],ys[10]);
        grphcs.drawImage(l,xs[11],ys[11]);
        grphcs.drawImage(m,xs[12],ys[12]);
        grphcs.drawImage(n,xs[13],ys[13]);
        grphcs.drawImage(o,xs[14],ys[14]);
        grphcs.drawImage(p,xs[15],ys[15]);  
        grphcs.drawImage(q,xs[16],ys[16]);  
        grphcs.drawImage(r,xs[17],ys[17]);  
        grphcs.drawImage(s,xs[18],ys[18]);  
        grphcs.drawImage(t,xs[19],ys[19]);  
        grphcs.drawImage(u,xs[20],ys[20]);  
        grphcs.drawImage(v,xs[21],ys[21]); 
        grphcs.drawImage(w,xs[22],ys[22]); 
        grphcs.drawImage(x,xs[23],ys[23]); 
        grphcs.drawImage(y,xs[24],ys[24]); 
        grphcs.drawImage(z,xs[25],ys[25]); 
        grphcs.drawImage(hangman,500,50);
        grphcs.drawString("Used Letters", 50, 300);
        grphcs.drawString("Description:",600, 10);
        grphcs.drawString(description[spot],600,25);
          grphcs.drawString("Word", 560, 375);
   if(time >=1){
        grphcs.drawImage(head,683,95);
     } 
   if(time>=2){
       grphcs.drawImage(body,680,81);
   }
   if(time>=3){
   grphcs.drawImage(arms,660,120);}
   if(time >=4){
       grphcs.drawImage(arms,710,120);
   }
   if(time>=5){
       grphcs.drawImage(leftleg,622,155);
   }
      if(time>=6){
          grphcs.drawImage(rightleg,665,155);
            grphcs.drawString("The word was:", 285, 300);
            grphcs.setColor(Color.red);
              grphcs.drawString(words[spot],420,300);
                     grphcs.drawString("Click to Exit", 300, 320);
       
      }
     if(time>=7){

          grphcs.drawImage(lose,-85,-60);
      grphcs.setColor(Color.white);
         
      }
          if(yes==5){
              grphcs.setColor(Color.red);
              grphcs.drawString("Click to Exit", 300, 300);
                  
           
          }
      if(yes==6){
          grphcs.drawImage(win,-75,-60);
              
      }
    }


    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
     
           int x = Mouse.getX();
        int y = Mouse.getY();
        System.out.println(x+" "+y);
             if(yes==5){
               if((x>=0&&x<=800)&&(y>=0&&y<=600)&&(input.isMousePressed(0))){
               winsound.play();
yes++;
              }}
             if(time==6){
                                if((x>=0&&x<=800)&&(y>=0&&y<=600)&&(input.isMousePressed(0))){
               losesound.play();
time++;
              }}
             
           
           
        if(time>=6||yes==6){
               if((x>=0&&x<=800)&&(y>=0&&y<=600)&&(input.isMousePressed(0))){
                   
gc.exit();
              }
    }

     
        String at = " ";
        char it = 'C';
  

        if((x>=11&&x<=57)&&(y>=510&&y<=563)&&(input.isMousePressed(0))){
           at = "a";
            it = 'a';
            int c = 0;
for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
      
        break;
    }else{ ok=false; 
    }
}
if(ok){
     aa.play();
    xs[0]= cordx[c];
    ys[0] = cordy[c]+25;
    yes++;
   
}
else {
    buzzer.play();
    time+=1;
        xs[0]= 0;
        ys[0] =315;
        
        }
  }

    
        else if((x>=64&&x<=104)&&(y>=511&&y<=561)&&(input.isMousePressed(0))){
                 at = "b";
                 it= 'b';
                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }
    else{ ok=false;
   }
}
if(ok){
         aa.play();
    xs[1]= cordx[c]+15;
    ys[1] = cordy[c]+30;
     yes++;
}else{
      buzzer.play();
       xs[1] = 55+5;
       ys[1] = 315+5;
 time+=1;
}
           }
        else if((x>=116&&x<160)&&(y>=511&&y<=561)&&(input.isMousePressed(0))){
                 at = "c";
                 it= 'c';
                                       int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
    }
}
if(ok){
         aa.play();
    xs[2]= cordx[c];
    ys[2] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[2] = 105;
       ys[2] = 315;
 time+=1;}
    }
                 else  if((x>=170&&x<=212)&&(y>=511&&y<=561)&&(input.isMousePressed(0))){
                 at = "d";
                 it= 'd';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
   }
}
if(ok){
         aa.play();
    xs[3]= cordx[c];
    ys[3] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[3] = 160;
       ys[3] = 315;
 time+=1;}
    }
                    else if((x>=220&&x<=260)&&(y>=511&&y<=561)&&(input.isMousePressed(0))){
                 at = "e";
                 it= 'e';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
  }
}
if(ok){
         aa.play();
    xs[4]= cordx[c];
    ys[4] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[4] = 210;
       ys[4] = 315;
 time+=1;}
    }
           else if((x>270&&x<=306)&&(y>=511&&y<=561)&&(input.isMousePressed(0))){
                 at = "f";
                 it= 'f';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else{ ok=false;
    }
}
if(ok){
         aa.play();
    xs[5]= cordx[c];
    ys[5] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[5] = 260;
       ys[5] = 315;
 time+=1;}
    }
             else if((x>=316&&x<=365)&&(y>=511&&y<=561)&&(input.isMousePressed(0))){
                 at = "g";
                 it= 'g';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
    }
}
if(ok){
         aa.play();
    xs[6]= cordx[c];
    ys[6] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[6] = 310;
       ys[6] = 315;
 time+=1;}
    }
               else if((x>=15&&x<=65)&&(y>=450&&y<=500)&&(input.isMousePressed(0))){
                 at = "h";
                 it= 'h';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
    }
}
if(ok){
         aa.play();
    xs[7]= cordx[c];
    ys[7] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[7] = 0;
       ys[7] = 375;
 time+=1;}
    }
               else if ((x >= 70 && x <= 85) && (y >= 450 && y <= 500) && (input.isMousePressed(0))) {
         at = "i";
         it = 'i';
                         int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
   }
}
if(ok){
         aa.play();
    xs[8]= cordx[c]+20;
    ys[8] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
         xs[8] = 55;
         ys[8] = 375;
 time+=1;}
     }
                 else if((x>=100&&x<=122)&&(y>=450&&y<=500)&&(input.isMousePressed(0))){
                 at = "j";
                 it= 'j';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
    }
}
if(ok){
         aa.play();
    xs[9]= cordx[c]+10;
    ys[9]= cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[9] = 85;
       ys[9] = 375;
 time+=1;}
    }
                   else if((x>=140&&x<=180)&&(y>=450&&y<=500)&&(input.isMousePressed(0))){
                 at = "k";
                 it= 'k';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
    }
}
if(ok){
         aa.play();
    xs[10]= cordx[c];
    ys[10] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[10] = 120;
       ys[10] = 375;
 time+=1;}
    }   else if((x>=190&&x<=230)&&(y>=450&&y<=500)&&(input.isMousePressed(0))){
                 at = "l";
                 it= 'l';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
   }
}
if(ok){
         aa.play();
    xs[11]= cordx[c];
    ys[11] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[11] = 185;
       ys[11] = 375;
 time+=1;}
    }
       else if((x>=240&&x<=300)&&(y>=450&&y<=500)&&(input.isMousePressed(0))){
                 at = "m";
                 it= 'm';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else{ ok=false;
  }
}
if(ok){
         aa.play();
    xs[12]= cordx[c];
    ys[12] = cordy[c]+30;
     yes++;
}else{
      buzzer.play();
       xs[12] = 240;
       ys[12] = 375+5;
 time+=1;}
    }   else if((x>=315&&x<=360)&&(y>=450&&y<=500)&&(input.isMousePressed(0))){
                 at = "n";
                 it= 'n';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
}
}
if(ok){
         aa.play();
    xs[13]= cordx[c];
    ys[13] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[13] = 310;
       ys[13] = 375;
 time+=1;}
    }   else if((x>=12&&x<=62)&&(y>=388&&y<=440)&&(input.isMousePressed(0))){
                 at = "o";
                 it= 'o';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
   }
}
if(ok){
         aa.play();
    xs[14]= cordx[c];
    ys[14] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[14] = 0;
       ys[14] = 435;
 time+=1;}
    }  else if((x>=70&&x<=110)&&(y>=388&&y<=440)&&(input.isMousePressed(0))){
                 at = "p";
                 it= 'p';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else{ ok=false;
   }
}
if(ok){
         aa.play();
    xs[15]= cordx[c];
    ys[15] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[15] = 55;
       ys[15] = 435;
 time+=1;}
    }
      else if ((x >=115 && x <= 160) && (y >= 388 && y <= 440) && (input.isMousePressed(0))) {
         at = "q";
         it = 'q';
                         int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
 }
}
if(ok){
         aa.play();
    xs[16]= cordx[c];
    ys[16] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
         xs[16] = 100;
         ys[16] = 435;
 time+=1;}
     }  else if((x>=170&&x<=210)&&(y>=388&&y<=440)&&(input.isMousePressed(0))){
                 at = "r";
                 it= 'r';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
    }
}
if(ok){
         aa.play();
    xs[17]= cordx[c];
    ys[17] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[17] = 155;
       ys[17] = 435;
 time+=1;}
    }  else if((x>=220&&x<=260)&&(y>=388&&y<=440)&&(input.isMousePressed(0))){
                 at = "s";
                 it= 's';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
   }
}
if(ok){
         aa.play();
    xs[18]= cordx[c];
    ys[18] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[18] = 205;
       ys[18] = 435;
 time+=1;}
    }  else if((x>=270&&x<=310)&&(y>=388&&y<=440)&&(input.isMousePressed(0))){
                 at = "t";
                 it= 't';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
    }
}
if(ok){
         aa.play();
    xs[19]= cordx[c];
    ys[19] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[19] = 255;
       ys[19] = 435;
 time+=1;}
    }  else if((x>=318&&x<=360)&&(y>=388&&y<=440)&&(input.isMousePressed(0))){
                 at = "u";
                 it= 'u';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else{ ok=false;
    }
}
if(ok){
         aa.play();
    xs[20]= cordx[c];
    ys[20] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[20] = 305;
       ys[20] = 435;
time+=1;}
    }  else if((x>=13&&x<=60)&&(y>=323&&y<=380)&&(input.isMousePressed(0))){
                 at = "v";
                 it= 'v';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
  }
}
if(ok){
         aa.play();
    xs[21]= cordx[c];
    ys[21] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[21] = 0;
       ys[21]=495;
time+=1;}
    } else if((x>=70&&x<=140)&&(y>=323&&y<=380)&&(input.isMousePressed(0))){
                 at = "w";
                 it= 'w';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
   }
}
if(ok){
         aa.play();
    xs[22]= cordx[c]-25;
    ys[22] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[22] = 55;
       ys[22]=495;
time+=1;}
    } else if((x>=150&&x<=186)&&(y>=323&&y<=380)&&(input.isMousePressed(0))){
                 at = "x";
                 it= 'x';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
 }
}
if(ok){
         aa.play();
    xs[23]= cordx[c];
    ys[23] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[23] = 135;
       ys[23]=495;
time+=1;}
    } else if((x>=195&&x<=230)&&(y>=323&&y<=380)&&(input.isMousePressed(0))){
                 at = "y";
                 it= 'y';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
    }
}
if(ok){
         aa.play();
    xs[24]= cordx[c];
    ys[24] = cordy[c]+25;
     yes++;
}else{
      buzzer.play();
       xs[24] = 180;
       ys[24]=495;
time++;}
    } else if((x>=240&&x<=280)&&(y>=323&&y<=380)&&(input.isMousePressed(0))){
                 at = "z";
                 it= 'z';
                                 int c =0 ;
                 for(c = 0; c<5;c++){
    if(at.equals(words[spot].substring(c,c+1))){
        ok = true;
        break;
    }  else {ok=false;
    }
}
if(ok){
         aa.play();
    xs[25]= cordx[c]+10;
    ys[25] = cordy[c]+30;
     yes++;
}else{
      buzzer.play();
       xs[25] = 230;
       ys[25]=495;
time++;}
    }
      
       
       
        
    


    }
    
}
