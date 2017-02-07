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
public class TimeConver {
    public static void main(String[] args) {
             
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int h , m  ;
        h = a / 3600;
        a=a%3600;
        m= a/60;
        a=a%60;
        System.out.println(h+":"+m+":"+a);
        
        
    }
    
}
