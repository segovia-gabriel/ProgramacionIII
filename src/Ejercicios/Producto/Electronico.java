package Ejercicios.Producto;

public class Electronico extends Producto{
    private int mesesGarantia;

    public Electronico(String nombre, double precio, int stock, Proveedor proveedor, int mesesGarantia) {
        super(nombre, precio, stock, proveedor);
        this.mesesGarantia = mesesGarantia;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 1.10;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println(
                "----------------------------------------" + "\n" +
                "ELECTRONICO\n" +
                        "Nombre: " + getNombre() + "\n" +
                        "Precio sin impuestos nacionales: $" + getPrecio() + "\n" +
                        "Precio final (con IVA 10%): $" + calcularPrecioFinal() + "\n" +
                        "Meses de garantia: " + getMesesGarantia() + "meses." +
                        "Stock: " + getStock() + " unidades.\n" +
                        getProveedor().getDatosContacto() + "\n");
    }
}
