package parcialPracticasIII;

public abstract class Empleado {
    private String nombre;
    private int edad;
    private int categoria;
    private float basico;

    public Empleado(String nombre, int edad, int categoria, float basico) {
        this.nombre = nombre;
        this.edad = edad;
        this.categoria = categoria;
        this.basico = basico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public float getBasico() {
        return basico;
    }

    public void setBasico(float basico) {
        this.basico = basico;
    }

    public abstract float calcularSueldo();
}
