
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
      
        int n=2;
        Scanner inp = new Scanner(System.in);
        System.out.println("bir sayı girin:");
        n = inp.nextInt();
        int s=2;
        while(n>1)
        {
            if(n%s==0)
            {
                n=n/s;
                System.out.println(s);
            }
            else
            {
                s++;
            }
        }
         
         
                 
        
    }
    
}
