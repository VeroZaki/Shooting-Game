/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgame;

import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class projectile extends JPanel {
    float x_pos;
    float y_pos;
    BufferedImage proo;
    ship ships;

    public projectile(float x_pos, float y_pos, BufferedImage proo, ship ships) {
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.proo = proo;
        this.ships = ships;
    }
    public void update(){
        y_pos = y_pos - 10; // sor3it al tal2a
        x_pos = ships.x_pos;
    }
}
