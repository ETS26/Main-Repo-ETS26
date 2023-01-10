
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
public class soru7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("lütfen küçük harflerle bir cümle giriniz: ");
      String txt= input.nextLine();
        for (int i = 0; i < txt.length()/2; i++) {
            System.out.print((char)txt.charAt((txt.length()/2-1)-i));
        }
        for (int i = 0; i < txt.length()/2; i++) {
            System.out.print((char)txt.charAt((txt.length()-1)-i));
        }
        System.out.println();
    }
    
}
