package ejercicios;

import java.util.Scanner;

public class ScannerValidado {

	public static void main(String[] args) {
		int numeroEntero = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número entero: ");
		
		try {
			numeroEntero = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Error debe ingresar un número entero");
			// Vuelvo a ejecutar el metodo main
			main(args); // Segundo llamado
			System.out.println("Cerrando");
			System.exit(0);
			//sc.close();
			
		} // fin try catch
		//sc.close();
	} // main
	


}