/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author engin
 */
public class s11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.79
        Scanner inp = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Rastgele nokta sayısı: ");
        double n =inp.nextDouble();
        double s=0;
        for (int i = 1; i <= n; i++) 
        {
            double x=r.nextDouble();
            double y=r.nextDouble();
            
            if(x*x+y*y<1)
            {
                s+=1;
            }
        }
        System.out.println(4*(s/n));
        
    }
    
}
