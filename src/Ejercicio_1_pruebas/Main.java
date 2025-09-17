package Ejercicio_1_pruebas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Invetariotienda tienda = new Invetariotienda();

        // Agregar 6-7 productos iniciales
        tienda.agregarProducto(new Producto("001", "Laptop Dell", 1200.0, Categoria.LAPTOP, 5));
        tienda.agregarProducto(new Producto("002", "iPhone 13", 1000.0, Categoria.SMARTPHONE, 10));
        tienda.agregarProducto(new Producto("003", "iPad Pro", 900.0, Categoria.TABLET, 7));
        tienda.agregarProducto(new Producto("004", "Samsung Galaxy S21", 850.0, Categoria.SMARTPHONE, 8));
        tienda.agregarProducto(new Producto("005", "MacBook Air", 1300.0, Categoria.LAPTOP, 3));
        tienda.agregarProducto(new Producto("006", "Tablet Samsung", 600.0, Categoria.TABLET, 4));

        // Pruebas
        System.out.println("Inventario Inicial");
        System.out.println(tienda);

        // Añadir producto duplicado
        tienda.agregarProducto(new Producto("002", "iPhone 13", 1000.0, Categoria.SMARTPHONE, 5));

        // Vender productos
        tienda.venderProducto("001", 2);
        tienda.venderProducto("003", 10); // Venta mayor al stock
        tienda.venderProducto("999", 1);  // Producto inexistente

        // Actualizar stock
        tienda.actualizarStock("004", 5);
        tienda.actualizarStock("999", 2); // Producto inexistente

        // Buscar productos por categoría
        System.out.println("Productos SMARTPHONE");
        List<Producto> smartphones = tienda.productosPorCategoria(Categoria.SMARTPHONE);
        for (Producto p : smartphones) {
            System.out.println(p);
        }

        System.out.println("Inventario Final");
        System.out.println(tienda);
    }
}
