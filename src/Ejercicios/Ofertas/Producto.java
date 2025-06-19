package Ejercicios.Ofertas;

public class Producto {
    private int id;
    private String descripcion;
    private int precio;
    private Categoria categoria;
    private int stock;

    public Producto(int id, String descripcion, int precio, Categoria categoria, int stock) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public Producto(int id, int precio, String descripcion, int stock) {
        this.id = id;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
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
        stock = stock;
    }
    // Convertimos el precio entero a decimal
    public double precioDecimal(){
        return precio/100.0;
    }

    // Mostramos los datos del producto con un String
    public String detalles(){
        return "ID: " + id +
                "\nDescripcion: " + descripcion +
                "\nPrecio: $" + precioDecimal() +
                "\nStock: " + stock +
                "\nCategoria: " + (categoria != null ? categoria.getNombre()
                /*Expresion condicional TERNARIA, es una forma abreviada de escribir un if ... else
                 * ? representa el verdadero del if, y el : representa el else, es decir la
                 * parte false*/
                + " (Activa: " + categoria.isActiva() + ")" : "Sin categoría");
    }
}