
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
public class s4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Örnek 6.72
        int r,s=0,tahmin;//tanımlama
        Scanner input = new Scanner(System.in);
        r=(int)(Math.random()*98)+1;//1 ile 99 arası sayı üretir
        System.out.println("0 ile 100 arası bir sayı tahmin ediniz: ");
        do{
        tahmin = input.nextInt();
        s++;
        if(tahmin>r){
        System.out.println("Daha küçük bir sayı giriniz");
        }
        else if(tahmin<r){
        System.out.println("Daha büyük bir sayı giriniz");
        }
        }while(r!=tahmin);//tahmin random sayıya eşit olana kadar devam eder
        System.out.println(s+" denemede buldunuz");
    }
    
}
