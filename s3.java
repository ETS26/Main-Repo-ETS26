
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
public class s3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] dizi=siralama();
        
    }
    public static int[] siralama(){
      System.out.println("kaç elemanlı dizi olacağını yazınız: ");
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1)+" inci sayı: ");
            a[i]=input.nextInt();
        }
        int s=0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i+1; j < a.length; j++)
            {
                if(a[j] < a[i]) {
                    s = a[i];
                    a[i] = a[j];
                    a[j] = s;
                }
            }
            System.out.print(a[i]+" > ");
        }
       return a;
    }
    
}
