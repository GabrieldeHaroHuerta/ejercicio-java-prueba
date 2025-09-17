package Ejercicio_1_pruebas;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private Categoria categoria;
    private int stock;

    public Producto(String codigo, String nombre, double precio, Categoria categoria, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double valorTotalStock() {
        return precio * stock;
    }

    public String toString() {
        return "El producto: " +
                "Código=" + codigo +
                ", Nombre='" + nombre + '\'' +
                ", Precio=" + precio +
                ", Categoría=" + categoria +
                ", Stock=" + stock +
                ", Valor total del stock=" + valorTotalStock();
    }
}
