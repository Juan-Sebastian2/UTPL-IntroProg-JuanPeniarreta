package ordenarmatriz_1;
import java.util.Scanner;
import java.util.Arrays;
public class ordenarmatriz_1 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    int matriz[][];
    System.out.println("Ingrese la dimension de la matriz: ");
    x = sc.nextInt();
    matriz = new int[x][x];

    for (int i=0; i<x; i++){ 
        for (int j=0; j<x; j++) {
            matriz[i][j] = (int) (Math.random()*10);
        }
    }
    System.out.println("Matriz original");
    for (int i=0; i<x; i++){ 
        for (int j=0; j<x; j++){ 
            System.out.print(matriz[i][j]+" "); 
        }
        System.out.println(); 
    }

    System.out.print("La diagonal principal es:    ["); 
    for (int i=0; i<x; i++) 
        for (int j=0; j<x; j++){ 
            if (i == j) 
                System.out.print(matriz[i][j] +" "); 
        } 
    System.out.println("]");

    System.out.print("La diagonal secundaria es:    ["); 
    for (int i=x-1; i>=0; i--) 
        for (int j=0; j<x; j++) 
            if (x-1-i == j) 
                System.out.print(matriz[i][j] +" "); 
    System.out.println("]"); 

    Arrays.sort(matriz);
                                      
    for(int[] s : matriz)
        System.out.println(Arrays.toString(s));

    System.out.println("Matriz ordenada");
    for (int i=0; i<x; i++){ 
        for (int j=0; j<x; j++){ 
            System.out.print(matriz[i][j]+" "); 
        }
        System.out.println(); 
    }
 }
}