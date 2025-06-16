package Ejercicios.Vehiculos;

public class Motocicleta extends Vehiculo{
    private String rodado;

    public Motocicleta(String marca, String modelo, int anio, String rodado) {
        super(marca, modelo, anio);
        this.rodado = rodado;
    }

    public String getRodado() {
        return rodado;
    }

    public void setRodado(String rodado) {
        this.rodado = rodado;
    }
}
