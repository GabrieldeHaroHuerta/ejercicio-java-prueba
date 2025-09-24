package Ejercicio_2_practicar;

import java.util.HashMap;

public class ShoppingCart {
    // Almacenar nombre de producto y cantidad
    private HashMap <String, Integer> cart;
    // Almacenar nombre de producto y precio
    private HashMap<String, Double> prices;
    public ShoppingCart() {
        this.cart = new HashMap<>();
        this.prices = new HashMap<>();

        // Inicializamos algunos productos y precios
        this.prices.put("manzana", 0.50);
        this.prices.put("platano", 0.30);
        this.prices.put("naranja", 0.60);
        this.prices.put("leche", 2.50);
        this.prices.put("pan", 1.50);
    }
    // Este metodo comprueba si el producto existe.
    public void addProduct(String product, double price) {
        if (this.cart.containsKey(product)) {

        }
    }
}
