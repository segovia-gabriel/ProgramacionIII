package Ejercicios.TarjetasBancarias;

import java.util.Objects;

public class TarjetaBancaria {
    private int numero;
    private int cvv;
    String fechaVencimiento;
    String titular;

    public TarjetaBancaria(int numero, int cvv, String fechaVencimiento, String titular) {
        this.numero = numero;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TarjetaBancaria that = (TarjetaBancaria) o;
        return numero == that.numero && cvv == that.cvv && Objects.equals(fechaVencimiento, that.fechaVencimiento) && Objects.equals(titular, that.titular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, cvv, fechaVencimiento, titular);
    }
}
