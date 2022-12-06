
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
public class s37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.110
        int k0=0,k1=1;
        Scanner inp=new Scanner(System.in);
        System.out.println("Terim sayısı girin");
        int n=inp.nextInt();
        System.out.println(k1);
        for (int i = 1; i <= n; i++) {
          int k2=34*k1-k0+2;  
          System.out.println(k2);
          k0=k1;
          k1=k2;
        }
    }
    
}
