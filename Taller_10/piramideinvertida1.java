package piramideinvertida1;

import java.util.Scanner;
 
public class piramideinvertida1 {
 
    public static void main(String[] args) {
        int ALT;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduzca la altura de la piramide: ");
            ALT = sc.nextInt();
        }
 
        System.out.println();
        for(int altura = 1; altura<=ALT; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=ALT-altura; blancos++){
                System.out.print(" ");
            }
 
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}