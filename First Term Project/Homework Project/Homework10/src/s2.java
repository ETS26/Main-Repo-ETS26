
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
public class s2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Bir n sayısı giriniz");
       int n = input.nextInt();
       karetop(n);
       
    }
    public static int karetop(int a){
        int sayac=0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                sayac++;
            }
        }
        if (sayac==0) {
           System.out.println("asal sayıdır"); 
        }
        else
        {
           System.out.println("asal sayı değildir"); 
        }
        return a;
    }
    
}
