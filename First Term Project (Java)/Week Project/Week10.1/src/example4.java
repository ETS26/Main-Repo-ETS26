
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
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = assignum(25,95);
       int[] dizi = new int[n];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= assignum(25,95);
        }
       
    }
    public static int assignum(int lb,int ub){
       Scanner input = new Scanner(System.in);
       int sayi;
       do{
           System.out.print("lb-ub arası değer giriniz: ");
           sayi = input.nextInt();
           
       }while(sayi<lb || sayi>ub);
       return sayi;        
    }
    
    
            
 
}
