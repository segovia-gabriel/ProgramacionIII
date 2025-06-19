package Ejercicios.PracticasIII;

public class Credito extends FormaDePago{

    public Credito(int porcentaje) {
        super(porcentaje);
    }

    @Override
    public float calcularPrecio(float monto) {
        return monto + (monto * getPorcentaje() / 100.0f);
    }
}
