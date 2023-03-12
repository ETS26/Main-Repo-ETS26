/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author engin
 */
public class soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int sc=0;   
     Scanner input = new Scanner(System.in);
     System.out.println("kaç elemanlı diziler olacağını yazınız: ");
     int n = input.nextInt();
     int[] a = new int[n];
     int[] b = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+". elemanı yazınız: ");
             a[i]=input.nextInt();  
        }
        for (int i = 0; i < b.length; i++) {
             System.out.println((i+1)+". elemanı yazınız: ");
             b[i]=input.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
           sc+=a[i]*b[i]; 
        }
        System.out.println("Skaler Çarpım: "+sc);
    }
    
}
