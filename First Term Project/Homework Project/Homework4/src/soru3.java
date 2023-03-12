
import java.util.Scanner;

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
public class soru3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Bir sayı girin:");
     int a = input.nextInt();
     int toplam=0,toplam2=0;
     System.out.println("Bir sayı girin:");
     int b = input.nextInt();
        for (int i = 1; i <= a; i++) {
            if(a%i==0)
            {
                
                toplam=toplam+i;
                
            }
            
        }
        for (int j = 1; j <= b; j++) {
            if(a%j==0)
            {
                
                toplam2=toplam2+j;
                
            }
        }  
        if(toplam==toplam2)
        {
            System.out.println("Dost sayı");
        }
        else
        {
             System.out.println("Dost sayı değil");
        }
 }
       
}
