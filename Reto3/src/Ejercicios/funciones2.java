package Ejercicios;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class funciones2 {

	public static void diferenteAnio(LocalDate fecha1, LocalDate fecha2) {
		int diasTotal = 0;
		int meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);

		
		fecha2 = LocalDate.of(fecha2.getYear(),fecha2.getMonth(),1);
		
		while(fecha1.isBefore(fecha2)) {
			int contador_dias = fecha1.lengthOfMonth();
			fecha1 = fecha1.plusMonths(1);
			diasTotal = diasTotal+contador_dias;
		}
		int mediaDias = diasTotal/meses;
		System.out.println(mediaDias+" es la media de dias");
		funciones2.consonantes(fecha2);
	}
	
	public static void consonantes(LocalDate fecha2) {
		String mesFecha2 = String.valueOf(fecha2.getMonth());
		mesFecha2 = mesFecha2.toLowerCase();
		char caracter;
		for(int i = 0; i<mesFecha2.length();i++) {
			caracter = mesFecha2.charAt(i);
			if(caracter!='a' && caracter!='e' && caracter!='i' && caracter!='o' && caracter!='u') {
				if(i==0) {
					System.out.print(caracter);
				}else {
					System.out.print(", "+caracter);
				}
				
			}
		}
	}
	
	public static LocalDate dimeFecha(String texto, Scanner sc) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				System.out.println(texto);
				String textoFecha = sc.nextLine();
				LocalDate fecha = LocalDate.parse(textoFecha, formato);
				return fecha;
			} catch (Exception ex) {
				System.out.println("Fecha no valida");
			}
		} while (true);
	}
}

