package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// Esto es un comentario
		int a;
		Persona p;// 1 declaro una variable llamada "p" de tipo Persona
		Persona p2 = new Persona();
		p = new Persona();// estoy instanciando, creando objeto Persona, reficiando con "p

		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);
		System.out.println("-----------------");
		// MODIFICAR LOS ATRIBUTOS
		p.nombre = "Mario";
		p.edad = 45;
		p.estatura = 1.56;

		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edad);
		System.out.println("estatura: " + p.estatura);

		p2.nombre = "Angelina";
		System.out.println("********");
		System.out.println("p.nombre: " + p.nombre);
		System.out.println("p2.nombre: " + p2.nombre);
	}

}