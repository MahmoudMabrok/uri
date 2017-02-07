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
public class EvenSquare {
    
    
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 2; i <= a; i++) {
            
            if (i % 2 == 0)
                System.out.println(i+"^2 = " +i*i);
        }
    }
    
}
