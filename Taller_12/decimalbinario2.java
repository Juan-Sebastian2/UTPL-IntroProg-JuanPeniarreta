package decimalbianario2;
 
import java.util.Scanner;

 
public class decimalbinario2 {
	public static void decimalbinario(int num) {
		int residuo = 0, potencia = 0, resultado = 0;
		do {
			residuo = num % 2;
			num = num / 2;
			resultado  += residuo * (int)Math.pow(10, potencia);
			potencia++;
		}while(num>0);
		System.out.println(resultado);
	}
	public static void inicio() {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Numero: ");
		num = Integer.valueOf(teclado.nextLine());
		decimalbinario(num);
		teclado.close();
	}
 
	public static void main(String[] args) {
		inicio();
	}
}