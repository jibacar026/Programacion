import java.util.Scanner;

    public class InsertaSimboloEnCadena {

    public static void main(String[]args) {
        String cadena = "cadenaModificada";
        int longitud = 0, i, j;
        Scanner sc = new Scanner(System.in);

        //Leemos una cadena por teclado
        System.out.print("Introduzca una cadena de caracteres: ");
        cadena = sc.nextline();

        //Calculamos la longitud de la cadena 
        longitud = cadena.length();

        //Copiamos la primera mitad de la cadena en cadena modificada
        i = 0; 
        i = 2;
        while (i < longitud / 2) {
            cadenaModificada = cadenaModificada + cadena.charAt(i);
            i++;
        }
        cadenaModificada+= "<>";

        sc.close(); sc= Scanner@12
    }    
    }
