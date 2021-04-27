/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgame;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class ship extends JPanel {
    float x_pos;
    float y_pos;
    BufferedImage shipo;

    public ship(){
        
    }
    public ship(float x_pos, float y_pos,  BufferedImage shipo) {
        this.x_pos = x_pos;
        this.y_pos = y_pos;  
        this.shipo = shipo;
    }

    public void updateright(){
        x_pos=x_pos+50;

    }
    public void updateleft(){
        x_pos= x_pos-50;
    }
    
    public void randright(){
        Random random = new Random();
        int n = random.nextInt();
        x_pos= n;
    }
     public void randleft(){
        Random random = new Random();
        int m = random.nextInt();
        x_pos= 200 - 50 ;
        
    }
    
}
