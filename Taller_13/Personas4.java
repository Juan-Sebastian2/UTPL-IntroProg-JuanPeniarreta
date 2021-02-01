package personas4;

import java.io.*;
import java.util.Scanner;

public class Personas4 {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            File archivo = new File("data/Personas4.txt");
            Scanner entrada = new Scanner(archivo);
            String[] Nombre;
            if (!entrada.hasNextLine()) {
                throw new Exception("Archivo vacio");
            }
            System.out.println("Nombre           Edad    Sexo ");
            System.out.println("---------------- ------- -------");
            while (entrada.hasNextLine()) {
              Nombre= entrada.nextLine().split(":");
                if (Nombre[0].length() > 20) {
                    Nombre[0] = Nombre[0].substring(0, 20);
                }
                System.out.printf("%-20s %,12d %,10d%n", Nombre[0],
                        Integer.parseInt(Nombre[1]),
                        Integer.parseInt(Nombre[2]));
            }
            int edad = 0;
            while (edad <= 50) {
                System.out.println("Listado de  persoas con mas de 50  años");
                System.out.println("Nombre         Edad");
                System.out.println("--------------- ----");
            }
            
            
        } catch (FileNotFoundException e) {
            System.out.println("\nERROR! Archivo no encontrado");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERROR! Los datos están incompletos");
        } catch (NumberFormatException e) {
            System.out.println("\nERROR! Formato de datos incorrecto");
        } catch (Exception e) {
            System.out.println("\nERROR! " + e.getMessage());
        } 
    }

}
