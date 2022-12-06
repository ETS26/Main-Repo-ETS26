
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
public class s14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.82
        double t=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Terim sayısı girin: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            t=4+1/t;
        }
        System.out.println(2+1/t);
    }
    
}
