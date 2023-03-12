
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
public class soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int s;
         do{
            System.out.println("lütfen 7 den büyük bir sayı giriniz: ");
            s = input.nextInt();
            
        }while(s<7);
         for(int a=0;a<=s/3;a++){
            
            for(int b=0;b<=s/5;b++){
               
                if(3*a+5*b==s)
                {
                    System.out.println(a+"  "+b);
                }
            }
            
            
         }
    }
            
    }
    
    


