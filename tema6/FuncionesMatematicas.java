package tema6;

import java.util.Scanner;

public class FuncionesMatematicas {

	public static boolean esCapicua(int numero) {
		return numero == voltea(numero);
	}
	
	public static double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
	
	public static int digitos(int numero) {
		
		int contador = 1;
		while(numero > 10) {
		
			numero = numero/10;
			contador++;
		}
		return contador;
	}
	
	public static int voltea(int numero) {
		int invertido = 0;
		while (numero > 0) {
			int digito = numero % 10;
			invertido = invertido * 10 + digito;
			numero = numero / 10;
		}
		return invertido;	
	}
	
	public static int quitaPorDetras(int numero, int digitos) {
		return numero/(10*digitos);	
	}
	
	public static int pegaPorDelante(int numero, int digito) {
		int multiplicador = (int) potencia(10, digitos(numero));
		return (digito * multiplicador) + numero;	
	}
	
	
	
	
	
	

}
