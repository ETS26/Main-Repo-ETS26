
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
public class example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("lütfen bir cümle giriniz: ");
     String txt= input.nextLine();
     int s=0;
     char is[]={' ',',',';','.','-','!',':'};
        for (int i = 0; i < txt.length(); i++) {
            char h = txt.charAt(i);
            for (int j = 0; j < is.length; j++) {
              if(h==is[j])
            {
                s++;
            }  
            }
            
        }
        System.out.println(s+" tane kelime vardır.");
    }
    
}
