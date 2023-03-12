
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
     
     System.out.println("kaç elemanlı dizi olacağını yazınız: ");
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1)+" inci sayı: ");
            a[i]=input.nextInt();
        }
       dizimetot(a);
     
    }
    public static double dizimetot(int[] a){
       int top=0;
        for (int i = 0; i < a.length; i++) {
            top+=a[i];
        }
        double ort =(double) top/a.length;
        System.out.println("Ortalama: "+ort);
        return ort;
        
    } 
    
}
