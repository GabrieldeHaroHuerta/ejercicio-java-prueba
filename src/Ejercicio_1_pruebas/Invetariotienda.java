package Ejercicio_1_pruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Invetariotienda {
    private HashMap<String, Producto> inventario;

    public Invetariotienda() {
        this.inventario = new HashMap<>();
    }

    // Metodo agregar producto
    // Complejidad: O(1) promedio
    public void agregarProducto(Producto p) {
        if (inventario.containsKey(p.getCodigo())) {
            System.out.println("Producto ya existe, actualizando stock.");
            Producto existente = inventario.get(p.getCodigo());
            existente.setStock(existente.getStock() + p.getStock());
        } else {
            inventario.put(p.getCodigo(), p);
        }
    }

    // Actualizar o añadir stock
    public void actualizarStock(String codigo, int cantidad) {
        if (inventario.containsKey(codigo)) {
            Producto p = inventario.get(codigo);
            p.setStock(p.getStock() + cantidad);
        } else {
            System.out.println("Producto inexistente, no se puede actualizar stock.");
        }
    }

    // Vender producto
    public void venderProducto(String codigo, int cantidad) {
        if (inventario.containsKey(codigo)) {
            Producto p = inventario.get(codigo);
            if (cantidad <= p.getStock()) {
                p.setStock(p.getStock() - cantidad);
                System.out.println("Venta realizada: " + cantidad + " de " + p.getNombre());
            } else {
                System.out.println("Stock insuficiente para la venta.");
            }
        } else {
            System.out.println("Producto inexistente, no se puede vender.");
        }
    }

    // Buscar producto por código
    public Producto buscarProducto(String codigo) {
        return inventario.getOrDefault(codigo, null);
    }

    // Retornar lista de productos por categoría
    public List<Producto> productosPorCategoria(Categoria cat) {
        List<Producto> lista = new ArrayList<>();
        for (Producto p : inventario.values()) {
            if (p.getCategoria() == cat) {
                lista.add(p);
            }
        }
        return lista;
    }

    // Retornar precio de todo el inventario
    public double precioTotalInventario() {
        double total = 0;
        for (Producto p : inventario.values()) {
            total += p.valorTotalStock();
        }
        return total;
    }

    // Getter tamaño inventario
    public int tamañoInventario() {
        return inventario.size();
    }

    // toString del inventario
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Inventario Tienda:\n");
        for (Producto p : inventario.values()) {
            sb.append(p.toString()).append(", Valor stock: ").append(p.valorTotalStock()).append("\n");
        }
        sb.append("Valor total inventario: ").append(precioTotalInventario()).append("\n");
        return sb.toString();
    }
}
