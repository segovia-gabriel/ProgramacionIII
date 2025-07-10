package Ejercicios.SistemaBoletos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {
    private String numeroVuelo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime horaSalida;
    private int asientosTotales;
    private int asientosDisponibles;
    private double precioBase;

    public Vuelo(String numeroVuelo, String origen, String destino, LocalDate fecha, LocalTime horaSalida, int asientosTotales, int asientosDisponibles, double precioBase) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.asientosTotales = asientosTotales;
        this.asientosDisponibles = asientosDisponibles;
        this.precioBase = precioBase;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getAsientosTotales() {
        return asientosTotales;
    }

    public void setAsientosTotales(int asientosTotales) {
        this.asientosTotales = asientosTotales;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double reservarAsientos(int cantidad) throws AsientosNoDisponiblesException {
        if (cantidad <= 0){
            throw new IllegalArgumentException("La cantidad de asientos debe ser mayor a 0.");
        }

        if(cantidad > asientosDisponibles){
            throw new AsientosNoDisponiblesException("No hay suficientes asientos disponibles.");
        }

        asientosDisponibles -= cantidad;

        return precioBase*cantidad;
    }

    public void cancelarAsientos(int cantidad){
        if (cantidad <= 0){
            throw new IllegalArgumentException("La cantidad de asientos a cancelar debe ser mayor a 0.");
        }

        asientosDisponibles += cantidad;

        if (asientosDisponibles > asientosTotales){
            asientosDisponibles = asientosTotales;
        }
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "numeroVuelo='" + numeroVuelo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fecha +
                ", horaSalida=" + horaSalida +
                ", asientosTotales=" + asientosTotales +
                ", asientosDisponibles=" + asientosDisponibles +
                ", precioBase=" + precioBase +
                '}';
    }
}
