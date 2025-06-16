package Ejercicios.TarjetasBancarias;

public class TarjetaVirtual extends TarjetaBancaria {
    private boolean activo;

    public TarjetaVirtual(int numero, int cvv, String fechaVencimiento, String titular, boolean activo) {
        super(numero, cvv, fechaVencimiento, titular);
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
