
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
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t=0,gecen=0,kalan=0;
        double ort;
     Scanner input = new Scanner(System.in);
     System.out.println("Sınıfta kaç kişi olacağını yazınız: ");
     int n = input.nextInt();
     int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1)+". öğrencinin notu: ");
            a[i]=input.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            t+=a[i];
        }
        ort =(double) t/n;
        System.out.println("Sınıf ortalaması: "+ort);
        for (int i = 0; i < a.length; i++) {
          if(a[i]>=ort)
          {
           System.out.println(i+1+". öğrenci geçti"); 
           gecen++;
          }
          else
          { 
            System.out.println(i+1+". öğrenci kaldı");
            kalan++;
          } 
        }
        System.out.println("Geçen öğrenci sayısı: "+gecen);
        System.out.println("Kalan öğrenci sayısı: "+kalan);
    }
    
}
