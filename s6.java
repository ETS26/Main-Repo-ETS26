
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
public class s6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.74
        double e=1;
        Scanner input = new Scanner(System.in);
        System.out.println("x için sayı değeri giriniz: ");
        int x = input.nextInt();
        System.out.println("Serinin kaça kadar açılacağını yazın: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int fak=1;
            for (int j = 1; j <= i; j++) {
                fak*=j;
            }
           e+=(double)Math.pow(x, i)/fak;
        }     
        System.out.println(e);
    }
    
}
