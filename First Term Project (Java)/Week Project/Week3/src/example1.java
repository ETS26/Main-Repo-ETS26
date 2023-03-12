
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
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // başla
        // n sayısı gir
        // s=1 ve tek=0 ve çift=0
        // s<=n değilse adım 8.adıma git 
        // s%2=1 ise 5. adıma git değilse 6.adıma git
        // tek=tek+s 
        // çift = çift +s  
        // s=s+1 4. adıma git
        // toplam yazdır
        // bitir
       Scanner input = new Scanner(System.in);
          System.out.println("bir sayı giriniz");
          int n = input.nextInt();
          int tek=0,cift=0;
          int s=1;
       while(s<=n)
       {
           if(s%2==1)
         {
          tek=tek+s;
          
         }
           else
           {
               cift=cift+s;
           }
            s=s+1;
          
          
          
           }
            if(s%2==1)System.out.println(cift);
           else System.out.println(tek);
        
    }
    
}
