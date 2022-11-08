
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
public class soru6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.println("bir sayı giriniz");
          int n = input.nextInt();
          int toplam=0;
          
       while(n!=0)
       {
           int b= n*n;
           toplam= toplam+b;
           n=n-1;
           
          
          
       }
       System.out.println(toplam);
    }
    
}
