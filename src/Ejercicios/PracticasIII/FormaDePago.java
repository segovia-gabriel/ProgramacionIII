package Ejercicios.PracticasIII;

public abstract class FormaDePago {
    private int porcentaje;

    public FormaDePago(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    // Metodo abstracto que implementan las subclases
    public abstract float calcularPrecio(float monto);
}
