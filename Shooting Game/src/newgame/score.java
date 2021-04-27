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
import javax.swing.JFrame;
import javax.swing.JLabel;

public class score extends JFrame{
    private static int score ;
    screen screen;
    public score(int score){
        super("ball game");
               
    }
    public void paint(int score){
            //g.drawString("Score: " + score, 10, 10);	
            System.out.println(score);
	}
    public class screen extends JLabel {
        protected void paintComponent(Graphics g) {
         super.paintComponent(g);
          //set color for frame 
          // g.setColor(Color.yellow);
          //g.fillRect(0, 0, 400, 400);
          score = score +1;
          g.drawString("Score: " + score, 30, 60);
        }     
    }
}
