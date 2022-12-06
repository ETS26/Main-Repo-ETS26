
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
public class s30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.102
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" "+(i+1)+" "+(i*(i+1)));
        }
    }
    
}
