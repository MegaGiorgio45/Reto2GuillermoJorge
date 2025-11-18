package reto;

public class Funciones2 {
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
