
package seriediferenciaprimos1;
import java.util.Scanner;
public class SerieDiferenciaPrimos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nume;
        
        System.out.println("Ingrese un numero: ");
        nume = sc.nextInt();
        
        for (int i = 0; i < nume; i++) {
            int count = 0;
            
            
            for(int j = 0; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.println(i);       
        }  
    }
}
