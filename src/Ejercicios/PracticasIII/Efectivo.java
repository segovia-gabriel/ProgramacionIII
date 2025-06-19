package Ejercicios.PracticasIII;

public class Efectivo extends FormaDePago{

    public Efectivo(int porcentaje) {
        super(porcentaje);
    }

    @Override
    public float calcularPrecio(float monto) {
        return monto - (monto * getPorcentaje() / 100.0f);
    }

}
