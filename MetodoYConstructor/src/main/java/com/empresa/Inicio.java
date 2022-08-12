package com.empresa;

public class Inicio {
	public static void main(String[] args) {
		System.out.println("** CONSTRUCTORES ***");
		Persona p1=new Persona();
		Persona p2=new Persona("marco");
		Persona p3= new Persona("Marco", "Paucar");
		System.out.println("** toString **");
		System.out.println("p1: "+ p1.toString());
		System.out.println("p2: "+ p2.toString());
		System.out.println("p3: "+ p3.toString());
		System.out.println();
		
		System.out.println("** METODOS **");
		p1.ingresarNombre("Nombre Vinicio");
		p2.ingresarApellido("Apellido Paucar");	
		p3.ingresarNombreApellido("Li", "Pa");
		System.out.println();
		
		System.out.println("** IMPRIMIR **");
		p1.imprimir();
		p2.imprimir();
		p3.imprimir();
		System.out.println();
		
		System.out.println("cambiar nombre con set");
		
		p1.setNombre("jhordan");
		p2.setApellido("balseca");
		
		p2.setNombre("nombre modificado");
		p2.setApellido("apellido modificado");
		
		p3.setNombre("nombre 3");
		p3.setApellido("apellido 3");
				
		System.out.println("** toString **");
		System.out.println("p1: "+ p1.toString());
		System.out.println("p2: "+ p2.toString());
		System.out.println("p3: "+ p3.toString());
		
		System.out.println();
		System.out.println("paso por valor");
		int a=5;
		System.out.println("valor de a: "+ a);
		p1.pasoPorValor(a);
		System.out.println("valor de a seguna vez: "+ a);
		p1.pasoPorValor(a);
		System.out.println();
		System.out.println("Se envia el objeto, paso por referencia");
		p1.imprimir();
		System.out.println();
		p1.pasoPorReferencia(p2);
		p1.imprimir();
		p2.imprimir();
		System.out.println("** Fin **");
		
		// si se llama desde el objeto
		// p1.metodo
		
		// paso el objeto
		// metodo (objeto)
	}

}
