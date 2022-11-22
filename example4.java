/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author engin
 */
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        int a = r.nextInt(100);
        int tahmin ;
        int hak = 4 ;
        System.out.println("0 ile 100 arası bir sayı tahmin ediniz(5 hakkınız var): ");
     while(true){  
        tahmin = input.nextInt();
        if(tahmin<a)
        {
            System.out.println("Daha büyük sayı girin");
             if(hak>0){
              hak--;
            }
             else if(hak==0){
                 System.out.println("Hakkın bitti");
                 System.out.println("Sayı buydu: "+a);
                 break;
             }
            
        }
        else if(tahmin>a)
        {
            System.out.println("Daha küçük sayı girin");
             if(hak>0){
              hak--;
            }
            else if(hak==0){
                 System.out.println("Hakkın bitti");
                 System.out.println("Sayı buydu: "+a);
                 break;
             }
        }
        else if(tahmin==a)
        {
            System.out.println("Bildin bravo");
            break;
        }
        }
     }
        
        
    }
      
       
  

