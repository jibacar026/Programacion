package tema3;

import java.util.Scanner;

public class tresNumeros {

	public static void main(String[] args) {
		// Realiza un programa que acepte tres números desde 
		//teclado e indique cuál de los números es el más pequeño. 
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[3];
		
		//Rellenar el array
		
		for(int i = 0; i< numeros.length; i++) {
			System.out.print("Introduzca el numero "+ (i+1) + ": ");
			numeros[i] = sc.nextInt();
		}
		
		int min = numeros[0];
		int posicion=0;
		
		for(int i = 0; i<numeros.length; i++) 
		{
			if(numeros[i] < min) 
			{
				min = numeros[i];
				posicion = i+1;
			}
		}
	
		System.out.println("El numero menor es el "+min+" que se encuentra en la posición "+posicion);

		sc.close();

	}

}
