package Ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class funciones1 {
	public static void mismoAnyo(LocalDate fecha1, LocalDate fecha2, Scanner sc) {
		if (fecha1.getMonth() != fecha2.getMonth() || fecha1.getDayOfMonth() != fecha2.getDayOfMonth()) {
			long difMeses = ChronoUnit.MONTHS.between(fecha1, fecha2);

			if (difMeses < 3) {
				difMeses = 4;
			}
			

			String masCorto = "";
			String primeroAlfa = "";
			String ultimo = "";

			for (int i = 1; i <= difMeses; i++) {
				System.out.println("Escribe un nombre");
				String nombre = sc.nextLine();
				if (i == 1) {
					masCorto = nombre;
					primeroAlfa = nombre;
				} else {
					if (masCorto.length() > nombre.length()) {
						masCorto = nombre;
					}
					if (primeroAlfa.compareToIgnoreCase(nombre) > 0) {
						primeroAlfa = nombre;
					}
					if (i == difMeses) {
						ultimo = nombre;
					}
				}
			}

			System.out.println("El nombre más corto es " + masCorto);
			System.out.println("El primer nombre alfabéticamente es " + primeroAlfa);

			char caracter;
			boolean primer = true;
			for (int j = 0; j < ultimo.length(); j++) {
				caracter = ultimo.charAt(j);
				if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
					if (primer == true) {
						System.out.print(caracter);
						primer = false;
					} else
						System.out.print("-" + caracter);
				}
			}

		}
	}
}
