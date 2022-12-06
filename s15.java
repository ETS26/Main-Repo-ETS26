
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
public class s15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.83
        double cb,ab,ac;
        Scanner input = new Scanner(System.in);
        System.out.println("AB doğru parçasının uzunluğunu girin: ");
        ab = input.nextDouble();
        cb = 2*ab/(1+Math.sqrt(5));
        ac = ab-cb;
        System.out.println("AC uzunluğu: "+ac);
        System.out.println("CB uzunluğu: "+cb);
    }
    
}
