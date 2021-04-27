
package newgame;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import static jdk.nashorn.internal.objects.NativeMath.random;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Newgame {
            static   int randomNumber;
            static Random rand = new Random();     
            private JButton b1;
    /**     
     * @param args the command line arguments
     */
    public static int time;
    public static void main(String[] args) throws InterruptedException {   
                       //to load ball in the frame
                        BufferedImage play_Ball=null;
                        BufferedImage play_Ball2=null;
                        BufferedImage play_Ball3=null;
                        BufferedImage play_Ball4=null;
                        BufferedImage play_Ball5=null;
                        BufferedImage play_Ball6=null;
                        BufferedImage play_Gold=null;
                        BufferedImage play_ship= null;
                        BufferedImage pro= null;
                        boolean flag = true;
                        //if(isGame == true){
                        try{
                        play_Ball=ImageIO.read(Newgame.class.getClassLoader().getResourceAsStream("newgame/blue-removebg-removebg.png"));
                        play_Ball2=ImageIO.read(Newgame.class.getClassLoader().getResourceAsStream("newgame/black-removebg.png"));
                        play_Ball3=ImageIO.read(Newgame.class.getClassLoader().getResourceAsStream("newgame/green-removebg.png"));
                        play_Ball4=ImageIO.read(Newgame.class.getClassLoader().getResourceAsStream("newgame/index-removebg.png"));
                        play_Ball5=ImageIO.read(Newgame.class.getClassLoader().getResourceAsStream("newgame/index2-removebg.png"));
                        play_Ball6=ImageIO.read(Newgame.class.getClassLoader().getResourceAsStream("newgame/o.png"));
                        play_Gold=ImageIO.read(Newgame.class.getClassLoader().getResourceAsStream("newgame/gold.png"));
                        play_ship=ImageIO.read(Newgame.class.getClassLoader().getResourceAsStream("newgame/ship.png"));
                        pro=ImageIO.read(Newgame.class.getClassLoader().getResourceAsStream("newgame/pro.png"));
                        }
                        catch(IOException e)
                        {
                            System.out.println(e);
                        }                        
                        Ball b=new Ball(play_Ball,(int)random(300) ,(int)random(300),1,3 )  ;
                        Ball b1=new Ball(play_Ball2,(int)random(300) ,(int)random(300),2,4 )  ;
                        Ball b3=new Ball(play_Ball3,(int)random(300),(int)random(300),5,7 )  ;
                        Ball b4=new Ball(play_Ball4,(int)random(300),(int)random(300),6,8)  ;
                        Ball b5=new Ball(play_Ball5,(int)random(300) ,(int)random(300),10,9 )  ;
                        Ball b6=new Ball(play_Ball6,(int)random(300) ,(int)random(300),3,6 )  ;
                        Ball gold=new Ball(play_Gold,(int)random(300) ,(int)random(300),14,16 )  ;
                        ship s = new ship(330, 570, play_ship);
                        ship sh = new ship(330, 570, play_ship);
                        projectile k = new projectile(s.x_pos+40, 620,pro, s );
                        frame f=new frame(b, b1, b3, b4, b5 , b6 ,gold , s, k);                      
                        //to make ball move 
                        NewClass n=new  NewClass(b,f,k);
                        Thread t1=new Thread(n);
                        t1.setName("blue");
                        NewClass n1=new  NewClass(b1,f,k);
                        Thread t2=new Thread(n1);
                        t2.setName("black");
                        NewClass n2=new  NewClass(b3,f, k);
                        Thread t3=new Thread(n2);
                        t3.setName("green");
                        NewClass n3=new  NewClass(b4,f, k);
                        Thread t4=new Thread(n3);
                        t4.setName("red");
                        NewClass n4=new  NewClass(b5,f,k);
                        Thread t5=new Thread(n4);
                        t5.setName("yellow");
                        NewClass n5=new  NewClass(b6,f,k);
                        Thread t6=new Thread(n5);
                        t6.setName("orange");
                        NewClass g = new  NewClass(gold,f,k);
                        Thread t7 = new Thread(g);
                        t7.setName("gold");
                        createShip shippo = new createShip(s, f);
                        Thread hoho = new Thread(shippo);                      
                        t1.start();
                        //System.out.println(t1.getName());
                        t2.start();
                        //System.out.println(t2.getName());
                        t3.start();
                        //System.out.println(t3.getName());
                        t4.start();
                        //System.out.println(t4.getName());
                        t5.start();
                        //System.out.println(t5.getName());
                        t6.start();
                        t7.start();
                        hoho.start();                     
                        f.addKeyListener(new KeyListener(){
                          public void keyTyped(KeyEvent e) {
      
                         }
      /** Handle the key pressed event from the text field. */
                        public void keyPressed(KeyEvent c) {
                            int key = c.getKeyCode();
                            if(key==KeyEvent.VK_SPACE){
                                createPro pr = new createPro(k, f);
                                Thread pt = new Thread(pr);
                                pt.start();        
                            }
                        }
      /** Handle the key released event from the text field. */
                        public void keyReleased(KeyEvent e) {    
                        }
                   });
                        f.addKeyListener(new KeyListener(){
                          public void keyTyped(KeyEvent e) {      
                         }
      /** Handle the key pressed event from the text field. */
                        public void keyPressed(KeyEvent c) {
                            int key = c.getKeyCode();
                            if(key==KeyEvent.VK_UP && flag == true){
                                for(int i=0;i<100;i++){
                                createPro pr = new createPro(k, f);
                                Thread pt = new Thread(pr);
                                pt.start();  
                                }
                            }
                        }
                        public void keyReleased(KeyEvent e) {      
                        }
                   });                                               
    }                       
}
