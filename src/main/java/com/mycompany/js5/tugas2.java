 // Created by 21343040_alixa arivya tofer
package com.mycompany.js5;
import javax.swing.JOptionPane;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class tugas2 {
    public static void main(String args[]) {
        String word1 = "", word2 = "", word3 = "";
        
        word1 = JOptionPane.showInputDialog("Enter word1 : ");
        word2 = JOptionPane.showInputDialog("Enter word2 : ");
        word3 = JOptionPane.showInputDialog("Enter word3 : ");
        
        String msg = word1+ " " +word2+ " " +word3;
        
        JOptionPane.showMessageDialog(null, msg);
        
    }
}
