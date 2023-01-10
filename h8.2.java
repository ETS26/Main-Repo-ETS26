

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
public class soru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("lütfen bir cümle giriniz: ");
      String txt= input.nextLine();
      if(txt.length()<25)
      {
        for (int i = 0; i < txt.length(); i++) {
          if ((txt.charAt(i)>=65)&&(txt.charAt(i)<=90))
          {
            System.out.print((char)(txt.charAt(i)+32));
          }
          else 
          {
           System.out.print((char)(txt.charAt(i)-32));
          }
        }
        System.out.println();
      }
      else
      {
          System.out.println("lütfen 25 harfi geçmeyin"); 
      }
      
    }
    
}
