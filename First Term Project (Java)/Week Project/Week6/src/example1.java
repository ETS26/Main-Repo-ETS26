
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
     double toplam=0;
     Scanner input = new Scanner(System.in);
     System.out.println("lütfen bir sayı giriniz: ");
     int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int fak=1;
            for (int j = 1; j <= i; j++) {
                fak*=j;
            }
            toplam+=(double)i/fak;
        }
        System.out.println(toplam);
         
    }
    
}
