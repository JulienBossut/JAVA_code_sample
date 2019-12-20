/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;
import java.util.LinkedList;
import modele.Forme;
import vue.Fenetre;
/**
 *
 * @author Lenovo
 */
public class Paint {

    /**
     * @param args the command line arguments
     */
    
    private static LinkedList<Forme> LesFormes = new LinkedList<>();

    public static LinkedList<Forme> getLesFormes() {
        return LesFormes;
    }
    
    
    
    public static void main(String[] args) {
        Fenetre f = new Fenetre();
        
    }
    
}
