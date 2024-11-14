package Ejercicios;


import java.time.LocalDate;
import java.util.Scanner;


public class reto3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LocalDate fecha1 = funciones2.dimeFecha("Introduce una fecha", sc);
		LocalDate fecha2;
		do {
			fecha2 = funciones2.dimeFecha("Introduce otra fecha", sc);
		}while(fecha2.isBefore(fecha1));
		
		if(fecha1.getYear()==fecha2.getYear()) {
			
		}

	}

}
