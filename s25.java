
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
public class s25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.96
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int s = inp.nextInt();
        if((s-1)%4==0)
        {
             System.out.println("Hilbert sayısıdır");
        }
        else System.out.println("Hilbert sayısı değildir");
    }
    
}
