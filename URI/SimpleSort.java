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
public class SimpleSort {
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        
        if ( x >= y && y >= z )
            System.out.println(x+"\n"+y+"\n"+z);
        else if (y >= z && z < x )
            System.out.println(y+"\n"+x+"\n"+z);
        else if (y >= z && z > x )
            System.out.println(y+"\n"+z+"\n"+x);
        else 
        {    if (y > x)
            System.out.println(z+"\n"+y+"\n"+x);
        else
                System.out.println(z+"\n"+x+"\n"+y);
        }
            
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    
}
