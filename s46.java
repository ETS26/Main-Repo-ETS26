/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author engin
 */
public class s46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.119
        Scanner inp = new Scanner(System.in);
        System.out.println("Satır sayısı girin:");
        int n= inp.nextInt();
        int s=1;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <=i; j++) 
            {
                System.out.print(s+" ");
                s++;
            }
            System.out.println();
        }
    }
    
}
