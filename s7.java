
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
public class s7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.75
        double x,n,t=0;
        Scanner input = new Scanner(System.in);
        System.out.println("x için sayı değeri giriniz: ");
        x = input.nextDouble();
        System.out.println("n için sayı değeri giriniz: ");
        n = input.nextInt();
        t+=Math.pow((1+(x/n)),n);
        System.out.println(t);
    }
    
}
