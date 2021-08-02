package scanner;
import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {
		// creamos una instancia de Scanner "sc"
		Scanner sc = new Scanner(System.in);
		
		// Entrada de una cadena (String) "sc.nextLine();"
		 System.out.println("Ingrese su nombre: ");
		 String nombre = sc.nextLine();
		 System.out.println(nombre);
		
		// Entrada de un caracter "sc.next().charAt(0);"
		System.out.println("Ingrese su genero: ");
		char genero = sc.next().charAt(0);
		System.out.println(genero);
		
		// Entrada de valores numericos
		
		// para ingresar un entero "sc.nextInt();"
		int edad = sc.nextInt();
		System.out.println("edad: " + edad );
		// para ingresar un long "sc.nextLong();"
		long numeroCelular = sc.nextLong();
		System.out.println("numeroCelular: " + numeroCelular );
		// decimal
		double saldo = sc.nextDouble();
		System.out.println("saldo: " + saldo);
		

	}

}
