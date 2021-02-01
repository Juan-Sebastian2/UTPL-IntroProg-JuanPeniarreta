package guardarautos1;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class GuardarAutos1 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        try {
            FileWriter archivo = new FileWriter("Vehiculos.txt");
            PrintWriter pw = new PrintWriter(archivo);
            short n;
            String placa,marca,modelo;
            int año,litros;
            System.out.print("cuantos vehiculos va a ingresar: ");
            n = sc.nextShort();
            sc.nextLine();
            
            for ( short i = 1; i <= n; i++) {
                System.out.println("Ingrese los datos de los vehiculos" + i + ": ");
                System.out.print("+----- Placa");
                placa = sc.nextLine();
                System.out.print("+----- Marca");
                marca = sc.nextLine();
                sc.nextLine();
                System.out.print("+----- Modelo");
                modelo = sc.nextLine();
                 System.out.print("+----- Año");
                año = sc.nextInt();
                 System.out.print("+----- Litros");
                litros = sc.nextInt();
                pw.println(placa + ", " + marca + ", " + modelo + "." + año + ". " + litros+"lt");
            }
            pw.close();
            
        } catch (Exception e) {
            System.err.println("ERROR: "+ e.toString());
        }
    }
    
}



