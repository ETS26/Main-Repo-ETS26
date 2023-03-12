
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
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("lütfen bir ifade giriniz: ");
      String txt= input.nextLine();
      int s=0;
        for (int i = txt.length()-1; i >= 0 ; i--) {
           if(s%2==0)
           {
               
               System.out.print(Character.toLowerCase(txt.charAt(i)));
           }
           else
           {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
           }
           
           s++;
        }
         System.out.println();
    }
    
}
