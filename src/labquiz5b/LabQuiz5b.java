/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz5b;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mehmet Sait
 */
public class LabQuiz5b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<Integer>();
        System.out.println("Bir sayı giriniz");
        int sayi=in.nextInt();
        
        do
        {
           
            A.add(sayi%2);
           
            sayi=sayi/2;
        }while(sayi>1);
        
        System.out.print("1");
        for(int l=A.size()-1;l>-1;l--)
            {
                System.out.print(A.get(l));
            }
      
    }
    
}
