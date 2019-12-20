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
public class Ovale extends Forme{
    public Ovale(Point pi, Point pf, Color c) {
        super(pi,pf,c);
    }

    
    
    @Override
    public void seDessiner(Graphics g) {
        g.setColor(this.getCouleur());
        g.drawOval((int)(Math.min(this.getPinit().getX(), this.getPfin().getX())),(int)(Math.min(this.getPinit().getY(), this.getPfin().getY())),(int)(Math.abs(this.getPinit().getX() - this.getPfin().getX())),(int)(Math.abs(this.getPinit().getY() - this.getPfin().getY())));
    }
    
}
