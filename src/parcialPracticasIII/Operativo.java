package parcialPracticasIII;

public class Operativo extends Empleado{

    public Operativo(String nombre, int edad, int categoria, float basico) {
        super(nombre, edad, categoria, basico);
    }

    @Override
    public float calcularSueldo() {
        return getBasico() + (getBasico() * getCategoria() / 100);
    }

}
