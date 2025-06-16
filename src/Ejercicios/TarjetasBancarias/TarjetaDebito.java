package Ejercicios.TarjetasBancarias;

public class TarjetaDebito extends TarjetaBancaria implements Proveedor {
    private int limiteDiario;
    private String proveedor;

    public TarjetaDebito(int numero, int cvv, String fechaVencimiento, String titular, int limiteDiario, String proveedor) {
        super(numero, cvv, fechaVencimiento, titular);
        this.limiteDiario = limiteDiario;
        this.proveedor = proveedor;
    }

    public int getLimiteDiario() {
        return limiteDiario;
    }

    public void setLimiteDiario(int limiteDiario) {
        this.limiteDiario = limiteDiario;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    // Mostrar la interfaz de Proveedor
    @Override
    public String mostrarCategoria(){
        return "Tarjeta de Debito";
    }

}
