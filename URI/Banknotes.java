/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.util.Scanner;

/**
 *
 * @author mo3tamed
 */
public class Banknotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int x = scanner.nextInt();
         System.out.println(x);
         int[] y =new int[] {100,50,20,10,5,2,1};
         String[] s =new String[] {"100,00","50,00","20,00","10,00","5,00","2,00","1,00"};
         for (int i=0 ; i<y.length ; i++) {
             System.out.println(x / y[i] + " nota(s) de R$ "+s[i]);
            x = x%y[i];
        }
      
    }
    
}
