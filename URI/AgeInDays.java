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
public class AgeInDays {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a/365 +" ano(s)");
        a=a%365;
        System.out.println( a /30+" mes(es)");
        a=a%30;
        System.out.println( a+" dia(s)");
    }
}
