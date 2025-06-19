package Ejercicios.Unidad4_Ej1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int num = 0;
        boolean valido = false;

        while(!valido){
            System.out.println("Ingrese un numero entero: ");
            String entrada = ingreso.nextLine();
        try{
            num = Integer.parseInt(entrada);
            valido = true;
        }catch (NumberFormatException e){
            System.out.println("\nERROR - Debe ingresar un numero entero valido.");}
        }
        for (int i = 0; i < num; i++) {
            System.out.println("EXITO");
        }
    }
}
