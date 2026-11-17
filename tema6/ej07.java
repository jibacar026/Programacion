package tema6;

import java.util.Scanner;

public class ej07 {

	public static int LeeDiaValido(int a, int m) {
		Scanner sc = new Scanner(System.in);
		boolean diaCorrecto = false;
		int diaMes = 0;
		do {
			System.out.print("Introduzca el día del mes: ");
			diaMes = sc.nextInt();
			int diaMaxMes = 31;

			// Febrero 28 / 29(Bisiesto)
			if (m == 2) {
				if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
					diaMaxMes = 29;
				} else {
					diaMaxMes = 28;
				}

				// Abril, Junio, Septiembre y noviembre 30 días
			} else if (m == 4 || m == 6 || m == 9 || m == 11) {
				diaMaxMes = 30;
			}

			if (diaMes >= 1 && diaMes <= diaMaxMes) {
				diaCorrecto = true;
			} else {
				System.err.println("El día introducido no es correcto");
			}

		} while (diaCorrecto == false);

		return diaMes;
	}

	public static int LeeAñoValido() {
		Scanner sc = new Scanner(System.in);
		int año = 0;
		do {
			System.out.print("Introduzca el año: ");
			año = sc.nextInt();
			if (año < 1583)
				System.err.println("El año introducido no es correcto, introduzca un año mayor o igual a 1583");

		} while (año < 1583);

		return año;
	}

	public static int LeeMesValido(int a) {
		Scanner sc = new Scanner(System.in);
		int mes = 0;

		do {
			System.out.print("Introduzca el mes: ");
			mes = sc.nextInt();
			if (mes < 1 || mes > 12)
				System.err.println("El mes introducido no es correcto, introduzca un mes entre el 1 y el 12");
		} while (mes < 1 || mes > 12);
		return mes;

	}

	public static int DiaSemana(int dia, int mes, int año) {
		int a = mes - 2;
		int b = año % 100;
		int c = año / 100;

		// Enero, Febrero
		if (mes <= 2) {
			a = mes + 10;
			b = (año - 1) % 100;
			c = (año - 1) / 100;
		}

		return (700 + (26 * a - 2) / 10 + dia + b + b / 4 + c / 4 - 2 * c) % 7;
	}

	public static String DiaEnLetra(int nDia) {
		switch (nDia) {
		case 0:
			return "Domingo";
		case 1:
			return "Lunes";
		case 2:
			return "Martes";
		case 3:
			return "Miércoles";
		case 4:
			return "Jueves";
		case 5:
			return "Viernes";
		case 6:
			return "Sábado";

		default:
			return "Error";
		}
	}

	public static void main(String[] args) {
		int a = LeeAñoValido();
		int m = LeeMesValido(a);
		int d = LeeDiaValido(a, m);
		int diaSem = DiaSemana(d, m, a);
		String diaLetra = DiaEnLetra(diaSem);

		System.out.println("En esa fecha el día fue " + diaLetra);

	}

}
