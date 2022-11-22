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
        int topa=0,topb=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a = input.nextInt();
        System.out.println("Bir sayı giriniz");
        int b = input.nextInt();
        for (int i = 1; i < a; i++) {
            if(a % i == 0){
                topa=topa+i;
                 
                 
            }
        }
        System.out.println(topa);
        for (int i = 1; i < b; i++) {
            if(b % i == 0){
                topb=topb+i;
                 
            }
        }
        System.out.println(topb);
        if(topa==topb)
        {
            System.out.println("Dost sayılardır");
        }
        else
        {
            System.out.println("Dost sayı değillerdir");
        }
    }
    
}
