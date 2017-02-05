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
public class SummingConsecutive {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n ; 
        do {            
                    n = scanner.nextInt();

        } while (n < 1  );
        int sum = a;
        for (int i = 1; i < n; i++) {
            a+=1;
            sum+= a;
        }
        System.out.println(sum);
        
    }
    
}
