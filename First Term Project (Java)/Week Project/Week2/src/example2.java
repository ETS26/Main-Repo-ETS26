/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engin
 */
import java.util.Scanner;
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.println("1.sayıyı giriniz");
          double sayi1 = input.nextDouble();
          System.out.println("2.sayıyı giriniz");
          double sayi2 = input.nextDouble();
          System.out.println("3.sayıyı giriniz");
          double sayi3 = input.nextDouble();
          if(sayi1>sayi2 & sayi1>sayi3)
          {
              System.out.println("en büyük 1.sayı");
          }
          else if(sayi2>sayi1 & sayi2>sayi3)
          {
              System.out.println("en büyük 2.sayı");
          }
           else if(sayi3>sayi1 & sayi3>sayi2)
          {
              System.out.println("en büyük 3.sayı");
          }
          else
           {
               System.out.println("üstünlük yok");
           }
    }
    
}
