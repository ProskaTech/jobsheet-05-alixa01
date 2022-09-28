 // Created by 21343040_alixa arivya tofer
package com.mycompany.js5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class latihan3 {
    public static void main(String args[]) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name = "", hoby = "";
        
        try {
            System.out.print("Nama anda : ");
            name = dataIn.readLine();
            System.out.print("Hobi anda : ");
            hoby = dataIn.readLine();
        }
        
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
        System.out.println("Jadi hobi anda " +hoby+ ". Hobi yang bagus " +name );
    }
}
