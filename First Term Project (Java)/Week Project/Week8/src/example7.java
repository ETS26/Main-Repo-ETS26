
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
public class example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("lütfen bir ifade giriniz: ");
       String txt= input.nextLine();
       int x=txt.length()/2;
        for (int i = 0; i < x; i++) {
           System.out.print(Character.toLowerCase(txt.charAt(i)));
           System.out.print(Character.toLowerCase(txt.charAt(txt.length()-1-i))); 
        }
        if(txt.length() % 2 == 1)
        {
            System.out.print(Character.toLowerCase(txt.charAt(txt.length()/2)));
        }
         System.out.println();
    }
    
}
