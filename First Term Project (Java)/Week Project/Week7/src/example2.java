
import java.util.Arrays;
import java.util.Random;
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
     Scanner input = new Scanner(System.in);
     System.out.println("kaç elemanlı dizi olacağını yazınız: ");
     int n = input.nextInt();
     int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1)+" inci sayı: ");
            a[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length/2; i++) {
            int g = a[i];
            a[i]=a[n-1-i];
            a[n-1-i]= g;
        }
       System.out.println(Arrays.toString(a));
    }
    
}
