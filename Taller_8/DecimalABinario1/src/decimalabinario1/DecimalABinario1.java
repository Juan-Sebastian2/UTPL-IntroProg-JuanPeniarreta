
package decimalabinario1;

import java.util.Scanner;


public class DecimalABinario1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, residuo, binario, base;
        
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        
        binario = 0;
        base = 1;
        
        while (num > 0){
            residuo = num % 2;
            binario = binario + residuo * base;
            num = (num/2);
            base = base * 10;
        }
        
    }
    
}
