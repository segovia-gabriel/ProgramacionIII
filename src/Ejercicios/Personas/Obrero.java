package Ejercicios.Personas;

public class Obrero extends Contratado{
    private double montoQuincenal;

    public Obrero(String nombre, String dni, int duracionMeses, double montoQuincenal) {
        super(nombre, dni, duracionMeses);
        this.montoQuincenal = montoQuincenal;
    }

    public double getMontoQuincenal() {
        return montoQuincenal;
    }

    public void setMontoQuincenal(double montoQuincenal) {
        this.montoQuincenal = montoQuincenal;
    }


    public String calcularFacturaTotal(){
        double total = (getMontoQuincenal()*2)*getDuracionMeses();
        return "\nObrero: " + getNombre() + "\nDNI: " + getDni() + "\nTiempo contratado: " + getDuracionMeses()
                + " mes" + "\nValor quincenal: " + getMontoQuincenal() + "\n\nTotal a abonar: " + total;
    }
}
