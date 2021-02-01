package seriepiviete_1;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class SeriePiViete_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("¿Ingrese la cantidad de elementos  mostrar? ");
        n = sc.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }       
                
    }
     public static int numeroPiSerie (int n) {
            int c = 1;
            float serie, elemento, serieRE;
            serie = 1;
            elemento = (float) sqrt(1/2);
            
        while (c = 1; n >= 1) {
         serie = serie * elemento;
         elemento = (float) sqrt(1/2+1/2 * elemento);
     } 
        serieRE = 2/serie;   
        System.out.println("\nEl valor de pi es"+serieRE+":");
        return n;
        }
}
