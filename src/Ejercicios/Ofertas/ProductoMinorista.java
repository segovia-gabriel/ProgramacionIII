package Ejercicios.Ofertas;

public class ProductoMinorista extends Producto{
    private int porcentajeDescuentoEfectivo;
    private int porcentajeRecargoCredito;

    public ProductoMinorista(int id, String descripcion, int precio, Categoria categoria, int stock, int porcentajeDescuentoEfectivo, int porcentajeRecargoCredito) {
        super(id, descripcion, precio, categoria, stock);
        this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
        this.porcentajeRecargoCredito = porcentajeRecargoCredito;
    }

    public ProductoMinorista(int id, int precio, String descripcion, int stock, int porcentajeDescuentoEfectivo, int porcentajeRecargoCredito) {
        super(id, precio, descripcion, stock);
        this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
        this.porcentajeRecargoCredito = porcentajeRecargoCredito;
    }

    public int getPorcentajeDescuentoEfectivo() {
        return porcentajeDescuentoEfectivo;
    }

    public void setPorcentajeDescuentoEfectivo(int porcentajeDescuentoEfectivo) {
        this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
    }

    public int getPorcentajeRecargoCredito() {
        return porcentajeRecargoCredito;
    }

    public void setPorcentajeRecargoCredito(int porcentajeRecargoCredito) {
        this.porcentajeRecargoCredito = porcentajeRecargoCredito;
    }


}
