package numeroarmstrong1;
import java.util.Scanner;
public class NumeroArmstrong1 {

    public static void main(String[] args) {
        
        int n;
        n = leer();
        armstrong(n);

    }
    private static void armstrong(int numero) {
        int a, b, c;
        a = numero %10;
        b = (numero%100)/10;
        c = numero/10;
        if (numero ==(a*a*a+b*b*b+c*c*c)) {
           System.out.println("Si es un numero ARMSTRONG"); 
        } else {
            System.out.println("No es un numero ARMSTRONG");
        }
    }
    private static int leer() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero");
        num = sc.nextInt();
        return num;
      
    }   
}
