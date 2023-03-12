
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
public class s5 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("lb giriniz");
      int lb = input.nextInt();
      System.out.println("ub giriniz");
      int ub = input.nextInt();
      int[][] dizi=dizitop(lb,ub);
        
    }
    public static int[][] dizitop(int lb,int ub){
      Random rnd = new Random();
      System.out.println("nxn yazınız: ");
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int[][] a = new int[n][n];
        System.out.println("matrisi girin: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               a[i][j]=rnd.nextInt(ub-lb)+lb; 
               System.out.println((i+1)+" inci satır "+(j+1)+" inci sütun: "+a[i][j]);
            }
        }
       return a;
    }
    
}
