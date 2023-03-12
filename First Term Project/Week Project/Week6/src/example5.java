
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
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int top=0;
     float ort=0;
     Scanner input = new Scanner(System.in);
     System.out.println("kaç elemanlı dizi olacağını yazınız: ");
     int n = input.nextInt();
     int[] a = new int[n];
     //System.out.println(a[a.length-1]);
     //System.out.println(a.length);
        for (int i = 0; i <= a.length-1; i++) {
            System.out.print((i+1)+" inci sayı: ");
            a[i]=input.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            top = top + a[i];
            ort = (float)top/a.length;
             System.out.println(a[i]);
        }
        System.out.println("Toplam: "+top);
        System.out.println("Ortalama: "+ort);
    }
    
}
