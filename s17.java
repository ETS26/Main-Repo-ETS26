
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
public class s17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.85
        double a,b,u;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğrunun uzunluğunu girin: ");
        u = input.nextDouble();
        b = u/(2+Math.sqrt(2));
        a = u-b;
        System.out.println("a uzunluğu: "+b);
        System.out.println("b uzunluğu: "+a);
    }
    
}
