package Ejercicios.Personas;

public class Contratado extends Persona{
    private int duracionMeses;

    public Contratado(String nombre, String dni, int duracionMeses) {
        super(nombre, dni);
        this.duracionMeses = duracionMeses;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }


}
