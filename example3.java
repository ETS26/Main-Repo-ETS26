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
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz: ");
        double a = input.nextDouble();
        System.out.println("Lütfen 2.sayıyı giriniz: ");
        double b = input.nextDouble();
        System.out.println("Lütfen 3.sayıyı giriniz: ");
        double c = input.nextDouble();
        double toplam = a+b+c;
        System.out.println("Toplam degeri: "+toplam);
        double carpım = a*b*c;
        System.out.println("Çarpım degeri: "+carpım);
        double ort = toplam/3;
        System.out.println("Ortalama degeri: "+ort);
    }
    
}
