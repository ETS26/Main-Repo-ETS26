
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
public class s43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.116
        Scanner inp= new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int f2= inp.nextInt();
        double ao=(1+Math.sqrt(5))/2;
        double f1=f2/ao;
        double f3=f2*ao;
        System.out.println(f1+"   "+f2+"   "+f3);

    }
    
}
