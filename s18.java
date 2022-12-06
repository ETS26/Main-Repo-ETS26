/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engin
 */
public class s18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.87
        for (int i = 2; i <= 7; i++) {
            for (int j = 2; j <= 7; j++) {
                if((i==2||i==3||i==5||i==7)&&(j==2||j==3||j==5||j==7))
                {
                    System.out.println(10*i+j);
                }
            }
        }
        
    }
    
}
