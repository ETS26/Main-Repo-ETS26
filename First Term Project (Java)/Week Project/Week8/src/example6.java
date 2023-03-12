
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
public class example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("lütfen bir ifade giriniz: ");
       String txt= input.nextLine();
        for (int i = 0; i < txt.length(); i++) {
            System.out.print(txt.charAt(i));
            System.out.print(i+1);
        }
        System.out.println();
    }
    
}
