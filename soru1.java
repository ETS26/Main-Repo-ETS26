
import java.util.Scanner;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engin
 */
public class soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random r = new Random(); 
      Scanner input = new Scanner(System.in);
      System.out.println("lütfen küçük harflerle bir cümle giriniz: ");
      String txt= input.nextLine();
        for (int i = 0; i < txt.length(); i++) {
          if (r.nextBoolean())
          {
            System.out.print(Character.toUpperCase(txt.charAt(i)));
          }
          else 
          {
            System.out.print(Character.toLowerCase(txt.charAt(i)));
          }
        }
        System.out.println();
    }
    
}
