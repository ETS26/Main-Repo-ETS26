/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engin
 */
public class s32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.104
        for (int i = 0; i <=50; i++) 
        {
            for (int j = 0; j <= 50; j++) 
            {
                for (int k = 0; k <= 50; k++) 
                {
                    if(i*i+k*k+j*j==3*i*j*k)
                    {
                        System.out.println(i+" "+j+" "+k);
                    }
                }
            }
        }
    }
    
}
