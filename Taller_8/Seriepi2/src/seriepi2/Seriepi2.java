
package seriepi2;

import java.util.Scanner;


public class Seriepi2 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte  n;
        int  i;
        char suma, pi;
        
        System.out.print("Ingrese el numero n");
        n = sc.nextByte();
        
        suma = 0;
        i = 1;
        
        while ( i <= n) {
            suma = (char) (suma + 1 / 2 * 1 + 1);
            i = i + 1;
            pi = (char) (i / 4);
        } 
              
    }
    
}
