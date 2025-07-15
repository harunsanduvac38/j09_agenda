package agenda.util;

import java.util.Scanner;

public class Util {

	static Scanner tec = new Scanner(System.in);
	
	public static int leerInt() {
		int num = tec.nextInt();
		tec.nextLine();
		return num;
	}
	
	public static int leerInt(String mensaje) {
		System.out.print(mensaje + " ");
		return leerInt();
	}
	
	public static double leerDouble() {
		double num = tec.nextDouble();
		tec.nextLine();
		return num;
	}
	
	public static double leerDouble(String mensaje) {
		System.out.print(mensaje + " ");
		return leerDouble();
	}
	
	public static String leerString() {
		return tec.nextLine();
	}
	
	public static String leerString(String mensaje) {
		System.out.print(mensaje + " ");
		return leerString();
	}
	
	public static int random (int desde, int hasta) {
		return (int)(Math.random() * (hasta - desde + 1) + desde);
	}
	
	public static int random (int hasta) {
		return random(1, hasta);
	}
	
	public static boolean esFechaCorrecta(int dia, int mes, int anyo) {
		if (dia < 0 || mes < 0 || anyo < 1600 || mes > 12)
			return false;
		if (dia > cantDiasMes(mes, esBisiesto(anyo)))
			return false;
		return true;
	}
	
	public static boolean esBisiesto(int anyo) {
		return anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0);
	}
	
	public static int cantDiasMes (int mes, boolean esBisiesto) {
		int dias;
		switch (mes) {
		case 2:
			dias = 28;
			if (esBisiesto)
				dias++;
			break;
		case 1, 3, 5, 7, 8, 10, 12:
			dias = 31;
			break;
		case 4, 6, 9, 11:
			dias = 30;
			break;
		default:
			dias = 0;;
		}
		return dias;
	}
}
