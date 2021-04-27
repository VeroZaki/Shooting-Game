/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

public class NewClass implements Runnable{
Ball b;
frame f;
frame s;
projectile p;
static int arr[];
static int intArray[];
static int score = 0;
static int k = 0;
 static int temp;  
int x;
int y=0;
static int randomNumber;
static int num;
static int num2;
static int sum;
int flag = 0; 
Random rand = new Random();
public static boolean isGame = true;
     public static void paint(Graphics g , int score) {
            g.drawString("Score: " + score, 10, 10);
        }     
    public NewClass(Ball b,frame f, projectile p) {
        this.b=b;
        this.f=f;
        this.p=p;
    }
     @Override
    public void run() {
         while(isGame == true){{
                         try{
                              b.update();
                              try{
                               f.screen.repaint();
                              }
                              catch (NullPointerException e)
                              {
                                  System.out.println(e);
                              }
                              Thread.sleep(15);                        
                          }
                          catch (InterruptedException ex)
                          {
                              Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null,ex);
                          }
                          
                          String str[] = {"Red" , "Black" , "Blue" , "Yellow" , "Orange" , "Green"};
                           int arr[] = {5, 2, 1, 4, 6, 3 };
                          
                            if(flag == 0 ){
                              flag +=10;
                              randomNumber=rand.nextInt((5 - 0) + 1) + 0;
                              num = rand.nextInt((3 - 0) + 1) + 0;
                              num2 = rand.nextInt((3 - 1) + 1) + 1;
                              
                              try {
                                  Thread.sleep(100);
                              } catch (InterruptedException ex) {
                                  Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                              }
                           
                            s = new frame(score , k);
                            s.paint(randomNumber);
                            s.rand(num, num2);
                            }
                            sum = (num + num2);
                            
                          if((p.x_pos>=b.x_pos-90 && p.x_pos<= b.x_pos+90) && (p.y_pos>=b.y_pos && p.y_pos<= b.y_pos+90)){
                                    System.out.println("proxpos="+p.x_pos+" proypos="+ p.y_pos + "ballx="+ b.x_pos + "bally="+ b.y_pos);
                                    //Random rand = new Random();
                                    System.out.println("no " + randomNumber);
                                    System.out.println(Thread.currentThread().getName());
                                    
                                     if(randomNumber == 0 && Thread.currentThread().getName() == "red"){
                                         score = score + 2;
                                         System.out.println("yessssssss    reddddd");
                                     }
                                     else if(randomNumber == 1 && Thread.currentThread().getName() == "black"){
                                        score = score + 2;
                                        System.out.println("yessssssss    black");
                                     }
                                     else if(randomNumber == 2 && Thread.currentThread().getName() == "blue"){
                                        score = score + 2;
                                        System.out.println("yessssssss    blue");
                                     }
                                     else if(randomNumber == 3 && Thread.currentThread().getName() == "yellow"){
                                         score = score + 2;
                                         System.out.println("yessssssss    yelloww");
                                     }
                                     else if(randomNumber == 4 && Thread.currentThread().getName() == "orange"){
                                         score = score + 2;
                                         System.out.println("yessssssss    orangeee");
                                     }
                                     else if(randomNumber == 5 && Thread.currentThread().getName() == "green"){
                                         score = score + 2;
                                         System.out.println("yessssssss    greeeen");
                                     }
                                     if(Thread.currentThread().getName() == "gold"){
                                        score = score + 15;
                                     }          
                                     if(sum == 5 && Thread.currentThread().getName() == "red"){
                                         score = score - 3;
                                         System.out.println("yessssssss    reddddd");
                                     }
                                     else if(sum == 2 && Thread.currentThread().getName() == "black"){
                                        score = score - 3;
                                        System.out.println("yessssssss    black");
                                     }
                                     else if(sum == 1 && Thread.currentThread().getName() == "blue"){
                                        score = score - 3;
                                        System.out.println("yessssssss    blue");
                                     }
                                     else if(sum == 4 && Thread.currentThread().getName() == "yellow"){
                                         score = score - 3;
                                         System.out.println("yessssssss    yelloww");
                                     }
                                     else if(sum == 6 && Thread.currentThread().getName() == "orange"){
                                         score = score - 3;
                                         System.out.println("yessssssss    orangeee");
                                     }
                                     else if(sum == 3 && Thread.currentThread().getName() == "green"){
                                         score = score - 3;
                                         System.out.println("yessssssss    greeeen");
                                     }
                                     
                                    ArrayList<Integer> my = new ArrayList<Integer>();
                                    score = score + 1;
                                    my.add(score);
                                    int k = my.get(0);
                                    System.out.println("score" + score);
                                    s = new frame(score , k);
                                    s.paint(randomNumber);
                                    s.rand(num, num2);
                                    randomNumber=rand.nextInt((5 - 0) + 1) + 0;
                                    num = rand.nextInt((3 - 0) + 1) + 0;
                                    num2 = rand.nextInt((3 - 1) + 1) + 1;
                                    s = new frame(score , k);
                                    s.paint(randomNumber);
                                    s.rand(num, num2);
                                    //score sco = new score(score);
                                    //paint(g , score);
                                    //f.paint(score);
                                    p.x_pos=0;
                                    p.y_pos=0;
                                    b.x_pos=1500;
                                    b.y_pos=1500;
                                    Timer timer = new Timer(500, new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            b.x_pos=rand.nextInt(500)+10;
                                             b.y_pos=rand.nextInt(300)+10;
                                        }
                                    });
                                    timer.setRepeats(false);
                                    timer.setDelay(500);
                                    timer.start();
                                 }
                      }
         }
    }
    
}
