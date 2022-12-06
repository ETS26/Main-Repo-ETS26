
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
public class s36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.109
        Scanner inp=new Scanner(System.in);
        System.out.println("Terim sayısı girin");
        int n=inp.nextInt();
        for (int i = 1; i <= n; i++) {
          int u = i*(i+1)/2;  
          System.out.println(u);
        }
    }
    
}
