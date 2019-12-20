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
public class Droite extends Forme {

    public Droite(Point pi, Point pf, Color c) {
        super(pi,pf,c);
    }

    
    
    @Override
    public void seDessiner(Graphics g) {
        g.setColor(this.getCouleur());
        g.drawLine((int)this.getPinit().getX(), (int)this.getPinit().getY(), (int)this.getPfin().getX(), (int)this.getPfin().getY());
    }
    
}
