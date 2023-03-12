
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
       System.out.println("A'nın satır sayısını giriniz");
       int n = input.nextInt();
       System.out.println("A'nın sütun sayısını giriniz");
       int m = input.nextInt();
       System.out.println("B'nin satır sayısı ile A'nın sutun sayısı eşit olmalıdır");
       int n1 = m;
       System.out.println("B'nin sütun sayısını giriniz");
       int m1 = input.nextInt();
       int[][] a=new int[n][m];
       int[][] b=new int[n1][m1];
       int[][] t=new int[n][m1];
       System.out.println("A matrisi: ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(i+1 +" inci satır ve "+(j+1)+" inci sutun: ");
               a[i][j]=input.nextInt();
            }
        }
        System.out.println("B matrisi: ");
        for (int i = 0; i < n1 ; i++) {
            for (int j = 0; j < m1; j++) {
               System.out.print(i+1 +" inci satır ve "+(j+1)+" inci sutun: ");
               b[i][j]=input.nextInt();
            }
        }
        System.out.println("AxB matrisi: ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n1; k++) {
                  t[i][j]+= a[i][k] * b[k][j];  
                }
               
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m1; j++) {
               System.out.print(t[i][j]+" ");
            }
        }
        System.out.println();
    }
    
}
