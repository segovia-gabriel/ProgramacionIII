package Ejercicios.Ofertas;

import java.time.LocalDate;

public class Oferta {
    private ProductoMinorista[] productos;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int porcentajeDescuento;

    public Oferta(ProductoMinorista[] productos, LocalDate fechaInicio, LocalDate fechaFin, int porcentajeDescuento) {
        this.productos = productos;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public ProductoMinorista[] getProductos() {
        return productos;
    }

    public void setProductos(ProductoMinorista[] productos) {
        this.productos = productos;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    //

}
