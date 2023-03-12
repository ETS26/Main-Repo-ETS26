/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engin
 */
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] sayilar ={1,2,3,4,5};
       //sayilar.length
       sayilar[sayilar.length-1]=48;
       System.out.println(sayilar[0]);
       System.out.println(sayilar[sayilar.length-1]);
       int sum = sayilar[2]+sayilar[sayilar.length-1];
       System.out.println(sum);
       int[] a = new int[10];
       System.out.println(a[5]);//0
    }
    
}
