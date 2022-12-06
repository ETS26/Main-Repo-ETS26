
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
public class s29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //6.101
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            int s=0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0)
                {
                    s+=1;
                }
            }
             if(i%s==0)
                {
                    System.out.println(i+" Tau sayısıdır");
                }
        }
        
    }
    
}
