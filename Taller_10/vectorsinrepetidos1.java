package vectorsinrepetidos1;

import java.util.Scanner;
public class vectorsinrepetidos1 {
public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	System.out.print("Ingrese El Tamaño Del Vector: ");
    int numero_elementos = 0, elemento = 0,i=0,t=0;
    int numeros_no_repetidos[];
    t=leer.nextInt();
    numeros_no_repetidos = new int[t];
	boolean elemento_no_repetido = true;
	while (numero_elementos<t) {
		System.out.print("Ingrese Un Numero: ");
		elemento = leer.nextInt();
		for (i=0;i<=numero_elementos-1;i++) {
			if (elemento==numeros_no_repetidos[i]) {
				elemento_no_repetido = false;
			}
		}
		if (elemento_no_repetido) {
			numeros_no_repetidos[numero_elementos] = elemento;
			numero_elementos = numero_elementos+1;
		} else {
			System.out.println("Este numero ya existe en el vector");
		}
		elemento_no_repetido = true;
	}
	for (i=0;i<=t-1;i++) {
		System.out.println(numeros_no_repetidos[i]);
	}
}

}