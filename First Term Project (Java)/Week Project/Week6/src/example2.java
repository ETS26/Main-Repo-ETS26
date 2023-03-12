
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
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double toplam=0;
     Scanner input = new Scanner(System.in);
     System.out.println("lütfen bir sayı giriniz: ");
     int n = input.nextInt();
        //for (int i = 0; i <= n; i++) {
           //toplam+=(double)Math.pow(-1,i)/(2*i+1);
        //}
        //toplam=4*toplam;
        //System.out.println(toplam);
        
        for (int i = 0; i <= n ; i++) {
            if(i%2==0)
            {
                toplam+=(double)1/(2*i+1);
            }
            else
            {
                toplam-=(double)1/(2*i+1);
            }
        }
        System.out.println(4*toplam);
        
    }
    
}
