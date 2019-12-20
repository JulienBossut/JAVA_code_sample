package vue;
import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
/**
 *
 * @author Lenovo
 */
public class Fenetre extends JFrame implements WindowListener{

    private BarreHaute bh;
    private BarreBasse bb;
    private ZoneGraphique zg;
    private BarreGauche bg;
    
    public Fenetre() {
        this.addWindowListener(this);
        this.setSize(600,400);
        this.setTitle("Paint");
        this.setLayout(new BorderLayout());
        zg = new ZoneGraphique(this);
        this.add(zg, BorderLayout.CENTER);
        bh = new BarreHaute(zg);
        this.add(bh, BorderLayout.NORTH);
        bg = new BarreGauche();
        this.add(bg, BorderLayout.WEST);
        bb = new BarreBasse();
        this.add(bb, BorderLayout.SOUTH);
        this.setVisible(true);

    }

    public BarreHaute getBh() {
        return bh;
    }

    public BarreBasse getBb() {
        return bb;
    }

    public ZoneGraphique getZg() {
        return zg;
    }

    
    
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
        }

    @Override
    public void windowClosed(WindowEvent e) {
        }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        }
    
    
    
    
    
}
