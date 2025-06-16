package Ejercicios.Personas;

public class Investigador extends Contratado{
    private String titulo;
    private String investigacion;

    public Investigador(String nombre, String dni, int duracionMeses, String titulo, String investigacion) {
        super(nombre, dni, duracionMeses);
        this.titulo = titulo;
        this.investigacion = investigacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInvestigacion() {
        return investigacion;
    }

    public void setInvestigacion(String investigacion) {
        this.investigacion = investigacion;
    }
}
