package parcialPracticasIII;

public class Directivo extends Empleado{
    private float prima;

    public Directivo(String nombre, int edad, int categoria, float basico, float prima) {
        super(nombre, edad, categoria, basico);
        this.prima = prima;
    }

    public float getPrima() {
        return prima;
    }

    public void setPrima(float prima) {
        this.prima = prima;
    }

    @Override
    public float calcularSueldo() {
        return getBasico() + (getBasico() * getCategoria() / 100) + prima;
    }
}
