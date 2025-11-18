package reto;

import java.util.Scanner;

public class Funciones2 {
	public static void menuTemperatura(Scanner sc) {


		int key=123;
		double x=0;
		while (key!=0) {
			System.out.println("1. Celsius a Fahrenhait");
			System.out.println("2. Fahrenhait a Celsius");
			System.out.println("0. Salir");
			String S_key=sc.nextLine();
			key=Integer.parseInt(S_key);
			switch (key) {
			case 1:
				x=Funciones.dimeDouble("Dime Celsius", sc);
				System.out.println(x+" Celsius son "+celsiusFahrenhait(x)+" Fahrenhait" );
				break;
			case 2:
				x=Funciones.dimeDouble("Dime Fahrenhait", sc);
				System.out.println(x+" Fahrenhait son "+FahrenhaitCelsius(x)+" Celsius" );
				break;
			case 0:

				break;
			default:
				System.out.println("Opción no válida");
				
				break;
			}
		}

	}
	public static void menuVolumen(Scanner sc) {


		int key=123;
		double x=0;
		while (key!=0) {
			System.out.println("1. Litros a Galones");
			System.out.println("2. Galones a Litros");
			System.out.println("0. Salir");
			String S_key=sc.nextLine();
			key=Integer.parseInt(S_key);
			switch (key) {
			case 1:
				x=Funciones.dimeDouble("Dime Litros", sc);
				System.out.println(x+" Litros son "+litrosGalones(x)+" Galones" );
				break;
			case 2:
				x=Funciones.dimeDouble("Dime Galones", sc);
				System.out.println(x+" Galones son "+galonesLitros(x)+" Litros" );
				break;
			case 0:

				break;
			default:
				System.out.println("Opción no válida");
				
				break;
			}
		}

	}
	public static double celsiusFahrenhait(double x) {
		return (x*9/5) + 32;
	}
	public static double FahrenhaitCelsius(double x) {
		return (x-32)*5/9;
	}
	public static double litrosGalones(double x) {
		return x*0.26417;
	}
	public static double galonesLitros(double x) {
		return 1/litrosGalones(x);
	}
}
