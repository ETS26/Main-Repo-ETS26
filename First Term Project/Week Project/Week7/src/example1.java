
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engin
 */
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int min,max,minindex,maxindex;   
     Random r = new Random();
     Scanner input = new Scanner(System.in);
     System.out.println("kaç elemanlı dizi olacağını yazınız: ");
     int n = input.nextInt();
     int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
             a[i]=r.nextInt(100);
             System.out.print("{"+a[i]+"},");
        }
        System.out.println();
        //System.out.println(Arrays.toString(a));//dizinin elemanlarını gösterir
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
        System.out.println("Minimum sayının adresi: "+(minindex+1));
        System.out.println("Maksimum sayı: "+max);
        System.out.println("Maksimum sayının adresi: "+(maxindex+1));
        
    }
    
}
