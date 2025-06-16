package Ejercicios.Veterinaria;

public class Mascota {
    private String nombre;
    private int edad;
    private String especie;
    private Dueno dueno;
    private double peso;

    public Mascota(String nombre, int edad, String especie, Dueno dueno, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.dueno = dueno;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
