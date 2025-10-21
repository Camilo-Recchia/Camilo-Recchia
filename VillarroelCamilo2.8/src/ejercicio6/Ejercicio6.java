package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 0;

		System.out.println("Introduzca todos los numeros positivos de los que quiera saber su cuadrado.");
		System.out.println("Cuando no quiera ingresar más, ingrese un negativo.");
		System.out.print("Numero: ");
		numero = teclado.nextInt();

		while (numero > 0) {
			System.out.println("Su cuadrado es " + Math.pow(numero, 2));
			System.out.print("Numero: ");
			numero = teclado.nextInt();

		}
	}

}