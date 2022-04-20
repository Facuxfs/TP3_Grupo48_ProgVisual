package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Alumno {
	
	private String Nombre;
	private String Apellido;
	private int LibretaUniversitaria;
	private Double[] notas;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getLibretaUniversitaria() {
		return LibretaUniversitaria;
	}
	public void setLibretaUniversitaria(int libretaUniversitaria) {
		LibretaUniversitaria = libretaUniversitaria;
	}
	
	
	public Double[] getNotas() {
		return notas;
	}
	public void setNotas(Double[] notas) {
		this.notas = notas;
	}
	public Alumno(String nombre, String apellido, int libretaUniversitaria, Double notas[]) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		LibretaUniversitaria = libretaUniversitaria;
		this.notas = new Double[5];
	}
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Double calcularPromdeio() {
		Double suma = 0.0;
		for (int i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
	}
		return suma/notas.length;
	}
	
	public Double buscarNotaSuperio () {
		Double nota = 0.0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]>nota) {
				nota = notas[i];
			}
		}
		return nota;
	}
	public void cargarDatosAlumno(Alumno unAlumno) {
		Double[] vectorNotas = new Double[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Nombre del alumno");
		unAlumno.setNombre(sc.next());
		System.out.println("Ingrese Apellido del alumno");
		unAlumno.setApellido(sc.next());
		System.out.println("Ingrese Libreta Universitaria del alumno");
		unAlumno.setLibretaUniversitaria(sc.nextInt());
		
		for (int i = 0; i <vectorNotas.length; i++) {
		System.out.println("Ingrese nota N°"+i);
		vectorNotas[i]=sc.nextDouble();
		}
		System.out.println("sale");
		unAlumno.notas=vectorNotas;
		
		System.out.println("El promedio del alumno es : "+unAlumno.calcularPromdeio());
		System.out.println("La nota mas alta es : "+unAlumno.buscarNotaSuperio());
	}
}
