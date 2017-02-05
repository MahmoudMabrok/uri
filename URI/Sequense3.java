/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

/**
 *
 * @author mo3tamed
 */
public class Sequense3 {
    public static void main(String[] args) {
        int i = 1 ,m = 7 ;
        for (int j = m; j > m-3; j--) {
            System.out.println("I="+i+" J="+j);
            if (j == (m-2) && i != 9)
            {
            i+=2;
            m += 2 ;
            j=m+1;
            
            }
        }
    }
    
}
