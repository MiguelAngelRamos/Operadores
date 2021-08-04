package ejercicios;

import java.util.Scanner;
public class AreaTriangulo {

	public static void main(String[] args) {
		// El area de un triangulo se calcula por la siguiente formula
		// area = (base*altura)/2;
		double area;
		double base;
		double altura;
		
		Scanner sc = new Scanner(System.in);
		
		/* Datos que se les va pedir al usuario*/
		
		System.out.println("Ingrese la base: ");
		base = sc.nextDouble();
		
		System.out.println("Ingrese la altura: ");
		altura = sc.nextDouble();
		
		/* El calculo del area */
	
		area =(base * altura)/2;
		
		/*Presentamos la informacion al usuario*/
		System.out.println("El Area del triangulo es: " + area);
		sc.close();
		

	}

}
