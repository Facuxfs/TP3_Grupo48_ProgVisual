package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Principal {
	static int[] vector1 = new int[5];
	static int[] vector2 = new int[5];
	static int[] vectorParImpar = new int[7];
	
	
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
			}break;
		}	
	}
	public boolean validarNumero (int numero) {
		return (numero>=1&&numero<=9);
	}
	public void cargarTablaMultiplicar() {
		int[] tablaMultiplo = new int[10];
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Ingrese un numero para mostrar su tabla de multiplos");
		int variable = sc.nextInt();
		if (validarNumero(variable)==true) {
		for (int i = 0; i < tablaMultiplo.length; i++) {
			tablaMultiplo[i]=variable*i;
		}
		for (int i = 0; i < tablaMultiplo.length; i++) {
			System.out.println( variable + " x " + i + " = " + tablaMultiplo[i] );
			}
		}
		System.out.println("Desea repetir Y/N");
		}while (sc.next().equals("Y")||(sc.next().equals("y")));
	}
	
	public void numerosParImpar() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < vectorParImpar.length; i++) {
			System.out.println("Ingrese un numero entero");
			vectorParImpar[i]=sc.nextInt();
		}
		for (int i = 0; i < vectorParImpar.length; i++) {
			if (vectorParImpar[i]% 2 == 0) {
				System.out.println("El numero "+vectorParImpar[i]+" es par");
			} else {

				System.out.println("El numero "+vectorParImpar[i]+" es impar");
			}
		}
	}
	
	
	public static void main(String[] args) {
		//Punto 1
		Principal prueba = new Principal();
		//prueba.cargarVectores(vector1);
		//System.out.println("primer vector cargado");
		//prueba.cargarVectores(vector2);
		//System.out.println("segundo vector cargado");
		//prueba.mostrarDivisiones(vector1, vector2);
		
		//Punto 2
		//prueba.cargarTablaMultiplicar();
		
		//Punto 3
		Alumno unAlumno = new Alumno();
		unAlumno.cargarDatosAlumno(unAlumno);
		
		//Punto 4
		prueba.numerosParImpar();
	}

}
