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
public class s21 {

    /**
     * @param args the command line arguments
     */
     public static boolean asalmı(double a)
    {   //6.92
        int s=0;
        for (int i = 1; i <= a; i++) 
        {
            if(a%i==0)
            {
                s+=1;
            }
        }
        if(s==2)
        {
            return true;
        }
        else return false;
    }
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Üst sınır giriniz");
        int n= inp.nextInt();
        
        for (int i = 1; i <= n; i++) 
        {
            double a=Math.pow(2, i);
            double b=Math.pow(2, i+1)-1;
            if(asalmı(b))
            {
                System.out.println(a*b+" asal ve mükemmel sayıdır");
            }
        }
    }
    
}
