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
public class DivisorsI {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
            System.out.println(i);
        }
    }
    
}
