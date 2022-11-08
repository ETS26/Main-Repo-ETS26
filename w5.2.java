
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
        Scanner input = new Scanner(System.in);
        int f,v;
        double ort;
        do{
            System.out.println("lütfen vize notu giriniz: ");
            v = input.nextInt();
            
        }while(v<0 || v>100);
        
        do{
            System.out.println("lütfen arasında final notu giriniz: ");
            f = input.nextInt();
            
        }while(f<0 || f>100);
        
        ort = (double)(((f*60)/100)+((v*40)/100));
        
        if(ort>=80 && ort<=100)
        {
             System.out.println(ort);
              System.out.println("A");
        }
        else if(ort>=60 && ort<=79)
        {
             System.out.println(ort);
              System.out.println("B");
        }
        else if(ort>=50 && ort<=59)
        {
             System.out.println(ort);
              System.out.println("C");
        }
        else 
        {
             System.out.println(ort);
              System.out.println("D");
        }
         
    }
    
}
