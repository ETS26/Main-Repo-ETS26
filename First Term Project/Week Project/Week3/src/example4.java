
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
        System.out.println("alt sınır giriniz");
          int a = input.nextInt();
          System.out.println("üst sınır giriniz");
          int b = input.nextInt();
         for(int s=a;s<b;s++)
       {
          if(s%3==0 || s%4==0)
          {
              System.out.println(s);
          }
          
            
       }
    }
    
}
