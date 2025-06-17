package Ejercicios.Ofertas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear categorías
        Categoria cat1 = new Categoria("Electrónica", true);
        Categoria cat2 = new Categoria("Alimentos", true);

        // Crear productos minoristas
        ProductoMinorista prod1 = new ProductoMinorista(1, "Auriculares", 15000, cat1, 10, 5, 10);
        ProductoMinorista prod2 = new ProductoMinorista(2, "Mouse", 8000, cat1, 20, 10, 15);
        ProductoMinorista prod3 = new ProductoMinorista(3, "Galletitas", 1200, cat2, 30, 3, 5);
        ProductoMinorista prod4 = new ProductoMinorista(4, "Jugo", 900, cat2, 50, 2, 3);

        // Crear arrays de productos
        ProductoMinorista[] productosOferta1 = { prod1, prod2 };
        ProductoMinorista[] productosOferta2 = { prod3, prod4 };

        // Crear fechas
        LocalDate hoy = LocalDate.now();
        LocalDate proximaSemana = hoy.plusDays(7);

        // Crear ofertas
        Oferta oferta1 = new Oferta(productosOferta1,hoy,proximaSemana,15);
        Oferta oferta2 = new Oferta(productosOferta2, hoy, proximaSemana, 5);

        // Mostrar ofertas
        mostrarOferta(oferta1);
        System.out.println("--------------------------------------------------");
        mostrarOferta(oferta2);
    }

    // Método para mostrar detalles de una oferta
    public static void mostrarOferta(Oferta oferta) {
        System.out.println("\nFecha de inicio: " + oferta.getFechaInicio());
        System.out.println("\nFecha de fin: " + oferta.getFechaFin());
        System.out.println("\nDescuento aplicado: " + oferta.getPorcentajeDescuento() + "%");
        System.out.println("\nProductos:");

        for (ProductoMinorista prod : oferta.getProductos()) {
            System.out.println(prod.detalles());

            double precioConDescuento = prod.getPrecio() * (1 - oferta.getPorcentajeDescuento() / 100.0);
            System.out.printf("\nPrecio con descuento: $%.2f%n", precioConDescuento);
            System.out.println();
        }
    }
}
