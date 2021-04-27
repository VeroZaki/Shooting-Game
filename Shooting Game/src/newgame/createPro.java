/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class createPro implements Runnable {
    projectile p;
    frame f;

    public createPro(projectile p, frame f) {
        this.p = p;
        this.f = f;
    }
    
private final Object lock = new Object();

public void run(){
    while(p.y_pos>0){
        
               try{
                              p.update();
                                
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
              
                
          
    }
    p.y_pos=620;
    }
}

