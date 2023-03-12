
import java.util.Arrays;
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
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("kaç elemanlı olacağını yazınız: ");
     int n = input.nextInt();
     int[] a = new int[n];
     a[0]=1;
     a[1]=1;
        for (int i = 2; i < a.length; i++) {
           int yeni =a[i-1]+a[i-2];
           a[i]=yeni;
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if(i==a.length-1)
            {
              System.out.print(a[i]);  
            }
            else
            {
              System.out.print(a[i]+", ");   
            }
        }
        System.out.println("]");
        System.out.println(); 
    }
    
}
