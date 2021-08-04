package ejercicios;

import java.util.Scanner;

public class CalculoFahrenheit {

	public static void main(String[] args) {
		
		/* Programa que lea una cantidad de grados centigrados 
		 * y la pase a grados Fahrenheit
		 * La formula es:  
		 *                 fahrenheit = 32 + (9*centigrados/5)
		 * 
		 * */
         //°C   °F
		double gradosC;
		double gradosF;
		Scanner sc = new Scanner(System.in);
		
		// Preguntar al usuario
		System.out.println("Introduce grados Centígrados: ");
		gradosC = sc.nextDouble();
		
		// Es el calculo de fahrenheit
		
		gradosF = 32 + (9*gradosC/5);
		System.out.println(gradosC + "°C = " + gradosF + " °F");
		sc.close();
		
	}

}
