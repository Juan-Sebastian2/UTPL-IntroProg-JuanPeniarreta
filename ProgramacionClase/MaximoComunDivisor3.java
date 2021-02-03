
// Rosa Palacios,Isaac Alvarez,Alvaro Pacheco,Juan Peñarreta
package maximocomundivisor3;
import java.util.Scanner;
public class MaximoComunDivisor3 {
    public static void main(String[] args) {
        int n1 = leerNumeroEntero("Ingrese el primer numero: ");
        int n2 = leerNumeroEntero ("Ingrese el segundo numero: ");
        System.out.println("\nEl máximo común divisor es: "
                + mcd(n1, n2));
    }

    //Función que calcula el máximo común divisor de 2 número enteros positivos
    public static int mcd(int m, int n) {
        int respuesta;
        if (m % n == 0) {
            respuesta = n;
        } else {
            respuesta = mcd(n, m % n);
        }
        return respuesta;
    }
    public static int leerNumeroEntero (String msg) {
         Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean datoValido = false;
        while (!datoValido) {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0 ) {
                    System.out.println("\nDato no valido");
                } else {
                    datoValido = true;
                }
            } catch (Exception e) {
                System.out.println("\nDato no valido");
            }
        }
        return n;
    }
}