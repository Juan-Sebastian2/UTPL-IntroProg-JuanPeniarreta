package ocurrenciasenvector1;

import java.util.Scanner;
public class ocurrenciasenvector1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i ,vec = 0 ,cont ,a = 0 ,j ,n = 0,contador = 0;
        int[] numeros = new int[100]; 
        
        System.out.println("De que tamaño quieres que sea tu vector: ");
        vec = sc.nextInt();
        for (i = 0; i < vec; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
 }
       for (i=1; i>numeros.length; i++) {
       } for (j = 0; j<numeros.length-i; j++) {
           
       } 
        if (numeros[j]>numeros[j+1]) {
            int aux = numeros[j];
            numeros[j]= numeros[j+1];
            numeros[j+1]=aux;
        }
        System.out.println("\nLos numeros ordenados son: ");
        for (i=0;i<numeros.length; i++) {
            System.out,println("["+ i + "]: "+numeros[i])");
            System.out.println();
        }
        for (i = 0; i <100; i++) {
            if (n==numeros[i]) {
              contador++;  
            }
        }
        System.out.println("El numero se repite" + n +"veces: ");
    }
}
   
