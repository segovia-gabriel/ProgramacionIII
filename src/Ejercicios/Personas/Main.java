package Ejercicios.Personas;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Gabriel","37223571","56175");
        System.out.println(e1.generarReporte());
        Obrero o1 = new Obrero("Chicho","99944423",1,150000);
        System.out.println(o1.calcularFacturaTotal());
    }
}
