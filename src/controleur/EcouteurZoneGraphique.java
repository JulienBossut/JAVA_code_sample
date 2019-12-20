/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import modele.Droite;
import modele.Ovale;
import modele.Rectangle;
import tp7.Paint;
import vue.ZoneGraphique;

/**
 *
 * @author Lenovo
 */
public class EcouteurZoneGraphique implements MouseListener, MouseMotionListener{

    private ZoneGraphique sazg;
    private Point pinit;
    private Point pfin;
    
    public EcouteurZoneGraphique(ZoneGraphique z) {
        sazg = z;
    }

    
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("press");
        pinit = new Point(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("release");
        pfin = new Point(e.getX(), e.getY());
        Color laBonneCouleur = Color.red;
        switch(this.sazg.getSaFenetre().getBh().getLesCouleurs().getSelectedIndex()){
            case 2 : laBonneCouleur = Color.red; break;
            case 1 : laBonneCouleur = Color.black; break;
            case 0 : laBonneCouleur = Color.blue; break;
        }
        Graphics A4 = this.sazg.getGraphics();
        switch(this.sazg.getSaFenetre().getBh().getLesFormes().getSelectedIndex()){
            case 0 :
                Droite d = new Droite(pinit,pfin,laBonneCouleur);
                d.seDessiner(A4);
                Paint.getLesFormes().addLast(d);
                break;
            case 1 :
                Rectangle r = new Rectangle(pinit,pfin,laBonneCouleur);
                r.seDessiner(A4);
                Paint.getLesFormes().addLast(r);
                break;   
            case 2 :
                Ovale o = new Ovale(pinit,pfin,laBonneCouleur);
                o.seDessiner(A4);
                Paint.getLesFormes().addLast(o);
                break;    
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        }

    @Override
    public void mouseExited(MouseEvent e) {
        }

    @Override
    public void mouseDragged(MouseEvent e) {
        }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("ok mon pote");
        this.sazg.getSaFenetre().getBb().getLabX().setText("X=" + e.getX());
        this.sazg.getSaFenetre().getBb().getLabY().setText("Y=" + e.getY());
    }
    
}
