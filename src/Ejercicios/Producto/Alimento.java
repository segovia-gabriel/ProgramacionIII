package Ejercicios.Producto;

import java.time.LocalDate;

public class Alimento extends Producto{
    private LocalDate fechaVencimiento;

    public Alimento(String nombre, double precio, int stock, Proveedor proveedor, LocalDate fechaVencimiento) {
        super(nombre, precio, stock, proveedor);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() *1.21;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println(
                "----------------------------------------" + "\n" +
                "ALIMENTO\n" +
                        "Nombre: " + getNombre() + "\n" +
                        "Precio sin impuestos nacionales: $" + getPrecio() + "\n" +
                        "Precio final (con IVA 21%): $" + calcularPrecioFinal() + "\n" +
                        "Stock: " + getStock() + " unidades.\n" +
                        "Fecha de vencimiento: " + fechaVencimiento + "\n" +
                        getProveedor().getDatosContacto() + "\n");
    }
}
