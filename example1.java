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
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //konsoldan deger almak için tanımladık
        System.out.println("Lütfen km cinsinden deger giriniz: ");
        int km = input.nextInt();
        int metre = km*1000;
         System.out.println("Hesaplanan metre degeri: "+metre);
         
        
        
        
    }
    
}
