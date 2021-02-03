package paresimpares1;

import java.util.Scanner;



public class ParesImpares1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N, c_par, c_impar;
        float p_par, p_impar;
        System.out.print("¿Cuantos numeros desea ingresar?");
        N = sc.nextShort();
        
        // definicion dimensionamiento del vector
        int numeros[] = new int[N];
        
        for (int i = 0; i <= N - 1; i++ ) {
            System.out.print("Ingrese el valor " + i);
            numeros[i] = sc.nextInt();
        }
        // procesar o determinar o calcular el porcentaje de pares
        c_par = 0;
        c_impar = 0;
        for (int i = 0; i <= N - 1; i++) {
            if (numeros[i] % 2 == 0 ) {
                c_par = (short)(c_par + 1);
            } else {
                c_impar = (short)(c_impar + 1);
            }
        }    
        p_par =  (float)c_par / N * 100;
        p_impar = (float)c_impar / N *100;
        
        System.out.println("El " + p_par +"& de numeros son pares y el " +
                p_impar + "% son impares ");
    }
    
}
