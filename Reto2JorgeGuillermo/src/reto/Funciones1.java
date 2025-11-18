package reto;

import java.util.Scanner;

public class Funciones1 {

	public static double kilo(double x) {
		return x * 2.20462;
	}

	public static double libra(double x) {
		return x / 2.20462;
	}

	public static void menuPeso(Scanner sc) {
		int opcion = 0;
		double x = 0;
		do {
			System.out.println("Selecciona la conversión de peso");
			System.out.println("1. Libras a Kilogramos");
			System.out.println("2. Kilogramos a Libras");
			System.out.println("0. Salir");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1:
				x = Funciones.dimeDouble("Dime libras", sc);
				System.out.println(x + " libras son " + (Funciones1.kilo(x)) + " kilogramos");
				System.out.println("");
				break;
			case 2:
				x = Funciones.dimeDouble("Dime kilogramos", sc);
				System.out.println(x + "kilogramos son " + (Funciones1.libra(x)) + " libras");
				System.out.println("");
				break;
			case 0:
				System.out.println("Fin de programa");
				System.out.println("");
				opcion = 2;
				break;
			default:
				System.out.println("Opcion no valida:");
				System.out.println("");
				break;
			}
		} while (opcion != 2);
	}

	public static double kilometro(double x) {
		return x / 1.609;
	}

	public static double milla(double x) {
		return x * 1.609;
	}

	public static void menuLongitud(Scanner sc) {
		int opcion = 0;
		double x = 0;
		do {
			System.out.println("Selecciona la conversión de longitud");
			System.out.println("1. Millas a Kilómetros");
			System.out.println("2. Kilómetros a Millas");
			System.out.println("0. Salir");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1:
				x = Funciones.dimeDouble("Dime millas", sc);
				System.out.println(x + " millas son " + (Funciones1.kilometro(x)) + " kilómetros");
				System.out.println("");
				break;
			case 2:
				x = Funciones.dimeDouble("Dime kilómetros", sc);
				System.out.println(x + "kilómetros son " + (Funciones1.milla(x)) + " millas");
				System.out.println("");
				break;
			case 0:
				System.out.println("Fin de programa");
				System.out.println("");
				opcion = 2;
				break;
			default:
				System.out.println("Opcion no valida:");
				System.out.println("");
				break;
			}
		} while (opcion != 2);
	}
}
