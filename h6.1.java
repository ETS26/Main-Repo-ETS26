/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author engin
 */
public class soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int sayac=0;
        int sayac2=0;
        Scanner input= new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        n = input.nextInt();
        
        for(int i = 2; i < n; i++)
        {
            if((n+2) % i == 0) {
                sayac++;
            }
            if(n % i == 0)
            {
                sayac2++;
            }
        }
        if(sayac == 0) {
            System.out.println(n + " Chen Asalı bir sayıdır.");
        }
        else if(sayac2 == 0)
        {
            System.out.println(n + " Asal bir sayıdır.");
        }
        else
        {
            System.out.println(n + " Asal sayı degildir.");
        }
        
    }
    
}
