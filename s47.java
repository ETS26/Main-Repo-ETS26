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
public class s47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.120
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int n=inp.nextInt();
        for (int a = 1; a <= n-1; a++) 
        {
            for (int b = a+1; b <= n-a; b++) 
            {
                int c=n-(a+b);
                if(a*a+b*b==c*c)
                {
                    System.out.println(a+" "+b+" "+c);
                }
            }
        }
    }
    
}
