 // Created by 21343040_alixa arivya tofer
package com.mycompany.js5;
import java.util.Scanner;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class latihan1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        String name = "";
        int nim;
        float nilai;
        
        System.out.print("Masukkan nama lengkap :");
        name = in.nextLine();
        
        System.out.print("Masukkan nim :");
        nim= in.nextInt();
        
        System.out.print("Masukkan nilai : ");
        nilai = in.nextFloat();
        
        System.out.println("\n Nama : " +name +
                           "\n nim : " +nim +
                           "\n nilai : " +nilai);
    }
}
