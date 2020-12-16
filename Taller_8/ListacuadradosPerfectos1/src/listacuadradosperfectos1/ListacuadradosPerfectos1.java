
package listacuadradosperfectos1;

import java.util.Scanner;


public class ListacuadradosPerfectos1 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, cua, n;
        
        System.out.print("Ingrese el primer numero entero positivo: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero entero positivo: ");
        num2 = sc.nextInt();
        
        n = 1;
        
        while (num1 <= num2) {
            if (cua = n * 2) {
                cua = num1;
            }
        }
        if (num1 <= num2){
            cua = n * 2;
            cua = num2;
        }
    }
    System.out.println("\nLos numeros abundantes de" + cua + "son estos");
    
}
