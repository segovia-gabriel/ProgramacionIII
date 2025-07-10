package Ejercicios.SistemaBoletos;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaVentaBoletos {

    private List<Vuelo> vuelosDisponibles;
    private List<Pasajero> pasajerosRegistrados;
    private List<Boleto> boletosEmitidos;

    public SistemaVentaBoletos(){
        vuelosDisponibles = new ArrayList<>();
        pasajerosRegistrados = new ArrayList<>();
        boletosEmitidos = new ArrayList<>();
    }

    // Agrega un nuevo vuelo a la lista
    public void agregarVuelo(Vuelo vuelo) {
        vuelosDisponibles.add(vuelo);
    }

    // Agrega un pasajero al sistema
    public void registrarPasajero(Pasajero pasajero) {
        pasajerosRegistrados.add(pasajero);
    }

    // Busca un vuelo por número, si no lo encuentra lanza excepción
    public Vuelo buscarVuelo(String numeroVuelo) throws VueloNoEncontradoException {
        for(Vuelo v : vuelosDisponibles){
            if(v.getNumeroVuelo().equals(numeroVuelo)){
                return v;
            }
        }
        throw new VueloNoEncontradoException("Vuelo no encontrado: " + numeroVuelo);
    }

    // Busca un pasajero por ID, si no lo encuentra lanza excepción
    public Pasajero buscarPasajero(String idPasajero) throws PasajeroNoRegistradoException {
        for(Pasajero p : pasajerosRegistrados) {
            if(p.getIdPasajero().equals(idPasajero)){
                return p;
            }
        }
        throw new PasajeroNoRegistradoException("Pasajero no registrado: " + idPasajero);
    }

    // Cancela un boleto, libera asientos y lo elimina de la lista
    public void cancelarBoleto(String numeroBoleto){
        Boleto boletoAEliminar = null;
        for(Boleto b : boletosEmitidos){
            if(b.getNumeroBoleto().equals(numeroBoleto)){
                boletoAEliminar = b;
                break;
            }
        }

        if(boletoAEliminar != null){
            boletoAEliminar.getVuelo().cancelarAsientos(1);
            boletosEmitidos.remove(boletoAEliminar);
        }else {
            System.out.println("Boleto no encontrado");
        }
    }

    // Lista todos los vuelos con asientos disponibles
    public void listarVuelosDisponibles() {
        for (Vuelo v : vuelosDisponibles) {
            if (v.getAsientosDisponibles() > 0) {
                System.out.println(v);
            }
        }
    }

    public void listarBoletosPorPasajero(String idPasajero){
        for (Boleto b : boletosEmitidos){
            if (b.getPasajero().getIdPasajero().equals(idPasajero)){
                System.out.println(b);
            }
        }
    }

    public Boleto comprarBoleto(String numeroVuelo, String idPasajero, int cantidadAsientos) throws VueloNoEncontradoException, PasajeroNoRegistradoException, AsientosNoDisponiblesException {
        Vuelo vuelo = buscarVuelo(numeroVuelo);
        Pasajero pasajero = buscarPasajero(idPasajero);
        double precioFinal = vuelo.reservarAsientos(cantidadAsientos);
        String numeroBoleto = "BOL-" + (boletosEmitidos.size() + 1);
        Boleto boleto = new Boleto(numeroBoleto,vuelo,pasajero,precioFinal, LocalDate.now());
        boletosEmitidos.add(boleto);
        return boleto;
    }

}
