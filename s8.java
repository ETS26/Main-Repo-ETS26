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
public class s8 {

    /**
     * @param args the command line arguments
     */
    public static double fact(int x)
    {
        double a=1;
        for (int i = 1; i <= x; i++)
        {
            a*=i;
        }
        return a;
    }
    public static void main(String[] args) {
        //6.76
        Scanner inp = new Scanner(System.in);
        System.out.println("Terim sayısı girin: ");
        int n=inp.nextInt();
        double t=0;
        for (int i = 0; i <= n; i++) 
        {
            t+=(2*i+2)/fact(2*i+1);
        }
        System.out.println(t);
    }
    
}
