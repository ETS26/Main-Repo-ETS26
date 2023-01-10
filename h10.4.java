
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
public class s4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] dizi=dizitop();
        
    }
    public static int[][] dizitop(){
      System.out.println("nxn yazınız: ");
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int[][] a = new int[n][n];
      int[][] b = new int[n][n];
      int[][] c = new int[n][n];
        System.out.println("1.matrisi girin: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              System.out.print((i+1)+" inci satır "+(j+1)+" inci sütun: ");
               a[i][j]=input.nextInt(); 
            }
           
        }
        System.out.println("2.matrisi girin: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              System.out.print((i+1)+" inci satır "+(j+1)+" inci sütun: ");
               b[i][j]=input.nextInt(); 
            }
           
        }
        System.out.println("Toplam matrisi: ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
               c[i][j]=a[i][j]+b[i][j];
               System.out.println((i+1)+" inci satır "+(j+1)+" inci sütun: "+c[i][j]);
               
            }
            
        }
        
       return c;
    }
    
}
