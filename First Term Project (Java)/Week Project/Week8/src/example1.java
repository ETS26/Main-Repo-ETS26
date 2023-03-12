
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
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("lütfen bir ifade giriniz: ");
     String txt= input.nextLine();
     System.out.println(txt.charAt(4));
     char ch =txt.charAt(4);
     System.out.println(ch+ "'nin ASCI kodu:"+ (int)ch);
     char ch2 ='e';
     System.out.println(ch2+ "'nin ASCI kodu:"+ (int)ch2);
     char ch3 ='3';
     System.out.println(ch3+ "'nin ASCI kodu:"+ (int)ch3);
        for (int i = 0; i < txt.length(); i++) {
             System.out.println(txt.charAt(i)+"'nin ASCI kodu:"+ (int)txt.charAt(i));
        }
        int a = txt.charAt(0);
        System.out.println("a'nın değeri "+a);
    }
    
}
