package tema3;

import java.util.Scanner;

public class dosNumeros {

	public static void main(String[] args) {
		// Realiza un programa que acepte dos números desde 
		//teclado e indique cuál de los números es mayor.  
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el número 1: ");
		double numero1 = sc.nextDouble();
		System.out.print("Introduzca el número 2: ");
		double numero2 = sc.nextDouble();
		if (numero1 > numero2) {
			System.out.println("El número 1 es mayor");
		}else if(numero1 == numero2) {
			System.out.println("Los numeros son iguales");
			
		}else {
			System.out.println("El número 2 es mayor");
			
		}

	}

}
