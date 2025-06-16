package Ejercicios.TarjetasBancarias;

public class Main {
    public static void main(String[] args) {
        // 1. Crear TarjetaVirtual
        TarjetaVirtual virtual = new TarjetaVirtual(123456, 123, "12/26", "Gabriel Segovia", true);

        // 2. Crear TarjetaDebito
        TarjetaDebito debito = new TarjetaDebito(654321, 456, "10/25", "Lucía Méndez", 50000, "Visa");

        // 3. Crear TarjetaCredito
        TarjetaCredito credito = new TarjetaCredito(789012, 789, "05/28", "Carlos Pérez", 1500, "Mastercard");

        // Mostrar datos
        System.out.println("=== Tarjeta Virtual ===");
        System.out.println("Titular: " + virtual.getTitular());
        System.out.println("Número: " + virtual.getNumero());
        System.out.println("Activa: " + virtual.isActivo());

        System.out.println("\n=== Tarjeta Débito ===");
        System.out.println("Titular: " + debito.getTitular());
        System.out.println("Proveedor: " + debito.getProveedor());
        System.out.println("Límite Diario: $" + debito.getLimiteDiario());
        System.out.println("Categoría: " + debito.mostrarCategoria());

        System.out.println("\n=== Tarjeta Crédito ===");
        System.out.println("Titular: " + credito.getTitular());
        System.out.println("Proveedor: " + credito.getProveedor());
        System.out.println("Mantenimiento: $" + credito.getMontoMantenimiento());
        System.out.println("Categoría: " + credito.mostrarCategoria());

        // Comparación de tarjetas (equals)
        TarjetaVirtual otraVirtual = new TarjetaVirtual(123456, 123, "12/26", "Gabriel Segovia", false);
        System.out.println("\n¿Tarjeta Virtual es igual a otra con mismo número y CVV? " + virtual.equals(otraVirtual));
    }
}
