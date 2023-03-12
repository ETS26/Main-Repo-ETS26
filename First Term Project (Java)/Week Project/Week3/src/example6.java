
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
public class example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz");
          int a = input.nextInt();
         boolean asal_mi=true;
          for(int s=2;s<a;s++)
       {
           if(a%s==0)
          {
              asal_mi=false;
              
          }
       }
       
          
          if(asal_mi==true && a!=1){
              System.out.println("asal");
          }
          else System.out.println("asal değil");
          
            
       
    }
    
}
