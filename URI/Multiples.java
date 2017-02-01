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
public class Multiples {
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x % y == 0)
            System.out.print("Sao Multiplos");
        else
            System.out.print("Nao sao Multiplos");
    }
    
}
