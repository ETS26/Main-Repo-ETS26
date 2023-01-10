
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
public class soru5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
       Scanner input = new Scanner(System.in);
       System.out.println("A matrisi için n sayısını giriniz");
       int n = input.nextInt();
       int[][] a=new int[n][n];
       int[] b=new int[n];
       System.out.println("A matrisi: ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print(i+1 +" inci satır ve "+(j+1)+" inci sutun: ");
               a[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int carp=1;
            for (int j = 0; j < n; j++) {
              carp*=a[j][i];
            }
            b[i]+=carp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
    }
    
}
