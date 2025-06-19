package Ejercicios.Unidad4_Ej4;

import java.io.*;
import java.util.Scanner;

public class Archivos {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese el nombre del archivo: ");
        String nombreArchivo = ingreso.nextLine().trim(); // Utilizamos trim para quitar los espacios

        try{
            //Validamos el nombre del archivo que no este vacio
            if(nombreArchivo.isEmpty()){
                throw new IllegalArgumentException("El nombre del archivo no puede estar vacio.");
            }

            String archivoConExtension = nombreArchivo + ".txt";
            File archivo = new File(archivoConExtension);

            // Intentar abrir el archivo
            BufferedReader lector = new BufferedReader(new FileReader(archivo));

            String linea;
            System.out.println("\nLista de productos: ");

            while ((linea = lector.readLine()) != null) {
            String[] partes = linea.split(",");

            //Validacion: que haya al menos 3 partes (categoria,articulo,precio)
            if(partes.length >= 3){
                String categoria = partes[0].trim();
                String articulo = partes[1].trim();
                String precio = partes[2].trim();

                System.out.println("\nCategoria: " + categoria);
                System.out.println("Articulo: " + articulo);
                System.out.println("Precio: $" + precio);
                System.out.println("-----------------------------------");
            }else{
                System.out.println("Linea malformada: " + linea);
            }
            }
            lector.close();
        }catch (FileNotFoundException e){
            System.out.println("Error, el archivo no fue encontrado.");
        }catch (IllegalArgumentException e){
            System.out.println("Error, " + e.getMessage());
        }catch (IOException e){
            System.out.println("Error, ocurrio un error al leer el archivo.");
        }

    }
}
