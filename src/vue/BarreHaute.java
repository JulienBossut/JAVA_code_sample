/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import tp7.Paint;

/**
 *
 * @author Lenovo
 */
public class BarreHaute extends JPanel implements ActionListener{
    
    private JComboBox lesFormes;
    private JComboBox lesCouleurs;
    private JButton beff;
    private JButton beffTout;
    private ZoneGraphique saZg;

    public BarreHaute(ZoneGraphique z) {
        saZg = z;
        //ici flow layout par défaut (comme tjrs)
        this.lesFormes = new JComboBox();
        this.lesFormes.addItem("Droite");
        this.lesFormes.addItem("Rectangle");
        this.lesFormes.addItem("Ovale");
                
        this.lesCouleurs = new JComboBox();
        this.lesCouleurs.addItem("Bleu");
        this.lesCouleurs.addItem("Noir");
        this.lesCouleurs.addItem("Rouge");
        
        this.beff = new JButton("Efface");
        this.beffTout = new JButton("Efface tout");
        this.add(lesFormes);
        this.add(lesCouleurs);
        this.add(beff);
        this.add(beffTout);
        
        this.beff.addActionListener(this);
        //this.beffTout.addActionListener(this);
        
        this.beffTout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                LinkedList list = Paint.getLesFormes();
                list.clear();
                saZg.repaint();
            }
        });
    }

    public JComboBox getLesFormes() {
        return lesFormes;
    }

    public JComboBox getLesCouleurs() {
        return lesCouleurs;
    }

    public JButton getBeff() {
        return beff;
    }

    public JButton getBeffTout() {
        return beffTout;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == beff){
            LinkedList list = Paint.getLesFormes();
            if(list.size()> 0 ){
                list.removeLast();
            }
        }
        //redessiner();
        saZg.repaint(); //appel de la méthode paint de zone graphique
    }
    
    
    
}
