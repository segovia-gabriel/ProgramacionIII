package Ejercicios.TarjetasBancarias;

public class TarjetaCredito extends TarjetaBancaria implements Proveedor {
    private int montoMantenimiento;
    private String proveedor;

    public TarjetaCredito(int numero, int cvv, String fechaVencimiento, String titular, int montoMantenimiento, String proveedor) {
        super(numero, cvv, fechaVencimiento, titular);
        this.montoMantenimiento = montoMantenimiento;
        this.proveedor = proveedor;
    }

    public int getMontoMantenimiento() {
        return montoMantenimiento;
    }

    public void setMontoMantenimiento(int montoMantenimiento) {
        this.montoMantenimiento = montoMantenimiento;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String mostrarCategoria(){
        return "Tarjeta de Credito";
    }
}
