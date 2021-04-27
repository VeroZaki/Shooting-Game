/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import static newgame.NewClass.randomNumber;
import java.util.Random;

public class createShip implements Runnable  {
    private final Object lock = new Object();
    ship p;
    frame f;
     boolean flag = true;
     int randomNumber;
     Random rand = new Random();
    public createShip(ship p,  frame f) {
        this.p = p;
        this.f = f;
    }

public void run(){
    try{
             synchronized(lock){ 
                  f.addKeyListener(new KeyListener() {
                  @Override
                  public synchronized void keyPressed(KeyEvent e) {
                  int key = e.getKeyCode();
                        if (key == 39 && p.x_pos<700) {
                            p.updateright();
                        }
                        if(key == 37 && p.x_pos>0){
                            p.updateleft();
                        } 
                        
                            
                    
                  }
                  
                  @Override
                  public synchronized void keyTyped(KeyEvent e) {
                      
                  }

                  @Override
                  public synchronized void keyReleased(KeyEvent e) {
                    
                  }
                  
             
              });}
                             
          }
          catch (NullPointerException e){
                                  System.out.println(e);
                              }
  
}
}
