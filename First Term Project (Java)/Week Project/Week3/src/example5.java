
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
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz");
          int a = input.nextInt();
          int toplam=0;
         while(a>0)
       {
          int kalan=a%10;
          toplam=toplam+kalan;
          a=a/10;
          
            
       }
         System.out.println(toplam);
         
    }
    
}
