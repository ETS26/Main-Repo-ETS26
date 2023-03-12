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
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("bir sayı giriniz");
          double sayi = input.nextDouble();
          if(sayi%2==0)
          {
              System.out.println("çift");
          }
          else
          {
              System.out.println("tek");
          }
    }
    
}
