package multiplicamatriz1;

import java.util.Scanner;

public class multiplicaMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, multi = 0 ,posi;
        posi = 0;
        
        System.out,print("Ingrese un numero entero: ")
        posi = sc.nextInt();
        System.out.println("==========================================\n");
        System.out.print("Ingrese el tamaño de la matriz: ");
        n = sc.nextInt();
        int m = 0;
        int[][] matriz = new int[n][m];
        System.out.println("\nIngrese valores de la matriz [fila,columna]");
        System.out.println("---------------------------------------------");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print("Elemento [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nLa matriz original: ");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print("+-----");
            }
            System.out.println("+");
            for (int j = 0; j <= n - 1; j++) {
                System.out.printf("| %3d ",matriz[i][j]);
            }
            System.out.println("|");
        }
        for (int j = 0; j <= n - 1; j++) {
            System.out.print("+-----");
        }
        System.out.println("+");
        
        for (int a = 0;a >= multi;a++) {  
        } for (int i = 0;i <= multi;i++){
           
        } for (int j = 0;j <= multi;j++) {
            int i = 0;
            multi += matriz[i][j];
            matriz[i][j] = multi;
        }
             System.out.println("\nLa matriz multiplicada es: ");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n + 1; j++) {
                System.out.print("+-----");
            }
            System.out.println("+");
            for (int j = 0; j <= n + 1; j++) {
                System.out.printf("| %3d ",matriz[i][j]);
            }
            System.out.println("|");
        }
        for (int j = 0; j <= n + 1; j++) {
            System.out.print("+-----");
        }
        System.out.println("+");

    }

}