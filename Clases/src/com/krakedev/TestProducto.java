package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear 3 variables de tipo Producto
        Producto productoA;
        Producto productoB;
        Producto productoC;

        // Instanciar los 3 objetos
        productoA = new Producto();
        productoB = new Producto();
        productoC = new Producto();

        // Modificar los atributos con productos de farmacia
        productoA.nombre = "Paracetamol";
        productoA.descripcion = "Analgesico";
        productoA.precio = 2.50;
        productoA.stockActual = 30;

        productoB.nombre = "Ibuprofeno";
        productoB.descripcion = "Antiinflamatorio";
        productoB.precio = 3.10;
        productoB.stockActual = 20;

        productoC.nombre = "Vitamina C";
        productoC.descripcion = "Suplemento vitamínico";
        productoC.precio = 1.75;
        productoC.stockActual = 50;

        // Mostrar valores en pantalla
        System.out.println("=== PRODUCTO A ===");
        System.out.println("Nombre: " + productoA.nombre);
        System.out.println("Descripción: " + productoA.descripcion);
        System.out.println("Precio: " + productoA.precio);
        System.out.println("Stock Actual: " + productoA.stockActual);

        System.out.println("\n=== PRODUCTO B ===");
        System.out.println("Nombre: " + productoB.nombre);
        System.out.println("Descripción: " + productoB.descripcion);
        System.out.println("Precio: " + productoB.precio);
        System.out.println("Stock Actual: " + productoB.stockActual);

        System.out.println("\n=== PRODUCTO C ===");
        System.out.println("Nombre: " + productoC.nombre);
        System.out.println("Descripción: " + productoC.descripcion);
        System.out.println("Precio: " + productoC.precio);
        System.out.println("Stock Actual: " + productoC.stockActual);
	}

}
