package ar.edu.unju.fi.ejercicio1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Producto {
	private int codigo;
	private String descripcion;
	private Float precio;
	private String marca;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", marca=" + marca
				+ "]";
	}
	public Producto(int codigo, String descripcion, Float precio, String marca) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
	}
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void cargarProducto(Producto unProducto) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese codigo del producto");
		unProducto.setCodigo(sc.nextInt());
		System.out.println("Ingrese descripcion");
		unProducto.setDescripcion(sc.next());
		System.out.println("Ingrese precio del producto");
		unProducto.setPrecio(sc.nextFloat());
		System.out.println("Ingrese marca del producto");
		unProducto.setMarca(sc.next());
	}
	
	public void mostrarProductos (ArrayList<Producto> listaProductos) {
		for (Producto unProducto: listaProductos) {
			System.out.println(unProducto.toString());
		}
	}
	public void incrementarPrecioProductos (ArrayList<Producto> listaProductos, int incremento) {
		for (Producto unProducto: listaProductos) {
			unProducto.precio = unProducto.precio + ((incremento/100)*incremento);
		}
	}
	
	public void mostrarTotalProductos (ArrayList<Producto> listaProductos) {
		float total = 0;
		for (Producto unProducto: listaProductos) {
		total = total + unProducto.precio;
		}
		System.out.println("Monto total : "+total);
	}
	
	public void mostrarMenuProducto (ArrayList<Producto> listaProducto){
		 Scanner sn = new Scanner(System.in);
	        boolean salir = false;
	        int opcion;
	        while (!salir) {
	 
	            System.out.println("1. Nuevo Producto");
	            System.out.println("2. Mostrar todos los productos");
	            System.out.println("3. Incrementar precio a todos los productos");
	            System.out.println("4. Monto total de todos los productos");
	            System.out.println("5. Fin");
	            Producto unProducto = new Producto();
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = sn.nextInt();
	 
	                switch (opcion) {
	                
	                    case 1:
	                        System.out.println("Has seleccionado la opcion 1");
	                        unProducto.cargarProducto(unProducto);
	                        listaProducto.add(unProducto);
	                        break;
	                    case 2:
	                        System.out.println("Has seleccionado la opcion 2");
	                        unProducto.mostrarProductos(listaProducto);
	                        break;
	                    case 3:
	                        System.out.println("Has seleccionado la opcion 3");
	                        System.out.println("Ingrese porcentaje a incrementar");
	                        unProducto.incrementarPrecioProductos(listaProducto, sn.nextInt());
	                        break;
	                    case 4:
	                    	 System.out.println("Has seleccionado la opcion 4");
	                    	 unProducto.mostrarTotalProductos(listaProducto);
	                    	 break;
	                    case 5:
	                        salir = true;
	                        break;
	                    default:
	                        System.out.println("Solo números entre 1 y 4");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	                sn.next();
	            }
	        }
	}
}
