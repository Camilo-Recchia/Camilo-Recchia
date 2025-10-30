package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		final int ALUMNOS = 4, ASIGNATURAS = 5;

		int notaMinima, notaMaxima, notaMedia;

		int[][] notas = new int[ALUMNOS][ASIGNATURAS];

		System.out.println("Programa para Calculo de nota.\n------------------------------");

		for (int alumno = 0; alumno < ALUMNOS; alumno++) {

			System.out.println("\nNotas del " + (alumno + 1) + " alumno. ");

			for (int asignatura = 0; asignatura < 5; asignatura++) {

				System.out.println("Nota " + (asignatura + 1) + "ª: ");
				notas[alumno][asignatura] = teclado.nextInt();

			}
		}

	}
}
