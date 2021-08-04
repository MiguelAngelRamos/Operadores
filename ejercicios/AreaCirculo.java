package ejercicios;

import java.util.Scanner;
import java.lang.Math;
public class AreaCirculo {

	public static void main(String[] args) {
		// PI = 3.14
		// El area circulo se calcula "Area = PI * RADIO * RADIO"
		// final double PI = 3.14;// con la palabra final declaramos una constante
		double radio;
		double area;
		
		System.out.println("Ingrese el radio: ");
		
		Scanner sc = new Scanner(System.in);
		radio = sc.nextDouble();
	
		// calculo del area
		//  area = PI * radio * radio;
		area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("El area del circulo, con radio: " + radio + " es: " + area);
		
	}

}
