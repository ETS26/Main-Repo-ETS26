
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
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      char[] sesli ={'a','e','i','o','u'};
      int[] yer = new int[255];
      Scanner input = new Scanner(System.in);
      System.out.println("lütfen bir ifade giriniz: ");
      String txt= input.nextLine();
      int s=0;
        for (int i = 0; i < txt.length() ; i++) {
            char h = Character.toLowerCase(txt.charAt(i));
            for (int j = 0; j <= sesli.length-1; j++) {
              if(sesli[j]==h)
              {
                  //System.out.print((i+1)+"'inci karakter");
                  yer[s]=i;
                  s++;
              }
            }
        }
        
        for (int i = 0; i < s; i++) {
            if(i==s-1)
            {
               System.out.print(yer[i]+" sesli harflerin yerleri"); 
            }
            else  System.out.print(yer[i]+",");
          
        }
        System.out.println();
        System.out.print(s+" tane sesli harf vardır");
        System.out.println();
    }
    
}
