
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
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = assignum(25,95);
       int[] dizi = new int[n];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= randomarray(25,95);
        } 
        int[] randomsayilar = randomarray(150,n) ;
    }
    public static int[] rondomarray(int ub,int n){
       int[] dizi = new int[n]; 
       Random r = new Random();
       for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+". sayı: ");
            dizi[i]=r.nextInt(ub);
        }
       return dizi;
    }
    
}
