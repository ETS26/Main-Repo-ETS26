
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
public class s23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.94
        Scanner inp = new Scanner(System.in);
        System.out.println("Terim sayısı giriniz");
        int n= inp.nextInt();
        for (int i = 0; i <= n-1; i++) {
            System.out.println(Math.pow(2, Math.pow(2, i))+1);
        }
    }
    
}
