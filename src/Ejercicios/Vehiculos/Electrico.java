package Ejercicios.Vehiculos;

public class Electrico extends Vehiculo implements Conectable{
    private int autonomia;

    public Electrico(String marca, String modelo, int anio, int autonomia) {
        super(marca, modelo, anio);
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public void conectar() {
        System.out.println("Iniciando la carga del vehiculo " + getMarca() + " " + getModelo() + ".");
    }
}
