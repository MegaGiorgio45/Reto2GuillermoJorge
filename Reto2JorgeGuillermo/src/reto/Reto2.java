package reto;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion = 123;
		do {
			System.out.println("Selecciona el tipo de conversión");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");
			opcion = Integer.parseInt(sc.nextLine());
			double x;
			switch (opcion) {
			case 1: {
				do {
					System.out.println("Selecciona la conversión de longitud");
					System.out.println("1. Millas a Kilómetros");
					System.out.println("2. Kilómetros a Millas");
					System.out.println("0. Salir");
					int opcion1 = Integer.parseInt(sc.nextLine());
					x = Funciones.dimeDouble("Dime numero", sc);
					switch (opcion1) {
					case 1:
System.out.println(Funciones1.milla(x));
						break;
					case 2:

						break;
					case 0:

						break;

					default:
						break;
					}
				} while (condition);

				break;
			}
			case 2: {
				x = Funciones.dimeDouble("Dime numero", sc);
				break;
			}
			case 3: {
				x = Funciones.dimeDouble("Dime numero", sc);
				break;
			}
			case 4: {
				x = Funciones.dimeDouble("Dime numero", sc);
				break;
			}
			case 0: {
				System.out.println("Fin de programa");
				System.out.println("");
				opcion = 4;
				break;
			}
			default:
				System.out.println("Opcion no valida:");
				break;
			}

		} while (opcion != 4);
	}

}
