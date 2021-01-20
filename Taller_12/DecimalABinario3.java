package decimalabinario3;

import java.util.Scanner;

public class DecimalABinario3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduzca numero >0: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println();
        System.out.print("Binario: ");
        EnteroBi(n);
        System.out.println();
    }

    public static void EnteroBi(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            EnteroBi(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
}