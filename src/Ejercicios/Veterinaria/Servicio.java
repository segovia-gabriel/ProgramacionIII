package Ejercicios.Veterinaria;

public class Servicio {
    private String descripcion;
    private double precioBase;
    private int duracionMin;
    private double precioAdicionalPorMinuto;

    public Servicio(String descripcion, double precioBase, int duracionMin, double precioAdicionalPorMinuto) {
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.duracionMin = duracionMin;
        this.precioAdicionalPorMinuto = precioAdicionalPorMinuto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public double getPrecioAdicionalPorMinuto() {
        return precioAdicionalPorMinuto;
    }

    public void setPrecioAdicionalPorMinuto(double precioAdicionalPorMinuto) {
        this.precioAdicionalPorMinuto = precioAdicionalPorMinuto;
    }
}
