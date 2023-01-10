
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
public class soru4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int kon;
      char[] sesli ={'a','e','i','o','u'};
      Scanner input = new Scanner(System.in);
      System.out.println("lütfen küçük harflerle bir cümle giriniz: ");
      String txt= input.nextLine();
      String k1="",k2="";
        for (int i = 0; i < txt.length(); i++) {
            kon=0;
            for (int j = 0; j < 5; j++) {
           if (txt.charAt(i)==sesli[j])
          {
            kon=1;
            break;
          }
            }
          if(kon==1)
          {
            k1+=txt.charAt(i);  
          }
          else 
          {
            k2+=txt.charAt(i);
          }
         
        }
        System.out.println("Sesli harflerden oluşan kelime: "+k1);
        System.out.println("Sessiz harflerden oluşan kelime: "+k2);
    }
    
}
