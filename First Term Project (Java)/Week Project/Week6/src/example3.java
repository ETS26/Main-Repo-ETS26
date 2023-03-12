
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
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double toplam=0;
     Scanner input = new Scanner(System.in);
     System.out.println("lütfen bir sayı giriniz: ");
     int n = input.nextInt();
        //for (int i = 0; i <= n; i++) {
           // double fak=1;
            //int temp=2*i+1;
            //for (int j = 1; j <= temp; j++) {
                //fak*=j;
            //}
            //toplam+=(double)(temp+1)/fak;
        //}
        //System.out.println(toplam);
        
        for (int i = 2; i <= n ; i+=2) {
            int temp = i-1;
            double fak=1;
            for (int j = 1; j <= temp; j++) {
                fak*=j;
            }
            toplam+=i/fak;
        }
        System.out.println(toplam);
    }
    
}
