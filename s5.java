
import java.util.Random;
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
public class s5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Örnek 6.73
        Random r = new Random();//Randomu tanımlama
        Scanner input = new Scanner(System.in);
        int a = 65+ r.nextInt(25);//65-90 arası sayı üretme
        char b =(char)a;//Üretilen sayıyı harf karşılığına çevirme
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" inci Tahmininizi giriniz:");
            char tahmin = input.next().charAt(0);
            if(tahmin==b){
              System.out.println(i+" tahminde bildiniz");
              break;  
            }
            else if(i==10){
                System.out.println("10 hakkınız bitti");
                System.out.println("Doğru harf: "+b);
            }
        }
        
        
    }
    
}
