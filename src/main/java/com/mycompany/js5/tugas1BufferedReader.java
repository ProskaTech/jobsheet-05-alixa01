 // Created by 21343040_alixa arivya tofer
package com.mycompany.js5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class tugas1BufferedReader {
    public static void main(String args[]) {
        BufferedReader dataIn = new BufferedReader ( new InputStreamReader (System.in));
        
        String word1 = "", word2 = "", word3 = "";
        
        try {
            System.out.print("Enter word1 : ");
            word1 = dataIn.readLine();
            System.out.print("Enter word2 : ");
            word2 = dataIn.readLine();
            System.out.print("Enter word3 : ");
            word3 = dataIn.readLine();
        }
        
        catch (IOException e) {
            System.out.println("gagal membaca ");
        }
        System.out.println(word1+ " " +word2+ " " +word3);
    }
}
