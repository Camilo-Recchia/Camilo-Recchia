package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		final int ALUMNOS = 4, ASIGNATURAS = 5;

		int notaMinima, notaMaxima, notaMedia = 0;

		int[][] notas = new int[ALUMNOS][ASIGNATURAS];

		System.out.println("Programa para Calculo de nota.\n------------------------------");

		for (int alumno = 0; alumno < ALUMNOS; alumno++) {

			System.out.println("\nNotas del " + (alumno + 1) + " alumno. ");

			for (int asignatura = 0; asignatura < 5; asignatura++) {

				System.out.print("Nota " + (asignatura + 1) + "ª: ");
				notas[alumno][asignatura] = teclado.nextInt();

			}
		}

		for (int alumno = 0; alumno < ALUMNOS; alumno++) {

			notaMinima = notas[alumno][0];

			notaMaxima = notas[alumno][0];

			for (int asignatura = 0; asignatura < 5; asignatura++) {

				if (notas[alumno][asignatura] < notaMinima) {
					notaMinima = notas[alumno][asignatura];
				}
				if (notaMaxima < notas[alumno][asignatura]) {
					notaMaxima = notas[alumno][asignatura];
				}

				notaMedia = notaMedia + notas[alumno][asignatura];
				System.out.println("\nnota actual agregada: "+notas[alumno][asignatura]);

			}
			
			notaMedia = notaMedia/ASIGNATURAS;

			System.out.println("La nota maxima del alumno nº " + (alumno + 1) + " es un " + notaMaxima);
			System.out.println("La nota minima del alumno nº " + (alumno + 1) + " es un " + notaMinima);
			System.out.println("La nota media del alumno nº " + (alumno + 1) + " es un " + notaMedia+"\n");

		}

	}
}
