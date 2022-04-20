package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Principal {
	static int[] vector1 = new int[5];
	static int[] vector2 = new int[5];
	
	public int[] cargarVectores (int[] vector) {
		for (int i = 0; i < vector.length; i++) {
		System.out.println("Ingrese un numero entero");
		Scanner sc = new Scanner(System.in);
		vector[i]= sc.nextInt();
		}
		return vector;
	}
	
	public void mostrarDivisiones(int[]vector1,int[]vector2) {
		int division = 0;
		for (int i = 0; i < vector1.length; i++) {
			try {
			division= vector1[i]/vector2[i];
			} catch (ArithmeticException ex) {
				division=0;
				System.out.println("No existe la division por 0");
			}finally {
				System.out.println("Division posicion : "+ i+ " es :" +division);
			}
		}	
	}
	
	public static void main(String[] args) {
		
		Principal prueba = new Principal();
		prueba.cargarVectores(vector1);
		System.out.println("primer vector cargado");
		prueba.cargarVectores(vector2);
		System.out.println("segundo vector cargado");
		prueba.mostrarDivisiones(vector1, vector2);
	}

}
