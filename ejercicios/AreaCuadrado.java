package ejercicios;
import java.util.Scanner;
public class AreaCuadrado {

	public static void main(String[] args) {
		// El area del cuadrado se calcula: area = lado * lado;
		double lado;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el lado: ");
		lado = sc.nextDouble();
		area = lado * lado;
		System.out.println("El area del cuadrado de lado " + lado + " es: " + area);
	}

}
