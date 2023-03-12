c

import java.util.Random;
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
      System.out.println("Ders sayısını giriniz");
      int m = input.nextInt();
      System.out.println("Öğrenci sayısını giriniz");
      int n = input.nextInt();
      System.out.println("lb giriniz");
      int lb = input.nextInt();
      System.out.println("ub giriniz");
      int ub = input.nextInt();
      
      int[] ogrnumara= ogrno(lb,ub,n);
      goster(ogrnumara);
      
      int[][] notlar= not(m,n);
      goster(notlar);
      
      double[] ortalamalar = ort(m,n);
      goster(ortalamalar);
      
      int[][] maxmin = maxmin_grades(notlar,ogrnumara);
      goster(maxmin);
    }
    public static int[] ogrno(int lb,int ub,int n){
        Random r = new Random();
        int[] ogrencino = new int[n];
        for (int i = 0; i < n; i++) {
           ogrencino[i]=(int) (lb +(ub-lb)*r.nextDouble()); 
        }
        return ogrencino;
        
    }
    
   public static int[][] not(int m,int n){
       int[][] notlar = new int[m][n];
       Random r = new Random();
       for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
               notlar[i][j]=r.nextInt(101);
            }
           
        }
       return notlar;
   }
   public static double[] ort(int m,int n){
       int[][] grade = new int[m][n];
       double[] ortalama = new double[m]; 
       for (int i = 0; i < m ; i++) {
            int toplam=0;
            for (int j = 0; j < n; j++) {
               toplam+=grade[i][j];
            }
            ortalama[i]= (double) toplam/n;
            
        }
        return ortalama;
        
    }
   public static int[][] maxmin_grades(int[][] notlar,int [] ogrencino){
       int m = notlar.length;
       int n = notlar[0].length;
       int[][] rapor = new int[m][4];
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
     }
       return rapor;
   }
       
     public static void goster(int[] array){
      
        for (int i = 0; i < array.length; i++) {
           System.out.println((i+1) +" inci eleman: "+array[i]);
        }
       
    }
     public static void goster(double[] array){
      
        for (int i = 0; i < array.length; i++) {
           System.out.println((i+1) +" inci eleman: "+array[i]);
        }
       
    }
     public static void goster(int[][] array){
       int row= array.length;
       int col = array[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
              System.out.println((i+1) +" , "+(j+1)+" eleman "+array[i][j]);
            }
           
        }
       
    }
}
