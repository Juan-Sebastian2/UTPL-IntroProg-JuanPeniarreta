import java.util.Scanner;

public class EntadaDatos1 {
	public static void main(Sting[] args) {
	Scanner sc = new Scanner(System.in);
	String nombres, apellidos;
	byte edad;
	int km_viajados;
	float estatura;

	System.out.print("Cuales son sus nombres? ");
	nombres = sc.nextline();
	System.out.print("Cuales son sus apellidos? ");
	apellidos = sc.nextline();
	System.out.print("Cuantos anios tiene?: ");
	edad = sc.nextByte();
	System.out.print("Cuantos km ha viajado?: ");
	km_viajados = sc.nextInt();
	System.out.print("Cual es su estatura en metros?: ");
	estatura = sc.nextFloat();

	System.out.println("\nAgradecemos sus respuestas\n");
	System.out.print("Su nombre es " + nombres + " " + apellidos + ", ");
	System.out.print("tiene " + edad + "anios, mide " + estatura + "m ");
	System.out.println("y ha viajado " + km_viajados + "km. ");
	}
}