
package sumatoriamatriz_1;
import java.util.Scanner;
public class SumatoriaMatriz_1 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Byte n;
        int sum = 0;
        System.out.print("¿Cuantas filas y columnas tiene la matriz cuadara? ");
        n = sc.nextByte();
        
        
        int m[][] = new int [n][n];
        
        System.out.println("\nIngrese los valores de la matriz ");
        System.out.println("======================================\n");
        
        for (short i =0; i < n; i++) {
        for (short j = 0; j < n; j++) {
            System.out.print("Inrese elemento de la posicion ["+(i+1)+", "+(j+1)
            +"]" );
 
            m [i][j] = sc.nextInt();
            
            if (i < j) {
                sum += m [i][j];
            }            
        }
    }
        System.out.print("\nSumatoria sobre diagonal principal: " + sum);
        System.out.println();
    }
    
}
