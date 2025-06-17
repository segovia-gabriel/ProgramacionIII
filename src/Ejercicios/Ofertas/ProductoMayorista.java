package Ejercicios.Ofertas;

public class ProductoMayorista extends Producto{

    private int precioMayorista;
    private int procentajeDescuento;

    public ProductoMayorista(int id, String descripcion, int precio, Categoria categoria, int stock, int precioMayorista, int procentajeDescuento) {
        super(id, descripcion, precio, categoria, stock);
        this.precioMayorista = precioMayorista;
        this.procentajeDescuento = procentajeDescuento;
    }

    public ProductoMayorista(int id, int precio, String descripcion, int stock, int precioMayorista, int procentajeDescuento) {
        super(id, precio, descripcion, stock);
        this.precioMayorista = precioMayorista;
        this.procentajeDescuento = procentajeDescuento;
    }

    public int getPrecioMayorista() {
        return precioMayorista;
    }

    public void setPrecioMayorista(int precioMayorista) {
        this.precioMayorista = precioMayorista;
    }

    public int getProcentajeDescuento() {
        return procentajeDescuento;
    }

    public void setProcentajeDescuento(int procentajeDescuento) {
        this.procentajeDescuento = procentajeDescuento;
    }
}
