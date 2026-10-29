package tema3;

import java.util.Scanner;

public class horoscopo {

	public static void main(String[] args) {
		// Escribe un programa que nos diga el horóscopo
		// a partir del día y el mes de nacimiento.
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca su mes de nacimiento: ");
		int mes = sc.nextInt();

		System.out.print("Introduzca su día de nacimiento: ");
		int dia = sc.nextInt();

		String signo = "desconocido";

		// Comprobaria los meses
		switch (mes) {
		// Enero
		case 1:
			if (dia <= 19) {
				signo = "Capricornio";
			} else {
				signo = "Acuario";
			}
			break;

		// Febrero
		case 2:
			if (dia <= 18) {
				signo = "Acuario";
			} else {
				signo = "Piscis";
			}

			break;

		// Marzo
		case 3:
			if (dia <= 20) {
				signo = "Piscis";
			} else {
				signo = "Aries";
			}

			break;

		// Abril
		case 4:
			if (dia <= 19) {
				signo = "Aries";
			} else {
				signo = "Tauro";
			}

			break;
		// Mayo
		case 5:
			if (dia <= 20) {
				signo = "Tauro";
			} else {
				signo = "Géminis";
			}

			break;
		// Junio
		case 6:
			if (dia <= 20) {
				signo = "Géminis";
			} else {
				signo = "Cáncer";
			}

			break;
		// Julio
		case 7:
			if (dia <= 22) {
				signo = "Cáncer";
			} else {
				signo = "Leo";
			}

			break;
		// Agosto
		case 8:
			if (dia <= 22) {
				signo = "Leo";
			} else {
				signo = "Virgo";
			}

			break;
		// Septiembre
		case 9:
			if (dia <= 22) {
				signo = "Virgo";
			} else {
				signo = "Libra";
			}

			break;
		// Octubre
		case 10:
			if (dia <= 22) {
				signo = "Libra";
			} else {
				signo = "Escorpio";
			}

			break;
		// Noviembre
		case 11:
			if (dia <= 21) {
				signo = "Escorpio";
			} else {
				signo = "Sagitario";
			}

			break;
		// Diciembre
		case 12:
			if (dia <= 22) {
				signo = "Sagitario";
			} else {
				signo = "Capricornio";
			}

			break;
		}

		System.out.println("Su horoscopo es " + signo);

	}

}
