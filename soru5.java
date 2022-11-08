
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
public class soru5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.println("bir pozitif tam sayı giriniz");
          int a = input.nextInt();
          System.out.println("bir pozitif tam sayı daha giriniz");
          int b = input.nextInt();
          int s=0;
          int sonuc=0;
       while(a>0 && b>0 && s<b)
       {
           s=s+1;
           
          sonuc=sonuc+a;
           
           
       }
       System.out.println(sonuc);
    }
    
}
