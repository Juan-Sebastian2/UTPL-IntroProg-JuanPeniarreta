
package listanumerosprimos1;

import java.util.Scanner;


public class ListanumerosPrimos1 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte ele_mostrar, encontrados;
        int num, c;
        char esPrimo;
.        char = 0 
        
        System
out.print("Ingrese la cantidad de primos a mostrar: ");
        ele_mostrar = sc.nextByte();
        
        encontrados = 2;
        num = 2;
        
        while (encontrados < ele_mostrar) { 
        }
        
        esPrimo = "S";
        c = num -1;
        
        while (c >= 2) {
            if (num % c == 0) {
                esPrimo = "N";
            } else {
                c = c - 1;
            }
        }
        if esPrimo = "S" {
            System.out.println("\nEl" +num+ "es: ");
            encontrados = (byte) (encontrados + 1);
        } else {
            num = num + 1;
        }
 
    }
    
}
