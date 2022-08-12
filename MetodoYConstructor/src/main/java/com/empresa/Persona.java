package com.empresa;

public class Persona {
	
	private String nombre;
	private String apellido;
	
    //	metodo
	
	public void ingresarNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public void ingresarApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void ingresarNombreApellido(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}

	public Persona(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public Persona (String nombre) {
		this.nombre = nombre;
	}
	
	public Persona () {
		System.out.println("constructor vacio");
	}
	
	public void imprimir() {
		System.out.println("nombre: " + this.nombre + " apellido: "+this.apellido);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	public void pasoPorValor(int a) {
		a=10;
	}
	
	public void pasoPorReferencia(Persona persona) {
		persona.nombre ="Nuevo nombre";
		persona.apellido = "Nuevo Apellido";
	}

}
