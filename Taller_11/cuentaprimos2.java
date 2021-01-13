package cuentaprimos2;

import java.util.Scanner;
public class cuentaprimos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i ,vec = 0 ,cont ,a = 0;
        int[] numeros = new int[100]; 
        
        System.out.println("De que tamaño quieres que sea tu vector: ");
        vec = sc.nextInt();
        for (i = 0; i < vec; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
 }
        cont = 0;
        for (i = 1; >=a) {
            if (a%i==0) {
                cont = cont +1;
            }
        }
        if (cont = 2) {
            System.out.print("El numero"+a+"es primo");
        } else {
            System.out.print("El numero"+a+"no es primo");
        }
    }
}