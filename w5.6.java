
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
     System.out.println("lütfen satır sayısını giriniz: ");
     int row = input.nextInt();
     for(int i=1;i<=row;i++){
            
     for(int j=1;j<=i;j++){
     System.out.print("*");      
     }        
     System.out.println();      
            
    }    
   
   }

}
