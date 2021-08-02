package operadoresIncDcr;

public class IncrementoDecremento {

	public static void main(String[] args) {
		
		int contador = 0;
		
		/* INCREMENTO */
		contador = contador + 1;
		// 0     =   0      + 1
		// valor : 1
		System.out.println(contador);
		contador++; // contador = contador + 1;
		System.out.println(contador);
		
		// contador = 2
		System.out.println(contador++); // primero se imprime y luego se evalue (incrementa)
		System.out.println(++contador); // primero se evalua (incrementa) y luego se imprime
		
		/* DECREMENTO */
		int contadorDecremento = 20;
		contadorDecremento = contadorDecremento - 1;
		// 20              =   20               - 1
		// 19
		contadorDecremento--; // contadorDecremento = contadorDecremento - 1;
		System.out.println(contadorDecremento);
		System.out.println(contadorDecremento--); // imprime y luego disminuye
		System.out.println(--contadorDecremento); // disminuye y luego imprime
		
		int contadorOtroNumero = 30;
		contadorOtroNumero -=5; //contadorOtroNumero = contadorOtroNumero -5
		contadorOtroNumero = contadorOtroNumero + 5; // contadorOtroNumero +=5;
		System.out.println(contadorOtroNumero);
		System.out.println(contadorOtroNumero -=5); 
		

	}

}
