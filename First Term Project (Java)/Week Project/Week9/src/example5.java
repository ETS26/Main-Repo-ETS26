/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author engin
 */
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random r = new Random();
      Scanner input = new Scanner(System.in);
      System.out.println("Ders sayısını giriniz");
       int m = input.nextInt();
       System.out.println("Öğrenci sayısını giriniz");
       int n = input.nextInt();
       int[][] notlar = new int[m][n];
       int[] ogrencino = new int[n];
       double[] ortalamalar = new double[m];
       int[][] rapor = new int[m][4];
        for (int i = 0; i < n; i++) {
           ogrencino[i]=(int)(10000+(20000-10000)*r.nextDouble()); 
        }
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
               notlar[i][j]=r.nextInt(100);
            }
            
        }
        for (int i = 0; i < m ; i++) {
            int toplam=0;
            for (int j = 0; j < n; j++) {
               toplam+=notlar[i][j];
            }
            ortalamalar[i]= (double) toplam/n;
        }
        for (int i = 0; i < m ; i++) {
            int max= notlar[i][0],min=notlar[i][0];
            int maxid=0,minid=0;
            for (int j = 0; j < n; j++) {
                if(notlar[i][j]>max)
                {
                    max = notlar[i][j];
                    maxid = ogrencino[j];
                }
                if(notlar[i][j]<min)
                {
                    min = notlar[i][j];
                    minid = ogrencino[j];
                }
            }
            rapor[i][0]=max; rapor[i][1]=maxid; rapor[i][2]=min; rapor[i][3]=minid;
            System.out.println(max);
            System.out.println(maxid);
            System.out.println(min);
            System.out.println(max);
        }
        
    }
    
}
