
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engin
 */
public class soru5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("lütfen bir cümle giriniz: ");
      String txt= input.nextLine();
      int n = txt.length()/2;
        for (int i = 0; i < n; i++) {
          System.out.print((char)txt.charAt(n+i));
          System.out.print((char)txt.charAt((n-1)-i));
        }
        System.out.println();
    }
    
}
