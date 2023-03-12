
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
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int row;
        int bosluk=0;
     Scanner input = new Scanner(System.in);
     do{
            System.out.println("lütfen satır sayısını giriniz: ");
            row = input.nextInt();
            
        }while(row<=0);
    
     for(int i=1;i<=row;i++){
     if(i==1 || i==row){
         for (int j = 1; j <= row; j++) {
             System.out.print("*");
         }
     }
     else{
          for (int k = 1; k <= row; k++) {
             if(k==1 || k==row){
                  System.out.print("*");
             } 
             else{
                 System.out.print(" ");
             }
     }
              
     }  
       System.out.println();
    }
   }
}
  
    
    

