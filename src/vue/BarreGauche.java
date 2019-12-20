/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

/**
 *
 * @author Lenovo
 */
public class BarreGauche extends JPanel {

    private JCheckBox cb;
    
    public BarreGauche() {
        GridLayout gl = new GridLayout(4,1);
        this.setLayout(gl);
    }
    
    
}
