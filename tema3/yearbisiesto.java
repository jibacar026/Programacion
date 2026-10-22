package tema3;

import java.util.Scanner;

public class yearbisiesto {

	public static void main(String[] args) {
		/*
		 * Este programa solicita primero al usuario que introduzca un año 
		 * como un valor int y compruebe si es un año bisiesto.
		Un año es bisiesto si es divisible por 4 pero no por 100, o es divisible por 400.
 		(año % 4 == 0 && año % 100 != 0) || (año% 400 == 0)
*/

		
		Scanner sc = new Scanner(System.in);
		System.out.print("introduzca el año: ");
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("el año "+ year+ " es bisiesto ");
		}else {
			System.out.println("el año " +year+ " no es bisiesto ");
			
		}
		
		
	}

}
