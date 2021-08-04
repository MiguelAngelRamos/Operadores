package ejercicios;

import javax.swing.JOptionPane;
public class AreaTrianguloValidado {

	public static void main(String[] args) {
		
	 double base = 0.0;
	 double altura = 0.0;
	 double area;
	 
	 // Vamos a perdir los datos
	 String baseStr = JOptionPane.showInputDialog(null, "Ingrese la base");
	 // "10"
	 // System.out.println("10" + "10");
	 // Cancelar 
	 // Operadores logicos && || "Tablas de verdad"
	 if((baseStr == null) || (baseStr.length() < 0)) {
		// siempre que sea true
		 System.exit(0);
	 } 
	 
	 String alturaStr = JOptionPane.showInputDialog(null, "Ingrese la altura");
	 if((alturaStr == null) || (alturaStr.length() < 0)) {
			// siempre que sea true
			 System.exit(0);
		 } 
	 // Validación
	 
	 try {
		// Conversiones String a Double
		 base = Double.parseDouble(baseStr);
		 altura = Double.parseDouble(alturaStr);
		 
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "Error debe ingresar un número");
		main(args);
		System.exit(0);
	} 
	 // El calculo del area
	 area=(base * altura)/2;
	 JOptionPane.showMessageDialog(null, "El Area del triangulo es: " + area);
	 

	}

}
