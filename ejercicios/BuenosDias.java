package ejercicios;

import java.util.Scanner;

public class BuenosDias {

	public static void main(String[] args) {
		// Programa que lea un nombre y muestre por consola 
		// Buenos dias "nombre"
		String nombre; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un nombre: ");
		
		nombre = sc.nextLine(); // para ingresar un cadena
		
		// Presentamos al usuario
		System.out.println("Buenos Días: " + nombre);
	

	}

}
