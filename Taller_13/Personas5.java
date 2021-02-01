package personas5;

import java.io.*;
import java.util.*;

public class Personas5 {

    // Programa que lee archivo de datos personales y calcula 
    // la edad promedio solo de mujeres
    public static void main(String[] args) {
        try {
            File archivo = new File("data/Personas.txt");
            Scanner f = new Scanner(archivo);
            String[] persona;
            ArrayList<String> nombres = new ArrayList();
            ArrayList<String> generos = new ArrayList();
            ArrayList<Integer> edades = new ArrayList();
            while (f.hasNextLine()) {
                persona = f.nextLine().split(",");
                nombres.add(persona[0]);
                generos.add(persona[1]);
                edades.add(Integer.parseInt(persona[2]));
            }
            f.close();
            int suma = 0, cf = 0;
            for (int i = 0; i <= edades.size() - 1; i++) {
                if (generos.get(i).equals("F")) {
                    suma += edades.get(i);
                    cf++;
                }
            }
            double media = (double) suma / cf;
            System.out.println("Promedio: " + media);
        } catch (Exception e) {
            System.err.println("ERROR:\n" + e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERROR! Los datos estan incompletos");
        } catch (FileNotFoundException e) {
            System.out.println("\nERROR! archivo no encontrado");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERROR! nombre mal colocado");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERROR! genero mal colocado");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERROR! edad mal colocada");
        } catch (NumberFormatException e) {
            System.out.println("\nERROR! numero ingresado incorrecto");
        }
    }

}