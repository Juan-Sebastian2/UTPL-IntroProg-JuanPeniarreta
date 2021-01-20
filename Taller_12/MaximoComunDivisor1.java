package maximocomundivisor1;

import java.util.Scanner;

public class MaximoComunDivisor1 {

	public static void main(String[] args) {
		int a, b, residuo, mcd = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el primero numero: ");
		a = sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = sc.nextInt();
		

		while (a % b != 0) {

			residuo = a % b;
			a = b;
			b = residuo;
			mcd = b;

		}

		System.out.println("El maximo comun divisor es: " + mcd);
	}
}
