/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engin
 */
public class s39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.112
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++) 
            {
                int s=i+j;
                if(s==1|s==2|s==3|s==5|s==8|s==13)
                {
                    System.out.println(10*i+j);
                }
            }
        }
    }
    
}
