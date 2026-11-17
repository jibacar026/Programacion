package tema6;

public class ej06 {

	public static boolean sonAmigos(int numero1, int numero2) {
		if (numero1 <= 0 || numero2 <= 0 || numero1 == numero2)
			return false;
		return sumaDivisioresPropios(numero1) == numero2 && sumaDivisioresPropios(numero2) == numero1;
	}

	public static int sumaDivisioresPropios(int numero) {
		int suma = 0;

		for (int i = 1; i <= numero / 2; i++) {
			if (numero % i == 0) {
				suma += i;
			}
		}

		return suma;
	}

	public static void main(String[] ars) {
		int numero1 = 220;
		int numero2 = 284;

		if (sonAmigos(numero1, numero2)) {
			System.out.println("Los numeros " + numero1 + " y " + numero2 + " son amigos");
		} else {
			System.out.println("Los numeros " + numero1 + " y " + numero2 + " NO son amigos");
		}
	}

}
