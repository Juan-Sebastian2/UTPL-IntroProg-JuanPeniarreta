package simplificafraccion1;

import java.io.Console;

public class Simplificarfraccion1
{

    private static Object Convert;
     public static void Main(String[] args)
       Scanner sc = new Scanner(System.in);
     {
        float numero;
        int numerador, denominador = 10000;
     System.out.print("Ingrese los numeros de su fraccion: ");
     numero = sc.nextFloat();

        numero=Convert.ToSingle(Console.ReadLine());
        numerador = (int)(numero * 10000);
 
        for(int i = numerador; i>1; i--){
            if(numerador%i==0 && denominador%i==0){
                numerador=numerador/i;
                denominador=denominador/i;
            }
        }
 
        System.out.println("La fraccion reducida es: ")
     }
}
 