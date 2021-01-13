package paresenvector1;

import java.util.Scanner;
public class paresenvector1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i ,vec = 0 ,cont ,a = 0;
        int[] numeros = new int[100];
        int pares = 0;
        
        System.out.println("De que tamaño quieres que sea tu vector: ");
        vec = sc.nextInt();
        for (i = 0; i < vec; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
 }
        for (i = 0; i < numeros.length;i++) {
            if (numeros[i] > 0) {
                pares++;
            }
        }
        System.out.println("Los numeros pares son: "+pares);
    }
}
