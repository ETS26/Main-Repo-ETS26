
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
        int row;
        int bosluk=0;
     Scanner input = new Scanner(System.in);
     do{
            System.out.println("lütfen satır sayısını giriniz: ");
            row = input.nextInt();
            
        }while(row<0);
    
     for(int i=1;i<=row;i++){
           
     for(int j=1;j<=bosluk;j++){
     
      System.out.print(" ");
     }
     for(int a=1;a<=row-bosluk;a++){
     
      System.out.print("*");
     }
            bosluk++;
            System.out.println();
    }
    
    }
}

