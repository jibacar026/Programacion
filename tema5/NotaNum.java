
import java.util.Scanner;

public class NotaNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una nota numérica");
        double nota = sc.nextDouble();

        if (nota < 0.0 || nota > 10.0) {
            System.out.println("Nota no válida");
        } else if (nota >= 9.0) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7.0) {
            System.out.println("Notable");
        } else if (nota >= 6.0) {
            System.out.println("Bien");
        } else if (nota >= 5.0) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Suspenso");
        }

        sc.close();
    }
}

