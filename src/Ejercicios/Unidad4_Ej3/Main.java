package Ejercicios.Unidad4_Ej3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        String entrada = ingreso.nextLine();


        try{
            int edad = Integer.parseInt(entrada);
            ValidadorDeEdad.verificarEdad(edad);
        }catch (NumberFormatException e){
            System.out.println("Debe ingresar un numero valido.");
        } catch (EdadInvalidaException e) {
            System.out.println("ERROR - " + e.getMessage());
        }
    }
}
