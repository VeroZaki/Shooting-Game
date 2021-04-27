/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class frame extends JFrame{
    Ball ball;
    Ball ball_2;
    Ball ball_3;
    Ball ball_4;
    Ball ball_5;
    Ball ball_6;
    Ball gold;
    ship s;
    BufferedImage winner=null;
    BufferedImage loser=null;
    BufferedImage l=null;
    projectile p;
    screen screen;
    screen screen2;
    int arr[];
    private JButton b1;
    private JPanel p1;
    static int score=0;
    static int x=0;
    static int y=0;
    static int k=0;
    static int temp;
    int time;
    boolean flag2 = true;
    boolean flag = true;
    boolean flag3 = true;
    
    public frame(int score , int k){           
            this.score = score;
            this.k=k;
            //score = score + 1;
            screen=new screen();
            screen.setBounds(0, 0, 900, 800);
            add(screen);
    }
    public frame(Ball ball,  Ball ball_2,Ball ball_3,  Ball ball_4,Ball ball_5 , Ball ball_6 , Ball gold , ship s, projectile p){
        super("ball game");
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
                      setVisible(true);
                      JPanel p1 = new JPanel();
                      JButton button = new JButton("Test");
                       new NewJFrame().setVisible(true);
                      //p1.add(b1);
                      //add(p1);
                      this.ball=ball;
                      this.ball_2=ball_2;
                      this.ball_3=ball_3;
                      this.ball_4=ball_4;
                      this.ball_5=ball_5;
                      this.ball_6=ball_6;
                      this.gold=gold;
                      this.p = p;
                      this.s = s;
                      //score =score + 1;
                      screen=new screen();
                      screen.setBounds(0, 0, 900, 800);
                      add(screen);
                      NewJFrame fo = new NewJFrame();
                       //again n =  new again();
    }
    public void paint(int temp2){
                   temp = temp2 ;
                   flag3 = false;
		//g.drawString("Score: " + score, 10, 10);	
                   System.out.println("tempppppppppppp      " +temp);
    }
    public void rand(int num , int num2){
        x = num;
        y = num2;
    }
    public class screen extends JLabel {
        protected void paintComponent(Graphics g) {
         super.paintComponent(g);
            //set color for frame 
            //g.setColor(Color.yellow);
            //g.fillRect(0, 0, 400, 400);
            g.drawImage(ball.play_ball, (int)ball.x_pos, (int)ball.y_pos, null);
            //g.drawString();
            g.drawImage(ball_2.play_ball, (int)ball_2.x_pos, (int)ball_2.y_pos, null);
            g.drawImage(ball_3.play_ball, (int)ball_3.x_pos, (int)ball_3.y_pos, null);
            g.drawImage(ball_4.play_ball, (int)ball_4.x_pos, (int)ball_4.y_pos, null);
            g.drawImage(ball_5.play_ball, (int)ball_5.x_pos, (int)ball_5.y_pos, null);
            g.drawImage(ball_6.play_ball, (int)ball_6.x_pos, (int)ball_6.y_pos, null);
           
            g.drawImage(p.proo,(int)s.x_pos+40, (int)p.y_pos, null);
            g.drawImage(s.shipo, (int)s.x_pos, (int)s.y_pos, null);
            g.drawLine(0, 550 ,900 ,550);
            g.drawRect(10, 20, 120, 100);
            g.drawRect(630, 20, 140, 100);
            g.drawRect(300, 20, 140, 100);
            g.drawString(x + " " + " + " + " " + y  , 350 , 70);
           
            String str[] = {"Red" , "Black" , "Blue" , "Yellow" , "Orange" , "Green"};
            
            if(temp == 0 ){
                g.drawString("Colour: " + str[0] , 650, 70);
                flag3 = false;
            }
            else if(temp == 1){
                g.drawString("Colour: " + str[1] , 650, 70);
                flag3 = false;
            }
            else if(temp == 2){
                g.drawString("Colour: " + str[2] , 650, 70);
                flag3 = false;
            }
            else if(temp == 3){
                g.drawString("Colour: " + str[3] , 650, 70);
                flag3 = false;
            }
            else if(temp == 4){
                g.drawString("Colour: " + str[4] , 650, 70);
                flag3 = false;   
            }
            else if(temp == 5){
                g.drawString("Colour: " + str[5] , 650, 70);
                flag3 = false;
            }
            if(score < 0 || k < 0){
                score=0;
                k=0;
            }
            time = time + 1;
           if((time > 0 && time < 500) ||(time > 2000 && time < 2500) ||(time > 4000 && time < 4500)  ){
                 g.drawImage(gold.play_ball, (int)gold.x_pos, (int)gold.y_pos, null);
            }
            
            //score =score + 1;
            g.drawString("Score: " + score, 30, 60);
            if(score >= 100 || flag == false){
               if(score > 100){
                   score = 100;
               }
             try {
                 winner=ImageIO.read(Newgame.class.getClassLoader().getResourceAsStream("newgame/win.jpg"));
                 
             } catch (IOException ex) {
                 Logger.getLogger(frame.class.getName()).log(Level.SEVERE, null, ex);
             }
                        
             g.drawImage(winner, (int)-100, (int)0, null);
             g.drawString("Score: " + score , 30, 60);
             time = 0;
             NewClass.isGame = false;
             score=k;
             flag = false;
            }
            else if(score < 100 && time > 6000 || flag2 == false){
             try {
                 loser=ImageIO.read(Newgame.class.getClassLoader().getResourceAsStream("newgame/over.jpg"));
                 //l=ImageIO.read(Newgame.class.getClassLoader().getResourceAsStream("newgame/l3.png"));
             } catch (IOException ex) {
                 Logger.getLogger(frame.class.getName()).log(Level.SEVERE, null, ex);
             }
                //g.drawImage(l, (int)-100, (int)0, null);
                g.drawImage(loser, (int)-100, (int)0, null);
                g.drawString("Score: " + score , 30, 60);
               NewClass.isGame = false;
               time = 0;
               score = k;
               flag2 = false;
              again n =  new again();
            }
            
            String dateAsText = new SimpleDateFormat("mm:ss.SS")
                          .format(new Date(time * 10L));
            g.drawString("Time: " + dateAsText, 30, 100);
            
        } 
        
        
    }
    
     public class screen2 extends JLabel {
        protected void paintComponent2(Graphics g) {
         super.paintComponent(g);
         //set color for frame 
        // g.setColor(Color.yellow);
         //g.fillRect(0, 0, 400, 400);
            
            g.drawString("Score: " + score, 30, 60);
        }
        
        
    }
    
}
