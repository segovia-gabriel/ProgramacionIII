package Ejercicios.SistemaBoletos;

import java.time.LocalDate;

public class Boleto {
    private String numeroBoleto;
    private Vuelo vuelo;
    private Pasajero pasajero;
    private double precioFinal;
    private LocalDate fechaEmision;


    public Boleto(String numeroBoleto, Vuelo vuelo, Pasajero pasajero, double precioFinal, LocalDate fechaEmision) {
        this.numeroBoleto = numeroBoleto;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.precioFinal = precioFinal;
        this.fechaEmision = fechaEmision;
    }

    public String getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "numeroBoleto='" + numeroBoleto + '\'' +
                ", vuelo=" + vuelo +
                ", pasajero=" + pasajero +
                ", precioFinal=" + precioFinal +
                ", fechaEmision=" + fechaEmision +
                '}';
    }

}
