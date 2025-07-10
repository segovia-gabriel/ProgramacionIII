package Ejercicios.SistemaBoletos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Crear el sistema
        SistemaVentaBoletos sistema = new SistemaVentaBoletos();

        // Crear y registrar un vuelo
        Vuelo vuelo1 = new Vuelo(
                "FLY001",
                "Asuncion",
                "Buenos Aires",
                LocalDate.of(2025,7,15),
                LocalTime.of(10,30),
                100,
                100,
                150.0
        );

        sistema.agregarVuelo(vuelo1);

        // Crear y registrar un pasajero
        Pasajero pasajero1 = new Pasajero("Gabriel", "Segovia", "P001");
        sistema.registrarPasajero(pasajero1);

        // Comprar boleto
        try{
            Boleto boleto = sistema.comprarBoleto("FLY001","P001",1);
            System.out.println("Boleto comprado: ");
            System.out.println(boleto);
        }catch (Exception e) {
            System.out.println("❌ Error al comprar boleto: " + e.getMessage());
        }

        // Listar vuelos disponibles
        System.out.println("\n🛫 Vuelos con asientos disponibles:");
        sistema.listarVuelosDisponibles();

        // Listar boletos del pasajero
        System.out.println("\n🎟️ Boletos de P001:");
        sistema.listarBoletosPorPasajero("P001");

        // Cancelar boleto
        System.out.println("\n⛔ Cancelando el boleto BOL-1...");
        sistema.cancelarBoleto("BOL-1");

        // Listar boletos nuevamente
        System.out.println("\n🎟️ Boletos de P001 luego de cancelación:");
        sistema.listarBoletosPorPasajero("P001");

        // Verificar asientos disponibles después de cancelar
        System.out.println("\n🛫 Vuelos disponibles luego de cancelación:");
        sistema.listarVuelosDisponibles();
    }
}
