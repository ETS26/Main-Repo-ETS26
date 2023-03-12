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
public class soru4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t=0,s=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            if(a % i == 0){
                t=t+i;
                s++;  
            }
        }
        if(t%s==0){
             System.out.println("Aritmetik sayıdır");
        }
        else
        {
            System.out.println("Aritmetik sayı değildir");
        }
                
    }
    
}
