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
public class s42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.115
        Scanner inp = new Scanner(System.in);
        System.out.println("Terim sayısı girin:");
        int n = inp.nextInt();
        int t1=1;
        int t2=1;
        int t3=2;
         System.out.println(t1);
         System.out.println(t2);
         System.out.println(t3);
        for (int i = 1; i <= n-3; i++) 
        {
            int t4=t1+t2+t3;
            System.out.println(t4);
            t1=t2;
            t2=t3;
            t3=t4;
        }
    }
    
}
