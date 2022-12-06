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
public class s44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //6.117
        Scanner inp = new Scanner(System.in);
        System.out.println("Terim sayısı girin:");
        int n = inp.nextInt();
        int p1=0;
        int p2=1;
        System.out.println(p1);
        System.out.println(p2);
        for (int i = 1; i <= n-2; i++) 
        {
            int p3=p1+p2*2;
            System.out.println(p3);
            p1=p2;
            p2=p3;
            
        }
        
    }
    
    
}
