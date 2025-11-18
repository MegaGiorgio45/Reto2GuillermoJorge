package reto;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("Selecciona el tipo de conversión");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1: {
				Funciones1.menuLongitud(sc);
				break;
			}
			case 2: {
				Funciones1.menuPeso(sc);
				break;
			}
			case 3: {
				Funciones2.menuTemperatura(sc);
				break;
			}
			case 4: {
				Funciones2.menuVolumen(sc);
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
