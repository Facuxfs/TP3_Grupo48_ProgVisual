package ar.edu.unju.fi.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static int[] vector1 = new int[5];
	static int[] vector2 = new int[5];
	static int[] vectorParImpar = new int[7];
	ArrayList<String> frutas = new ArrayList<String>();
	
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
	public void saludarHolaMundo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su palabra");
		String cadena = sc.next();
		char[] saludo = cadena.toCharArray();
		char[] invertido = new char[saludo.length];
        for (int i=0; i<saludo.length; i++){
        	invertido[i] = saludo[saludo.length-1-i];
        	}
        saludo=invertido;
        for (int i=0; i<saludo.length; i++){
        	System.out.println(saludo[i]);
        }
        }
	
	public void invertirDiezNumeros() {
		Scanner sc = new Scanner(System.in);
		int[] vectorNumero = new int[9];
		for (int i = 0; i < vectorNumero.length; i++) {
			System.out.println("Ingrese un Numero Entero");
			vectorNumero[i] = sc.nextInt();
		}
		int[] invertido = new int[vectorNumero.length];
        for (int i=0; i<vectorNumero.length; i++){
        	invertido[i] = vectorNumero[vectorNumero.length-1-i];
        	}
        vectorNumero=invertido;
        for (int i=0; i<vectorNumero.length; i++){
        	System.out.println(vectorNumero[i]);
        }
	}
	
	public ArrayList<String> cargarFrutas(){ 
		Scanner sc = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<String>();
		do {
		System.out.println("Ingrese una Fruta");
		frutas.add(sc.next());
		System.out.println("Desea agregar mas frutas? Y/N");
		}while(sc.next().equals("Y")||(sc.next().equals("y")));
		
		return frutas;
	}
	
	public void mostrarFrutas(ArrayList<String> frutas) {
		for(String fruta: frutas) {
			System.out.println(fruta);
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
		//Alumno unAlumno = new Alumno();
		//unAlumno.cargarDatosAlumno(unAlumno);
		
		//Punto 4
		//prueba.numerosParImpar();
		
		//Punto5
		//prueba.saludarHolaMundo();
		
		//Punto6
		//prueba.invertirDiezNumeros();
		
		//Punto 7 
		prueba.mostrarFrutas(prueba.cargarFrutas());
	}

}
