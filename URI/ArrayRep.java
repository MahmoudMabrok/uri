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
public class ArrayRep {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
            if (A[i] < 1) {
                A[i] = 1;
            }

        }
        for (int i = 0; i < 10; i++) {

            System.out.println("X[" + i + "] = " + A[i]);
        }
        
    }

}
