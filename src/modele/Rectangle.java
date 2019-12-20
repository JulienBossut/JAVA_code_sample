/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Lenovo
 */
public class Rectangle extends Forme {
    public Rectangle(Point pi, Point pf, Color c) {
        super(pi,pf,c);
    }

    
    
    @Override
    public void seDessiner(Graphics g) {
        g.setColor(this.getCouleur());
        g.drawRect((int)(Math.min(this.getPinit().getX(), this.getPfin().getX())),(int)(Math.min(this.getPinit().getY(), this.getPfin().getY())),(int)(Math.abs(this.getPinit().getX() - this.getPfin().getX())),(int)(Math.abs(this.getPinit().getY() - this.getPfin().getY())));
    }
    
}
