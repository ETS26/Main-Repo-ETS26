
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
public class soru3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("kaçıncı dereceden olacağını yazınız: ");
      int n = input.nextInt();
      int[] a = new int[n+1];
        for (int i = 0; i < a.length; i++) {
            System.out.println("x^"+i+" nin katsayısını: ");
            a[i]= input.nextInt();
        }
        System.out.println("x değerini giriniz: ");
        int b = input.nextInt();
        int t = a[0];
        for (int i = 1; i < a.length; i++) {
           t+=a[i]*(Math.pow(b,i)); 
        }
        System.out.println("Polinomun değeri: "+t);
    }
    
}
