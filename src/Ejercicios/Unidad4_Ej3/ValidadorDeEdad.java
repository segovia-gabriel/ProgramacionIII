package Ejercicios.Unidad4_Ej3;


public class ValidadorDeEdad {
    public static void verificarEdad(int edad) throws EdadInvalidaException {
        if(edad < 0 || edad > 120){
            throw new EdadInvalidaException("Edad invalida - La edad debe ser mayor a 0 o menor a 120");
        }else {
            System.out.println("Edad valida: " + edad);
        }
    }
}
