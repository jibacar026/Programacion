
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            if (i % 2 == 0) {
                System.out.printf("%6d\t", i);
            }
        }

        sc.close();
    }
}
