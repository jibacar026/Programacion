package tema6;

public class ej04 {
	public static void main(String[]args) {
		double r = 20;
		double h =10;
		volCilindro(r,h);
		
	}
	
	
	public static void volCilindro(double radio, double altura) {
		// pi * r^2 * h
		double volCilindro = Math.PI*Math.pow(radio, 2)*altura;
		System.out.println("El volumen del cilindro es: "+volCilindro);
		
	}

}
