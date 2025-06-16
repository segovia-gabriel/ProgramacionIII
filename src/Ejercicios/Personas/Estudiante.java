package Ejercicios.Personas;

public class Estudiante extends Persona implements Reportable{
    private String legajo;

    public Estudiante(String nombre, String dni, String legajo) {
        super(nombre, dni);
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    /*@Override significa que este metodo viene de una superclase o de una interfaz,
    y lo esta sobreescribiendo*/
    @Override
    public String generarReporte(){
        return "\nEstudiante: " + getNombre() + "\nDNI: " + getDni() + "\nLegajo: " + legajo;
    }
}
