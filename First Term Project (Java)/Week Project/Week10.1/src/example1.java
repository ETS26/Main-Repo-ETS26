
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
       fenerbahce();
       Scanner input = new Scanner(System.in);
       System.out.println("a sayısını giriniz");
       int a = input.nextInt();
       System.out.println("b sayısını giriniz");
       int b = input.nextInt();
        
        topla(a,b);
        cikart(a,b);
        art(a);
        int x = incrementby(a);
        System.out.println(x);
    }
    public static void fenerbahce(){
        System.out.println("Şampiyon Fenerbahçe");
    }
    public static void topla(int num1,int num2){
        int result = num1+num2;
        System.out.println(result);
    }
    public static void cikart(int num1,int num2){
        int result = num1-num2;
        System.out.println(result);
    }
    public static void art(int num1){
        num1++;
        System.out.println(num1);
    }
    public static int incrementby(int num){
        num++;
        return num;
    }
}
