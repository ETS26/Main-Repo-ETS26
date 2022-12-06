
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
public class s2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Örnek 6.70
        int n;
        double aci,f,x,t=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Açı değeri giriniz: ");
        aci = input.nextDouble();
        System.out.println("Terim sayısı giriniz: ");
        n = input.nextInt();
        x = Math.toRadians(aci);
        for (int i = 1; i <= n; i++) {
          f=1;
          for (int j = 1; j <= (2*i)-1; j++) {
           f*=j; 
          }
          t+=Math.pow(-1, i-1)*Math.pow(x,(2*i)-1)/f;
        }
         System.out.println("Seri açılımla hesaplanan değer: "+t);
         System.out.println("komutla hesaplanan değer: "+Math.sin(x));
    }
    
}
