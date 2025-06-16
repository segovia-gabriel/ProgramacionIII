package Ejercicios.Veterinaria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Turno {
    private LocalDateTime fechaHora;
    private LocalDateTime fechaHoraInicioAtencion;
    private LocalDateTime fechaHoraFinAtencion;
    private Mascota mascota;
    private Veterinario veterinario;
    private Servicio servicio;

    public Turno(LocalDateTime fechaHora, LocalDateTime fechaHoraInicioAtencion, LocalDateTime fechaHoraFinAtencion, Mascota mascota, Veterinario veterinario, Servicio servicio) {
        this.fechaHora = fechaHora;
        this.fechaHoraInicioAtencion = fechaHoraInicioAtencion;
        this.fechaHoraFinAtencion = fechaHoraFinAtencion;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.servicio = servicio;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public LocalDateTime getFechaHoraInicioAtencion() {
        return fechaHoraInicioAtencion;
    }

    public void setFechaHoraInicioAtencion(LocalDateTime fechaHoraInicioAtencion) {
        this.fechaHoraInicioAtencion = fechaHoraInicioAtencion;
    }

    public LocalDateTime getFechaHoraFinAtencion() {
        return fechaHoraFinAtencion;
    }

    public void setFechaHoraFinAtencion(LocalDateTime fechaHoraFinAtencion) {
        this.fechaHoraFinAtencion = fechaHoraFinAtencion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }


    public int getDuracionRealMin(){
        //ChronoUnit.MINUTES.between calcula la diferencia en minutos entre dos instantes de tiempo.
        // (int) convierte esa diferencia en int para que sea un numero entero en minutos.
        return (int) ChronoUnit.MINUTES.between(fechaHoraInicioAtencion,fechaHoraFinAtencion);
    }

    public int calcularDiasRestantes(){
        LocalDate hoy = LocalDate.now();
        if(fechaHora.isBefore(hoy.atStartOfDay()) || fechaHora.equals(hoy)){
            return 0;
        }
        // Tuve que castear a int el return porque ChronoUnit devuelve LONG
        return (int) ChronoUnit.DAYS.between(hoy,fechaHora);
    }


    public double calcularCostoTotal(){
        double total = servicio.getPrecioBase();

        int exceso = getDuracionRealMin() - servicio.getDuracionMin();
        if(exceso > 0){
            total += exceso * servicio.getPrecioAdicionalPorMinuto();
        }

        double pesoExtra = mascota.getPeso() - 5;
        if(pesoExtra > 0){
            total += pesoExtra * 500;
        }

        return total;
    }

    public String detalleTotal(){
        StringBuilder detalle = new StringBuilder();
        double precioBase = servicio.getPrecioBase();
        int duracionReal = getDuracionRealMin();
        int duracionMinima = servicio.getDuracionMin();
        double precioExtraMinuto = servicio.getPrecioAdicionalPorMinuto();
        double costoTotal = calcularCostoTotal();

        detalle.append(">>> DETALLE DEL COSTO <<<\n");
        detalle.append("Mascota: ").append(mascota.getNombre()).append("\n");
        detalle.append("Servicio: ").append(servicio.getDescripcion()).append("\n");
        detalle.append("Precio base: $").append(precioBase).append("\n");

        // Minutos extra
        if (duracionReal > duracionMinima){
            int extra = duracionReal - duracionMinima;
            detalle.append("Minutos adicionales: ").append(extra)
                    .append(" x $").append(precioExtraMinuto)
                    .append(" = $").append(extra * precioExtraMinuto).append("\n");
        }else{
            detalle.append("Peso adicional: 0kg\n");
        }

        detalle.append("Costo total: $").append(costoTotal).append("\n");
        return detalle.toString();
    }
}
