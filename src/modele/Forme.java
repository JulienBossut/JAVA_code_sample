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
public abstract class Forme {
    private Point pinit;
    private Point pfin;
    Color couleur;

    public Forme(Point pinit, Point pfin, Color couleur) {
        this.pinit = pinit;
        this.pfin = pfin;
        this.couleur = couleur;
    }

    
    
    public Point getPinit() {
        return pinit;
    }

    public Point getPfin() {
        return pfin;
    }

    public Color getCouleur() {
        return couleur;
    }
    
    
    public abstract void seDessiner(Graphics g);
}
