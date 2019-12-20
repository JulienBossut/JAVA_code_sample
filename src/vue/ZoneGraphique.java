/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.EcouteurZoneGraphique;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import modele.Forme;
import tp7.Paint;

/**
 *
 * @author Lenovo
 */
public class ZoneGraphique extends Canvas{

    private Fenetre saFenetre;
    
    public ZoneGraphique(Fenetre f) {
        EcouteurZoneGraphique ezg = new EcouteurZoneGraphique(this);
        this.addMouseListener(ezg);
        this.addMouseMotionListener(ezg);
        this.setBackground(Color.white);
        this.saFenetre = f;
    }

    public Fenetre getSaFenetre() {
        return saFenetre;
    }
    
    @Override
    public void paint(Graphics g){
        for(Forme f : Paint.getLesFormes()){
            f.seDessiner(g);
        }
    }
    
}
