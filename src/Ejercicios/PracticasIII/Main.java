package Ejercicios.PracticasIII;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente ("Carolina");
        Producto producto = new Producto("Tafirol", 31.95f);
        FormaDePago credito = new Credito(10);
        FormaDePago efectivo = new Efectivo(5);

        Farmacia.vender(producto,cliente,credito);
    }
}
