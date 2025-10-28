/*
 *Descripción: Calculo del 1º día más caluroso del mes.
 *Autor: Camilo Villarroel Recchia
 *Fecha: 22/10/2025
 */
package arraysMultidimencionales;

public class DiasArray {

	public static void main(String[] args) {

		int mayorCalor = 0, menorCalor = 0, amplitud;

		int[][] temperaturas = new int[12][30];

		System.out.println(
				"          Aplicación para el caulculo del la amplitud termica en todo el año \n---------------------------------------------------------------------------------");

		for (int mes = 0; mes < 12; mes++) {

			System.out.print("\nMes " + (mes + 1) + ": ");

			for (int dia = 0; dia < 30; dia++) {

				temperaturas[mes][dia] = (int) (Math.random() * 40);

				System.out.print(temperaturas[mes][dia] + " ");
			}

		}
		System.out.println("");

		for (int mes1 = 0; mes1 < 12; mes1++) {

			mayorCalor = temperaturas[mes1][0];
			menorCalor = temperaturas[mes1][0];

			for (int dia1 = 0; dia1 < 30; dia1++) {

				if (mayorCalor < temperaturas[mes1][dia1]) {

					mayorCalor = temperaturas[mes1][dia1];

				}

				if (menorCalor > temperaturas[mes1][dia1]) {

					menorCalor = temperaturas[mes1][dia1];
				}

			}

			amplitud = mayorCalor - menorCalor;

			System.out.println("");
			System.out.println("La temperatura minima del " + (mes1 + 1) + "º mes es de " + menorCalor
					+ " y con una temperatura maxima de " + mayorCalor + ". Y la amplitud termica es de " + amplitud
					+ "\n");

		}
	}
}
