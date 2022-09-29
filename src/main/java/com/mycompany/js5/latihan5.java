 // Created by 21343040_alixa arivya tofer
package com.mycompany.js5;
import javax.swing.JOptionPane;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class latihan5 {
    public static void main(String[] args){
        String name = "", hoby = "";
        
        name = JOptionPane.showInputDialog("Nama anda : ");
        hoby = JOptionPane.showInputDialog("Hobi anda : ");
        
        String msg = "Jadi hobi anda "+hoby+". "
                + "Hobi yang bagus " +name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi hobi anda " +hoby+ ". Hobi yang bagus " +name);
    }    
}
