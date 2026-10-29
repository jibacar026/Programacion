import java.util.Scanner;
public class barajafrancesa {
    public static void main(String[] args) {
        into palo = (int) (Math.random() * 4.0);
        int valor = (int) (Math.random() * 13.00);
        Scanner sc = new Scanner(System.in);

        System.out.ptintln("El palo de la baraja es: ");
        if (palo == 0)
            System.out.ptintlm("Picas");
        else if (palo == 1)
            System.out.println("Corazones");
        else if (palo == 2)
            System.out.println("Diamantes");
        else if (palo == 3)
            System.out.println("Treboles");
        else if (palo == 4)
            
            System.out.println("El valor de la carta es: "+ valor);
            sc.close();
        

    }
}
