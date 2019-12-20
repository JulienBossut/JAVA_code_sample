/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class BarreBasse extends JPanel{
    private JLabel message;
    private JLabel x;
    private JLabel y;

    public BarreBasse() {
        GridLayout gl = new GridLayout(1,2);
        this.setLayout(gl);
        
        JPanel jp = new JPanel();
        x = new JLabel("X=    0");
        jp.add(x);
        y = new JLabel("Y=    0");
        jp.add(y);
        this.add(jp);
    }

    public JLabel getMessage() {
        return message;
    }

    public JLabel getLabX() {
        return x;
    }

    public JLabel getLabY() {
        return y;
    }
    
    
    
    
    
}
