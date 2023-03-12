
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
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int enksatir=0,enksutun=0,enbsatir=0,enbsutun=0;
       Scanner input = new Scanner(System.in);
       System.out.println("n sayısını giriniz");
       int n = input.nextInt();
       int[][] a=new int[n][n];
       System.out.println("A matrisi: ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print(i+1 +" inci satır ve "+(j+1)+" inci sutun: ");
               a[i][j]=input.nextInt();
            }
        }
        int enk=a[0][0];
        int enb=a[0][0];
        
        
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
               if(a[i][j]>enb)
               {
                   enb=a[i][j];
                   enbsatir=i;
                   enbsutun=j;
               }
               
            }
        }
         for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
               if(a[i][j]<enk)
               {
                   enk=a[i][j];
                   enksatir=i;
                   enksutun=j;
               }
            }
        }
        System.out.println();
        System.out.println("max element: "+enb+" ve indisi "+enbsatir+","+enbsutun);
        System.out.println("min element: "+enk+" ve indisi "+enksatir+","+enksutun);
        
    }
    
}
