package muestraprimos1;

import java.util.Scanner;

public class muestraprimos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,lim;
        int numeros[] = new int[100];
        System.out.println("Ingrese la cantidad de numeros a mostrar ");
        lim = sc.nextInt();
        
        for (i =0;i<lim;i++) {
            System.out.print("Ingrese el numero"+ (i+1)+":");
            numeros[i] = sc.nextInt();
            
  
        }
        for (i=0;i<lim;i++) {
            System.out.print(numeros[i]+", ");
            
        System.out.print("los numeros primso encontrados del vector son ");
        for (int i = 0; i <= numeros[i] - 1; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
        }
        
         public static int[] primos(int[] x) {
        int aux;
        for (int lim = x.length - 1; lim >= 1; lim--) {
            for (int i = 0; i <= lim - 1; i++) {
                if (x[i] > x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }
        return x;
    }

}