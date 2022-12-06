
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
public class s10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.78
        double t=1,t1;
        Scanner input = new Scanner(System.in);
        System.out.println("Terim sayısı girin: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
          t1=4*i*i;  
          t=(t*t1)/(t1-1);
        }
        System.out.println(2*t);
    }
    
}
