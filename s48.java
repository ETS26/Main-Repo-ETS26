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
public class s48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.121
        Scanner inp = new Scanner(System.in);
        System.out.println("Terim sayısı girin:");
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            double t=0;
            double f=1;
            for (int j = 1; j <= 20; j++) 
            {
                f*=j;
                t+=Math.pow(j, i)/f;
            }
            System.out.println(t/2.7182818284);
        }
    }
    
}
