
package edadexacta1;

import java.util.Scanner;


public class EdadExacta1 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio_actual, anio_nacimiento, mes_actual, mes_nacimiento;
        int dia_actual, dia_nacimiento;
        int dia, mes, año;
        
        
        System.out.print("Ingrese el año actual: ");
        anio_actual = sc.nextShort();
        System.out.print("Ingrese su año de nacimiento: ");
        anio_nacimiento = sc.nextShort();
        System.out.print("Ingrese el mes actual en numero: ");
        mes_actual = sc.nextShort();
        System.out.print("Ingrese el mes de nacimiento: ");
        mes_nacimiento = sc.nextShort();
        System.out.print("Ingrese el dia actual: ");
        dia_actual = sc.nextShort();
        System.out.print("Ingrese su dia de nacimiento: ");
        dia_nacimiento = sc.nextShort();
        
        dia = dia_actual - dia_nacimiento;
        mes = mes_actual - mes_nacimiento;
        año = anio_actual - anio_nacimiento;
        
       if (dia_actual < dia_nacimiento) {
           dia_actual = (dia_actual + 30);
           mes_actual = (mes_actual - 1);
       }
       if (mes_actual < mes_nacimiento) {
           mes_actual = (mes_actual + 12);
           anio_actual = (anio_actual - 1);     
    }
       if (anio_actual < anio_nacimiento) {
           System.out.println("El año actual es menor a la fecha de nacimeinto");
           
       }
       
       System.out.println("\nSu dia es: " + dia + "exacto");
       System.out.println("\nSu mes es: " + mes + "exacto");
       System.out.println("\nSu año es: " +año + "exacto");
    
}
}