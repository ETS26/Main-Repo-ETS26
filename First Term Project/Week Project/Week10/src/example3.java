
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
     System.out.println("kaç elemanlı dizi olacağını yazınız: ");
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1)+". sayı: ");
            a[i]=input.nextInt();
        }
        dizi(a);
    }
    public static void dizi(int[] a){
        int min,max,minindex,maxindex;
        min = a[0];
        minindex=0;
        max = a[0];
        maxindex=0;
        for (int i = 0; i < a.length; i++) {
        if(min>a[i])
        {
            min=a[i];
            minindex=i;
        }
        if(max<a[i]) 
        {
            max=a[i];
            maxindex=i;
        }
        }
        System.out.println("Minimum sayı: "+min);
        System.out.println("Minimum sayının yeri: "+(minindex+1));
        System.out.println("Maksimum sayı: "+max);
        System.out.println("Maksimum sayının yeri: "+(maxindex+1));
        
    }
    
}
