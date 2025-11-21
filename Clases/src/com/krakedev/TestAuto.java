package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		
		 // Instanciar dos autos
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        // Modificar atributos del auto1
        auto1.marca = "Toyota";
        auto1.anio = 2020;
        auto1.precio = 15000.50f;

        // Modificar atributos del auto2
        auto2.marca = "Chevrolet";
        auto2.anio = 2018;
        auto2.precio = 12000.75f;

        // Mostrar valores en consola
        System.out.println("=== AUTO 1 ===");
        System.out.println("Marca: " + auto1.marca);
        System.out.println("Año: " + auto1.anio);
        System.out.println("Precio: " + auto1.precio);

        System.out.println("\n=== AUTO 2 ===");
        System.out.println("Marca: " + auto2.marca);
        System.out.println("Año: " + auto2.anio);
        System.out.println("Precio: " + auto2.precio);

	}

}
