
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
       System.out.println("A ve B matrisleri için n sayısını giriniz");
       int n = input.nextInt();
       int[][] a=new int[n][n];
       int[][] b=new int[n][n];
       System.out.println("A matrisi: ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print(i+1 +" inci satır ve "+(j+1)+" inci sutun: ");
               a[i][j]=input.nextInt();
            }
        }
        System.out.println("B matrisi: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i<j)
                {
                    b[i][j]=0;
                }
                else
                {
                   b[i][j]=a[i][j]; 
                }
                System.out.println(b[i][j]+"  --> "+(i+1)+". satır "+(j+1)+". sütun ");
            }
        }
    }
    
}
