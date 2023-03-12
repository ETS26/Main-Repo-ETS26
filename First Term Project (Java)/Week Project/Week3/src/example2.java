
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
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // başla
        // n sayısı gir
        // s=1 ve toplam=1 
        // s<=n değilse adım 7.adıma git 
        // toplam=toplam*s  
        // s=s+1 4. adıma git
        // toplam yazdır
        // bitir
        //Scanner input = new Scanner(System.in);
        //System.out.println("bir sayı giriniz");
        //  int n = input.nextInt();
         // int toplam=1;
        //  int s=1;
      // while(s<=n)
       //{
        //  toplam=toplam*s;
        //    s=s+1;
       //}
            Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
          int n = input.nextInt();
          int toplam=1;
          
       for(int s=1;s<=n;s++)
       {
          toplam=toplam*s;
            
       }
            System.out.println(toplam);
        
    }
    
}
