/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engin
 */
import java.util.Scanner;
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fahrenheit cinsinden deger giriniz: ");
        double f = input.nextDouble();
        double c = (f-32)/ 1.8;
        System.out.println("Hesaplanan celcius degeri: "+c);
    }
    
}
