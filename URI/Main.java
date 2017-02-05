
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.io.IOException;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
     
              Scanner scanner = new Scanner(System.in);
        int[] A = new int[Integer.MAX_VALUE];
        
        int c =0 , a  ;
        do {            
         a = scanner.nextInt();
         A[c] = a; 
         c++;
          
        } while (a > 0  );
        
        
        for (int i = 0; i < c; i++) {
            for (int j = 1; j <= A[i]; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
            
        }
   
    }
    
}
