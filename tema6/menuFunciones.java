package tema6;

import java.util.Scanner;

public class menuFunciones {

	public static void main(String[]args) {
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca la opcion deseada");
			System.out.println("1 - Capicua");
			System.out.println("2 - potencia");
			System.out.println("3 - digitos");
			System.out.println("4 - voltea");
			System.out.println("5 - quita por detras");
			System.out.println("6 - pega por delante");
			System.out.println("0 - Salir");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.print("Introduzca un numero para saber si es capicua: ");
				if(FuncionesMatematicas.esCapicua(sc.nextInt()))
					System.out.println("Es capicua");
				else
					System.out.println("No es capicua");
				
				
				break;
			
			
			
			}
						
			
			
			
			
		}while(opcion!=0);
		
		
		
	}

}
