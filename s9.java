
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
public class s9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.77
        double t=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Terim sayısı girin: ");
        int n = input.nextInt();
        for (int i = 0; i <= n-1; i++) {
          t+=(Math.pow(-1,i))/((double)(2*i+1)*Math.pow(3, i));
        }
        System.out.println(Math.sqrt(12)*t);
    }
    
}
