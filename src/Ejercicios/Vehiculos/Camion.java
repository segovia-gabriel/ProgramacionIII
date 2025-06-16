package Ejercicios.Vehiculos;

public class Camion extends Vehiculo{
    private int capacidadCarga;

    public Camion(String marca, String modelo, int anio, int capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}
