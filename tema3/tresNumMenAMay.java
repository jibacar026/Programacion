package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class tresNumMenAMay {

	public static void main(String[] args) {
		// Realiza un programa que acepte tres números desde 
		// teclado y los muestre ordenados de menor a mayor.
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[3];
		
		
		for(int i = 0; i< numeros.length; i++) 
		{
			System.out.print("Introduzca el numero "+ (i+1) +": ");
			numeros[i]= sc.nextInt();	
		}
		
		
		//Ordena el array
		 Arrays.sort(numeros);
		
		
		for(int i = 0; i< numeros.length; i++) 
		{
			System.out.println(numeros[i]);
		}
			

	}

}
