/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engin
 */
public class s26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.98
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    int s = 100*i+10*j+k;
                    if(s==Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3))
                    {
                        System.out.println(s);
                    }
                }
            }
        }
    }
    
}
