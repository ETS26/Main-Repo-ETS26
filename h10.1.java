
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
public class s1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Bir n değeri giriniz");
       int n = input.nextInt();
       karetop(n);
       
    }
    public static void karetop(int n){
       int top=0;
        for (int i = 1; i <= n; i++) {
           top+=i*i; 
        }
        System.out.println(top);
    }
    
}
