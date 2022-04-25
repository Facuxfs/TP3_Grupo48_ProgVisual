package ar.edu.unju.fi.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
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
	
	@Override
	public String toString() {
		return "Alumno [Nombre=" + Nombre + ", Apellido=" + Apellido + ", LibretaUniversitaria=" + LibretaUniversitaria
				+ ", notas=" + Arrays.toString(notas) + "]";
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
		unAlumno.notas=vectorNotas;
		
		System.out.println("El promedio del alumno es : "+unAlumno.calcularPromdeio());
		System.out.println("La nota mas alta es : "+unAlumno.buscarNotaSuperio());
	}
	
	public  ArrayList<Alumno> eliminarAlumno (ArrayList<Alumno> listaAlumnos ,int LU){
		int indice = 0;
		for (Alumno unAlumno: listaAlumnos) {
			if (unAlumno.LibretaUniversitaria==LU) {
				 indice = listaAlumnos.indexOf(unAlumno);
				 System.out.println("Alumno "+ unAlumno.Nombre+" eliminado");
			}
		}
		listaAlumnos.remove(indice);
		return listaAlumnos;
	}
	
	public ArrayList<Alumno> modificarAlumno (ArrayList<Alumno> listaAlumnos ,int LU){
		int indice = 0;
		for (Alumno unAlumno: listaAlumnos) {
			if (unAlumno.LibretaUniversitaria==LU) {
				 indice = listaAlumnos.indexOf(unAlumno);
			}
		}
		Double[] vectorNotas = new Double[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <vectorNotas.length; i++) {
			System.out.println("Ingrese nota N°"+i);
			vectorNotas[i]=sc.nextDouble();
			}
		listaAlumnos.get(indice).notas=vectorNotas;
		return listaAlumnos;

	}
	
	public void mostrarAlumnos (ArrayList<Alumno> listaAlumnos) {
		for (Alumno unAlumno: listaAlumnos) {
			System.out.println(unAlumno.toString());
		}
	}
	
	public void mostrarPromediosMayoraSeis (ArrayList<Alumno> listaAlumnos) {
		for (Alumno unAlumno: listaAlumnos) {
			if(unAlumno.calcularPromdeio()>=6.0)
			System.out.println(unAlumno);
		}
	}
	
	public void mostrarMenuAlumno (ArrayList<Alumno> listaAlumno){
		 Scanner sn = new Scanner(System.in);
	        boolean salir = false;
	        int opcion;
	        while (!salir) {
	 
	            System.out.println("1. Nuevo Alumno");
	            System.out.println("2. Eliminar Alumno");
	            System.out.println("3. Modificar nota del Alumno");
	            System.out.println("4. Mostrar todos los Alumnos");
	            System.out.println("5. Mostrar los que superan el promeido de 6");
	            System.out.println("6. Salir");
	            Alumno unAlumno = new Alumno();
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = sn.nextInt();
	 
	                switch (opcion) {
	                
	                    case 1:
	                        System.out.println("Has seleccionado la opcion 1");
	                        unAlumno.cargarDatosAlumno(unAlumno);
	                        listaAlumno.add(unAlumno);
	                        break;
	                    case 2:
	                        System.out.println("Has seleccionado la opcion 2");
	                        System.out.println("Ingrese el LU del alumno a eliminar");
	                        unAlumno.eliminarAlumno(listaAlumno, sn.nextInt());
	                        break;
	                    case 3:
	                        System.out.println("Has seleccionado la opcion 3");
	                        System.out.println("Ingrese el LU del alumno a modificar las notas");
	                        unAlumno.modificarAlumno(listaAlumno, sn.nextInt());
	                        break;
	                    case 4:
	                    	 System.out.println("Has seleccionado la opcion 4");
	                    	 unAlumno.mostrarAlumnos(listaAlumno);	
	                    	 break;
	                    case 5:
	                    	System.out.println("Has seleccionado la opcion 5");
	                    	 unAlumno.mostrarPromediosMayoraSeis(listaAlumno);
	                    	break;
	                    case 6:
	                        salir = true;
	                        break;
	                    default:
	                        System.out.println("Solo números entre 1 y 6");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	                sn.next();
	            }
	        }
	}
}
