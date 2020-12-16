
package cuentacifras1;

import java.util.Scanner;


public class Cuentacifras1 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cifras;
        do {
            System.out.print("Introduce un numero entero: ");
            n = sc.nextInt();
            cifras = 0;
            while(n = 0) {
                n = n /10;
                cifras ++;
            }
            System.out.print("El numero tiene" + cifras+ "cifras");
        } 
        
    }
    
}
