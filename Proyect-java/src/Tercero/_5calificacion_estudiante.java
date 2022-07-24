package Tercero;

import java.util.Scanner;

public class _5calificacion_estudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CALIFICACION FINAL DE UN ESTUDIANTE DE INFORMATICA SE CALCULA CON BASE A LAS
		// CALIFICACIONES
		// DE 4 ASPECTOS DE SU RENDIMIENTO ACADEMICO
		// PARTICIPACION PRIMER PARCIAL SEGUNDO PARCIAL EXAMEN FINAL
		// SABIENDO QUE LA CALIFICACION ANTERIOR ENTRA A LA CALIFICACION FINAL CON
		// PONDERACIONES DEL
		// 10 % 25% 25% Y 40%
		// HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA CALIFICACION FINAL OBTENIDA POR UN
		// ESUDIANTE
		Scanner entrada = new Scanner(System.in);

		float participacion, primer_examen, segundo_examen, examen_final, nota_final;

		System.out.println("digite la nota de participacion: ");
		participacion = entrada.nextFloat();

		System.out.println("digite primer examen: ");
		primer_examen = entrada.nextFloat();

		System.out.println("digite segundo examen: ");
		segundo_examen = entrada.nextFloat();

		System.out.println("digite la calificacion de examen final: ");
		examen_final = entrada.nextFloat();

		participacion *= 0.10f; // se le coloca f por el flotante
		primer_examen *= 0.25f;
		segundo_examen *= 0.25f;
		examen_final *= 0.40f;

		nota_final = participacion + primer_examen + segundo_examen + examen_final;
		// sumamos todo
		System.out.println("la calificacion finale es: " + nota_final);

	}

}
