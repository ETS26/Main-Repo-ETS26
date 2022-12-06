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
public class s45 {

    /**
     * @param args the command line arguments
     */
   public static int D(int m,int n)
    {
        if(m==0 |n==0)
        {
            return 1;
        }
        else
        {
            return D(m-1,n)+D(m-1,n-1)+D(m,n-1);
        }
    }
    public static void main(String[] args) 
    {
        //6.118
        Scanner inp = new Scanner(System.in);
        System.out.println("m sayısı girin");
        int m=inp.nextInt();
        System.out.println("n sayısı girin");
        int n = inp.nextInt();
        System.out.println(D(m,n));
        
    }
    
}
