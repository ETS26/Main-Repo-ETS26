
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
public class s3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Örnek 6.71
        double t=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Terim sayısı giriniz: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            t+=(double)1/((2*i+1)*(2*i+2));
        }
        System.out.println("Terim sayısına göre ln(2) değeri: "+t);
        
    }
    
}
