package Ejercicios.Veterinaria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {


        // Especialidades
        Especialidad peluqueria = new Especialidad("Peluqueria","Caninos");
        Especialidad clinica = new Especialidad("Clinico","Cirugia");

        // Veterinarios
        Veterinario vet1 = new Veterinario("Lucía", "12345678", peluqueria);
        Veterinario vet2 = new Veterinario("Martín", "87654321", clinica);

        // Servicios
        Servicio bano = new Servicio("Baño", 2000, 30, 100); // 30 min, $100 por min extra
        Servicio consulta = new Servicio("Consulta General", 3000, 20, 200);

        // Dueno
        Dueno romina = new Dueno("Romina","3755889922");
        Dueno pedro = new Dueno("Pedro", "3755283122");

        // Mascotas
        Mascota mascota1 = new Mascota("Firulai",7,"Caniche",romina,3);
        Mascota mascota2 = new Mascota("Chuchu",2,"Ovejero Aleman", pedro, 9);

        // Turnos
        Turno turno1 = new Turno(LocalDate.of(2025,Month.JUNE,25).atStartOfDay(),
                LocalDateTime.of(2025,Month.JUNE,27,14,0),
                LocalDateTime.of(2025,Month.JUNE,27,15,15),
                mascota1,
                vet1,
                bano);

        //Turno turno2 = new Turno();

        // Imprimir datos y costos
        System.out.println(turno1.detalleTotal());
        System.out.println("-------------------------------");
        //System.out.println(turno2.detalleTotal());
    }
}
