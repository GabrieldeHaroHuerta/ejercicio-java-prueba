package Ejercicio_2_practicar;

import java.util.HashMap;

public class Main {
    // Metodo main cuya salida por pantalla aparece mas abajo
    public static void main(String [] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("manzana ", 3);
        cart.addProduct(" leche ", 2);
        cart.addProduct(" pan", 1);
        cart.displayCart();

        cart.updateQuantity("manzana", 5);
        cart.removeProduct("pan");
        cart.displayCart();

        cart.addProduct("chocolate", 1);
        cart.addProduct("naranja", 10);
        cart.displayCart();
    }
}
