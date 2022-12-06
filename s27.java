
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
public class s27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.99
       Scanner inp = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        int a = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int b = inp.nextInt();
        int a1=a/10;
        int a0=a%10;
        int b1=b/10;
        int b0=b%10;
        if((a1==b1)&&(a0+b0==10))
        {
          System.out.println("Bağdaşık sayılar"); 
        }
        else System.out.println("Bağdaşık sayılar değiller"); 
    }
    
}
