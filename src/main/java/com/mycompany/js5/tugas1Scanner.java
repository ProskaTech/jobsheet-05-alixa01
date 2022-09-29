 // Created by 21343040_alixa arivya tofer
package com.mycompany.js5;
import java.util.Scanner;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class tugas1Scanner {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        String word1 = "", word2 = "", word3 = "";
        
        System.out.print("Enter word 1 : ");
        word1 = in.nextLine();
        
        System.out.print("Enter word 2 : ");
        word2 = in.nextLine();
        
        System.out.print("Enter word 3 : ");
        word3 = in.nextLine();
        
        System.out.println(word1+ " " +word2+ " " +word3);
        
    }
}
