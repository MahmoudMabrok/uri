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
public class GrearestAndPo {
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
        int a , index =0 ,max= Integer.MIN_VALUE;
        for (int i = 0; i < 100; i++) {
            a = scanner.nextInt();
            if ( a > max )
            {
            max =a;
            index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
    
}
