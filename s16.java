
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
public class s16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.84
        double a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("AB doğru parçasının uzunluğunu girin: ");
        a = input.nextDouble();
        b = a*(1+Math.sqrt(5))/2;
        System.out.println("Uzun kenarların uzunluğu: "+b);
        System.out.println("Kısa kenar uzunluğu: "+a);
    }
    
}
