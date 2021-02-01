package paises1;

import java.io. *;
import java. util. Scanner;

public class Paises1 {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            File archivo = new File("data/Paises.txt");
            Scanner entrada = new Scanner(archivo);
            String [] Nombre;
            if (! entrada. hasNextLine ()) {
                throw new Exception ("Archivo vacío");
            }
            System.out.println("NombrePais       CodigoPais   Poblacion Superficie ");
            System.out.println("---------------- ------------ --------- -----------");
            while (entrada. hasNextLine ()) {
              Nombre= entrada.NextLine(). Split (":");
                if (Nombre [0]. length () > 20) {
                    Nombre [0] = Nombre [0]. substring (0, 20);
                }
                System.out. printf ("%-20s %,12d %,10d%n", Nombre [0],
                        Integer.parseInt(Nombre [1]),
                        Integer.parseInt(Nombre [2]));
            }
            int edad = 0;
            int superficie = 0;
            while (superficie <= 1000) {
                System.out.println("NombrePais       CodigoPais   Poblacion Superficie ");
            System.out.println("----------------     ----------   --------- -----------");
            }
              
        } catch (FileNotFoundException e) {
            System.out.println("\nERROR! Archivo no encontrado");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERROR! Los datos están incompletos");
        } catch (NumberFormatException e) {
            System.out.println("\nERROR! Formato de datos incorrecto");
        } catch (Exception e) {
            System.out.println("\nERROR! " + e. getMessage ());
        } 
    }

}
