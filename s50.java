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
public class s50 {

    /**
     * @param args the command line arguments
     */
   public static double komb(double x,double y)
    {
        return fact(x)/(fact(x-y)*fact(y));
    }
    public static double fact(double x)
    {
        double a=1;
        for (int i = 2; i <= x; i++) 
        {
            a*=i;
        }
        return a;
    }
    public static double S(double n,double k)
    {
        double t=0;
        for (int i = 0; i <=k; i++) 
        {
            t+=Math.pow(-1, i)*komb(k,i)*Math.pow(k-i,n);
        }
        return t*(1/fact(k));
    }

    public static void main(String[] args) 
    {
        Scanner inp = new java.util.Scanner(System.in);
        System.out.println("n değeri giriniz");
        int n = inp.nextInt();
        double t=0;
        for (int k = 1; k <= n; k++) 
        {
            t+=S(n,k);
        }
        System.out.println(t);
    }

    
}
