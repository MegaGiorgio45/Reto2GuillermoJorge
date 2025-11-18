package reto;

import java.util.Scanner;

public class Funciones {
	public static double dimeDouble(String texto, Scanner sc)
	{
		do
		{
		try {
			System.out.println(texto);
			String s = sc.nextLine();
			double d= Double.parseDouble(s);
			return d;

		} catch (Exception e) {
			System.out.println("Formato incorrecto. No es un número");
		}
		}while(true);
	}
}
