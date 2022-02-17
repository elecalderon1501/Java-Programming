package ar.com.eduit.clase1;

/*
 * Genere un programa que le pida al usuario:
 * 1- cantidad de notas
 * 2- nota y nombre de cada alumno
 * 
 * Este programa debe mostrar:
 * 1- Promedio de las notas.
 * 2- Cual es la nota mayor y menor ingresada indicando quien fue que obtuvo cada una de ellas
 * Bonus avanzado:
 * 1-Ordenar las notas con su respectivo nombre
 * */
import java.util.Scanner;
import java.util.Arrays;


public class Programa1 {
	
	

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int[] notas;
		String[] nombre;
		int cantidadAlumnos;
		int suma_notas;
		int promedio;
		int max;
		int min;
		int nombre_max;
		int nombre_min;
		
		
		System.out.println("Cantidad de notas que ingresara: ");
		cantidadAlumnos= consola.nextInt();
		
		notas = new int[cantidadAlumnos];
		nombre = new String[cantidadAlumnos];
		suma_notas = 0;
		promedio = 0;
		max = 0;
		nombre_max = 0;
		min = 0;
		nombre_min = 0;
		
		

		for(int i=0; i<cantidadAlumnos; i++) {
			System.out.println("Ingrese nombre del alumno: ");
			nombre[i] = consola.next(); 
			
			System.out.println("Ingrese la nota del alumno: " );
			notas[i] = consola.nextInt();
		}
		
		for(int i=0; i<nombre.length; i++) {
			System.out.println("-------------------------------------");
			System.out.println("Alumno: " + nombre[i] + " Nota: " + notas[i]);
		}
		
		for(int i=0; i<notas.length; i++) {
			suma_notas += notas[i];
			if(notas[i]>max) {
				max = notas[i];
				nombre_max = i;
			};
			if(notas[i]<10) {
				min = notas[i];
				nombre_min = i;
			};
		}
		promedio = suma_notas/cantidadAlumnos;
		
		System.out.println("------------------------------------");
		System.out.println("El Promedio de las notas es: " + promedio);
		System.out.println("La nota maxima es: " + max + ". Pertenece a: " + nombre[nombre_max]);
		System.out.println("La nota minima es: " + min + ". Pertenece a: " + nombre[nombre_min]);
		
		
		for(int i=0; i<notas.length-1; i++) {
			for(int j=1; j<notas.length; j++) {
				if(notas[i]< notas[j]) {
					int aux = notas[i];
					notas[i] = notas[j];
					notas[j] = aux;
					
					String nombre_aux = nombre[i];
					nombre[i] = nombre[j];
					nombre[j] = nombre_aux;
				}
			}
		}
		
		System.out.println("----------Listado Notas y Alumnos-----------");
		System.out.println(Arrays.toString(notas));
		System.out.println(Arrays.toString(nombre));
	}

}
