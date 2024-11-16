/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicacion
 * @author rbr - 161124
 *
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 161124
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int entrada, contador;
		Scanner sc = new Scanner(System.in);
		
		//Solicito al usuario el numero
		System.out.println("Introduce un numero entero: ");
		entrada = sc.nextInt();
		
		//Cuento los digitos que tiene
		contador = factorial(entrada);
		
		//Muestro el resultado por consola
		System.out.println("El numero introducido tiene " + (contador - 1) + " digitos");
		

	}
	
	/**
	 * Metodo recursivo que contará los digitos que tiene un numero
	 * rbr - 161124
	 * @param n
	 * @return
	 */
	public static int factorial(int entrada) {

	    if (entrada == 0) { // Caso base
	        return 1;

	    } else { // Caso recursivo
	    	return 1 + factorial(entrada / 10);

	    }

	}

}
