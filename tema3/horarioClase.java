package tema3;

import java.util.Scanner;

public class horarioClase {

	public static void main(String[] args) {
		// Escribe un programa que pida por teclado un día de la
		// semana y que diga qué asignatura toca a primera hora ese día.
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el dia de la semana para ver la asignatura: ");
		String diaUsuario = sc.next();

		switch (diaUsuario.toLowerCase()) {
		
		case "lunes":
			System.out.println("matematicas");
			break;
		case "martes":
			System.out.println("lengua");
			break;
		case "miercoles":
			System.out.println("educacion fisica");
			break;
		case "jueves":
			System.out.println("matematicas)");
			break;
		case "viernes":
			System.out.println("geografia");
			break;
		case "sabado":
			System.out.println("dia no lectivo");
			break;
		case "domingo":
			System.out.println("dia no lectivo");
			break;
			
			default:
				System.out.println("Dia desconocido");
		}
		

	}

}
