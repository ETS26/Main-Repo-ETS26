/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author engin
 */
public class s1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Örnek 6.69
        int n;
        double aci,f,x,t=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Açı değeri giriniz: ");
        aci = input.nextDouble();
        System.out.println("Terim sayısı giriniz: ");
        n = input.nextInt();
        x = Math.toRadians(aci);
        for (int i = 1; i <= n-1; i++) {
          f=1;
          for (int j = 1; j <= 2*i; j++) {
           f*=j; 
          }
          t+=Math.pow(-1, i)*Math.pow(x,2*i)/f;
        }
         System.out.println("Seri açılımla hesaplanan değer: "+t);
         System.out.println("komutla hesaplanan değer: "+Math.cos(x));
    }
    
}
