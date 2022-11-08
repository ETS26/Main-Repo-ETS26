/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author engin
 */
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        do{
            System.out.println("lütfen 0 ile 100 arasında giriniz: ");
            a = input.nextInt();
            
        }while(a<0 || a>100);
         System.out.println("Girilen sayı: "+a);
    }
    
}
