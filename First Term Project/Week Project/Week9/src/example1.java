
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
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("satır sayısını giriniz");
       int n = input.nextInt();
       System.out.println("sutun sayısını giriniz");
       int m = input.nextInt();
       int[][] a=new int[n][m];
       int[][] b=new int[n][m];
       int[][] t=new int[n][m];
       System.out.println("A matrisi: ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(i+1 +" inci satır ve "+(j+1)+" inci sutun: ");
               a[i][j]=input.nextInt();
            }
        }
        System.out.println("B matrisi: ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(i+1 +" inci satır ve "+(j+1)+" inci sutun: ");
               b[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
               t[i][j]=a[i][j]+b[i][j];
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(t[i][j]+" ");
            }
        }
        System.out.println();
    }
    
}
