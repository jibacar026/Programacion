package tema6;

public class ej02y03 {
	
	public static int max(int numero1, int numero2) {
		return Math.max(numero1, numero2);	
	}
	//ejercicio3
	public static int max(int numero1, int numero2,int numero3) {
		return max(max(numero1, numero2),numero3);
		
	}

}
