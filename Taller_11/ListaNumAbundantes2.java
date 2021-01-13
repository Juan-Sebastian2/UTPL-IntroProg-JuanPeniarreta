package listaabundantes2;
import java.util.Scanner;
public class ListaNumAbundantes2 {

    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, nat, suma_div;
        int a = 0;
        System.out.print("Ingrese el límite de abundantes a mostrar: ");
        n = sc.nextInt();
        System.out.print("\nLos números abundantes entre 0 y " + n + " son: ");
        for (nat = 0; nat <= n; nat++) {
      
            suma_div = 0;
            for (int c = 1; c < nat; c++) {
                if (nat % c == 0) {
                    suma_div += c;
                }
            }
            if (suma_div > nat) {
                System.out.print(nat + " ");
            }
        }
        System.out.println();
        
        for (int i = 1; i < n;i++) {
        }
        int i = 0;
        if (int i=1; i<n; i++) {
        }
        if (n%i ==0) {
               a = a+ i;
        if (a > n) {
            System.out.print("El numero es abundante");
        } else {
            System.out.print("El numero no es abundante");
        }
    }
        return 0;

    }
}

