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
public class Selection1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
      
        
        if (b>c  && d>a   &&(c+d)>(a +b )  && a%2==0  && c>0 &&d>0  )
            System.out.println("Valores aceitos");
        else
            System.out.println("Valores nao aceitos");
    }
    
}
