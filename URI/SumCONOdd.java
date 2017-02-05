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
public class SumCONOdd {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        for (int i = a -1 ; i > b; i--) {
            if ( i %2 != 0)
                s+=i;
        }
        System.out.println(s);
    }
}
