
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
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int s=0;
     Scanner input = new Scanner(System.in);
     System.out.println("lütfen bir cümle giriniz: ");
     String txt= input.nextLine();
     System.out.println("lütfen bir harf giriniz: ");
     char b = input.nextLine().charAt(0);
        for (int i = 0; i < txt.length(); i++) {
            if(txt.charAt(i)==b)
            {
                System.out.print((i+1)+",");
                s++;
            }
        }
        System.out.println("\n"+b+" "+s+" tanesi cümlede geçmektedir.");
    }
    
}
