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
public class s35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //6.108
        Scanner inp=new Scanner(System.in);
        System.out.println("n sayısı girin");
        int n=inp.nextInt();
        System.out.println("m sayısı girin");
        int m= inp.nextInt();
        double t=Math.pow(n+1, m);
        
        for (int i = 1; i <= n; i++) 
        {
           int f1=1,f2=1,f3=1;
            for (int j = 1; j <= m+1; j++) {
                f1*=j;
            }
            for (int j = 1; j <= i; j++) {
                f2*=j;
            }
            for (int j = 1; j <= (m+1)-i; j++) {
                f3*=j;
            }
            double c=(double)f1/(f2*f3);
            t+=Math.pow(-1, i)*c*Math.pow(n+1-i, m);
        }
        System.out.println(t);
    }
    }
    

