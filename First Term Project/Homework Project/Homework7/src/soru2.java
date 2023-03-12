
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
public class soru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double t=0,c=1,ht=0,kt=0; 
     Scanner input = new Scanner(System.in);
     System.out.println("kaç elemanlı diziler olacağını yazınız: ");
     int n = input.nextInt();
     int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println(i+1+". elemanı giriniz");
            a[i]= input.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
           t+=a[i];
           c*=a[i];
           ht+=(1/a[i]);
           kt+=Math.pow(a[i],2);
        }
        double ar=t/n;
        double geo=Math.pow(c,Math.sqrt(n));
        double har=n/ht;
        double kont=kt/t;
        System.out.println("aritmetik ortalama: "+ar);
        System.out.println("geometrik ortalama: "+geo);
        System.out.println("harmonik ortalama: "+har);
        System.out.println("kontraharnonik ortalama: "+kont);
    }
    
}
