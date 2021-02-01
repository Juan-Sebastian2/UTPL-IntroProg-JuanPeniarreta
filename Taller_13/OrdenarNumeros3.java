package ordenarnumeros3;
import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNumeros3 {
public static void main(String[] wargs) {
    Scanner sc = new Scanner(System.in);
    int[] miArreglo = new int[10];
    for (int i = 0; i < 10; i++) {
        System.out.print("Ingrese el número en la posición " + (i) + " :");
        miArreglo[i] = sc.nextInt();
    }
            System.out.println("El Arreglo sin ordenar es el siguiente:"+ 
Arrays.toString(miArreglo) + " ");
              
}

private static int VectorArreglado(int arreglo[], int izquierda, int derecha) {
        int miArreglo = arreglo[izquierda];
        while (true) {
            while (arreglo[izquierda] < miArreglo) {
                izquierda++;
            }
            while (arreglo[derecha] > miArreglo) {
                derecha--;
            }
            if (izquierda >= derecha) {
            } else {
                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
           return derecha;
    }