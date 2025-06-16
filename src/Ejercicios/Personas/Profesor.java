package Ejercicios.Personas;

public class Profesor extends Persona implements Reportable{
    private String materia;

    public Profesor(String nombre, String dni, String materia) {
        super(nombre, dni);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String generarReporte() {
        return "\nProfesor: " + getNombre() + "\nDNI: " + getDni() + "\nMateria: " + materia;
    }

}
