
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
public class soru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int a;
         do{
            System.out.println("pozitif bir sayı giriniz: ");
            a = input.nextInt();
            }while(a<0);
       
         for(int i=-a;i<a;i++){
            
         for(int j=-a;j<=a;j++){
             if(i*i+j*j==a)
               {
                 System.out.println(i+"  "+j);
               }  
                
            }
            
        }
    
    }
}
