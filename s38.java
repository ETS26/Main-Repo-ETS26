
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engin
 */
public class s38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.111
        int t1=1,t2=1;
        Scanner inp=new Scanner(System.in);
        System.out.println("Terim sayısı girin");
        int n=inp.nextInt();
        System.out.println(t1);
        System.out.println(t2);
        for (int i = 1; i <= n-2; i++) {
          int t3=t1+t2; 
          System.out.println(t3);
          t1=t2;
          t2=t3;
        }
    }
    
}
