
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
public class s28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.100
        int t=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int s = inp.nextInt();
    
        for (int i = 1; i <= s; i++) {
            if(s%i==0)
            {
                t+=i;
            }
        }
        if(t<2*s)
            {
                System.out.println("Eksik sayıdır ve eksiklik miktarı= "+(2*s-t));
            }
            else  System.out.println("Eksik sayı değildir");
    }
    
}
