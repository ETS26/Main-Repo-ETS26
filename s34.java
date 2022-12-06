
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
public class s34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.107
        Scanner inp= new Scanner(System.in);
        System.out.println("Basamak sayısı giriniz");
        int n= inp.nextInt();
        System.out.println(9*Math.pow(10,((n-1)/2)));
    }
    
}
