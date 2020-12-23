package Venta5;

import java.util.Scanner;

public class Venta5 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    char Ls, Asus, Sala;
    short  articulos,seleccion;
    int iva,subtotal,total;
    float precio1 , precio2, precio3;
    iva = (int) 0.12;
    precio1 = (float) 765.87;
    precio2 = (float) 2.324.56;
    precio3 = (float) 655.99;
    

    System.out.print("Ingrese la cantidad de articulos a comprar: ");
    articulos = sc.nextByte();
    System.out.println("\nSeleccion de articulo: ");
    System.out.println("   1) su articulo es un televisor LG");
    System.out.println("   2) su articulos es un computador ASUS");
    System.out.println("   3) su articulo es un juego de sala");
    System.out.print("Elija una opción (1-3): ");
    seleccion = sc.nextByte();
    switch (seleccion) {
        case 1:
            if (short)(articulos = 4) {
                subtotal = (int) (precio1 + iva);
                total = (int) (precio1 * iva);
            break;
        case 2:
            if (articulos = 10) {
                subtotal = precio2 + iva;
                total = precio2 * iva;
            break;
        case 3:
            if (articulos = 7) {
               subtotal = precio3 + iva;
                total = precio3 * iva;
            break;
       
    }           
  }
}

