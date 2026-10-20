package tema3;

import java.util.Scanner;

public class mayorEdad {

	public static void main(String[] args) {
		// Realiza un programa que indique si el usuario es 
		// mayor de edad o no. (El usuario debe indicar su edad).  
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Introduzca su edad: ");
	    int edad = sc.nextInt();
	    if (edad>=18) {
	    	System.out.println("El usuario es mayor de edad");
	    }else {
	    	System.out.println("El usuario no es mayor de edad");
	    }
		sc.close();

	}

}
