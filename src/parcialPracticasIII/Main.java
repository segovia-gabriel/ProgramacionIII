package parcialPracticasIII;

public class Main {
    public static void main(String[] args) {

        Empleado directivo = new Directivo("Carlos",38,15,370000,35000);
        Empleado operativo1 = new Operativo("Manuel",25,5,250000);
        Empleado operativo2 = new Operativo("Alicia",29,25,250000);

        System.out.println("\nEl Sr." + directivo.getNombre() + " cobra: $" + directivo.calcularSueldo());
        System.out.println("\nEl Sr." + directivo.getNombre() + " cobra: $" + operativo1.calcularSueldo());
        System.out.println("\nLa Sra." + directivo.getNombre() + " cobra: $" + operativo2.calcularSueldo());

    }
}
