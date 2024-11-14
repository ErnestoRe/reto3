package Ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class funciones2 {
	
	public static void mismoAnyo(LocalDate fecha1, LocalDate fecha2, Scanner sc) {
		
		if (fecha1.getMonth() != fecha2.getMonth() || fecha1.getDayOfMonth() != fecha2.getDayOfMonth()) {
			long difMeses = ChronoUnit.MONTHS.between(fecha1, fecha2);
			
			if (difMeses < 3) {
				difMeses = 4;
			}
			System.out.println(difMeses);
			
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
			
			System.out.println("El nombre m�s corto es " + masCorto);
			System.out.println("El primer nombre alfab�ticamente es " + primeroAlfa);

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

/*Si son del mismo a�o y, son de distinto mes o distinto d�a, calcula la diferencia de meses entre las fechas.
Pide por consola tantos nombres como la diferencia de meses, en caso de que esa diferencia sea menor de
3, pide 4 nombres.
Despues de introducir todos los nombres,
o muestra al nombre de tama�o m�s peque�o
o muestra el nombre que alfab�ticamente es el primero
o muestra las vocales separadas por guiones de la �ltima palabra introducida, no mostrar guion
despu�s de �ltima vocal ( Ej. botella-> o-e-a)
*/