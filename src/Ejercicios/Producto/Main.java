package Ejercicios.Producto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaVencimientoPapas = LocalDate.of(2025,7,30);

        Proveedor proveedor1 = new Proveedor("Casa Litani","20372235714");
        Proveedor proveedor2 = new Proveedor("La Casita Alimentos", "27229311234");

        Alimento a1 = new Alimento("Papas Fritas Lays",1700,7,proveedor2,fechaVencimientoPapas);
        Electronico e1 = new Electronico("Logitech G305", 35000,3,proveedor1,3);

        a1.mostrarDetalle();
        e1.mostrarDetalle();
    }
}
