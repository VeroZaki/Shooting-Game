/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgame;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Ball extends JPanel {
    float x_pos;
    float y_pos;
    float x_speed;
    float y_speed;
     
    BufferedImage play_ball;

    public Ball( BufferedImage play_ball,float x_pos, float y_pos,float x_speed,float y_speed) {
        this.x_pos = x_pos;
        this.play_ball=play_ball;
        this.y_pos = y_pos;
        this.x_speed=x_speed;
        this.y_speed=y_speed;
         
    }
    //to ubdate the pos x to make ball move in x pos
    public void update()
    {
        x_pos=x_pos+x_speed;
        y_pos=y_pos+y_speed;
        // 3ashan a3mal 7dod el frame 
        //getwidth&getheight 3ashan fe frame beta3 el ball
        //ya3ne fe frame lel ball 7awleha
       if (x_pos<0)
           x_speed *=-1;
       if(x_pos+play_ball.getWidth()>800)
             x_speed *=-1;
        if (y_pos<0)
           y_speed *=-1;
       if(y_pos+play_ball.getHeight()>550)
             y_speed *=-1;
        
        
        
    }
   

   
    
    
}
