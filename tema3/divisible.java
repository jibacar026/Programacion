package tema3;

import java.util.Scanner;

public class divisible {

	public static void main(String[] args) {
/*
Aquí hay un programa que verifica si un número es divisible por 2 y 3, 
si un número es divisible por 2 ó 3, y si un número es divisible por 2 ó 3 pero no por ambos:
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("introduzca un numero: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0 && numero %3 ==0) {
			System.out.println("El numero "+ numero +" es divisible entre 2 y 3");
		}
			
		if(numero % 2 == 0 || numero % 3== 0) {
			System.out.println("El numero "+ numero +" es divisible entre 2 o 3");
			
			if(!(numero % 2 == 0 && numero %3 ==0)) {
				System.out.println("El numero "+ numero +" es divisible entre 2 0 3 pero no ambos");
			}
			
		}
		
		
        
	}

}
