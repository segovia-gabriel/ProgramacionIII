package Ejercicios.SistemaBoletos;

public class Pasajero {
    private String nombre;
    private String apellido;
    private String idPasajero;

    public Pasajero(String nombre, String apellido, String idPasajero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPasajero = idPasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(String idPasajero) {
        this.idPasajero = idPasajero;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", idPasajero='" + idPasajero + '\'' +
                '}';
    }
}
