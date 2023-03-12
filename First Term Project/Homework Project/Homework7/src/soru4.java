
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
public class soru4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("kaç elemanlı dizi olacağını yazınız: ");
      int n = input.nextInt();
      int[] a = new int[n];
       for (int i = 0; i < a.length; i++) {
            System.out.println(i+1+". elemanı giriniz");
            a[i]= input.nextInt();
       }
       int x=0,y=0;
       int[] b = new int[x];
       int[] c = new int[y];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0)
            {
                b[x]=a[i];
                x++;
                System.out.println(b[x]);
            }
            else
            {
                c[y]=a[i];
                y++;
                System.out.println(c[y]);
            }
        }
    }
    
}
