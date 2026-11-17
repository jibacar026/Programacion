package tema6;

public class ej05 {

	public static int contadorPrimos(int numero) {

		int contador = 0;

		for (int i = 2; i <= numero; i++) {
			if (numero % i == 0)
				if (esPrimo(i))
					contador++;
		}
		
		return contador;
	}

	public static boolean esPrimo(int numero) {
		if (numero <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int numero = 7;	
		System.out.println("El  numero "+numero + " tiene "+ contadorPrimos(numero)+ " contadores primos");
		
	}

}
