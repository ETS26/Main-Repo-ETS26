
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
public class s19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.90
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi sayıya kadar olan ikiz asalları bulmak istiyorsunuz?");
        int n = scanner.nextInt();
        int k, s = 0;
        int[] array = new int[n];

        for (int i = 1; i <= n; i++) {
            k = 0;
            for (int j = 2; j < i; j++) 
            if (i % j == 0) k++;
            if (k == 0) {
                s++;
                array[s - 1] = i;
            }
        }
        System.out.println("ikiz asallar: ");
        
        for (int i = 0; i < s; i++) {
            if (array[i + 1] - array[i] == 2)
            {
                System.out.println( array[i] + " " + array[i + 1]);
            }
        }
    }
    
}
