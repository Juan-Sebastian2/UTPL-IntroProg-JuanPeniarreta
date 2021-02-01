package estadisticasauto1;

import java.io.*;
import java.util.Scanner;

public class EstadisticasAuto1 {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            File archivo = new File("data/Autos1.txt");
            Scanner entrada = new Scanner(archivo);
            String[] placa,marca,modelo;
            if (!entrada.hasNextLine()) {
                throw new Exception("Archivo vacio");
            }
            System.out.println("PROVINCIA            POBLACION    AREA (Km2)");
            System.out.println("-------------------- ------------ ----------");
            while (entrada.hasNextLine()) {
              
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nERROR! Archivo no encontrado");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERROR! Los datos están incompletos");
        } catch (NumberFormatException e) {
            System.out.println("\nERROR! Formato de datos incorrecto");
        } catch (Exception e) {
            System.out.println("\nERROR! " + e.getMessage());
        } finally {
            System.out.println("\nGRACIAS POR USAR EL PROGRAMA");
        }
    }

}