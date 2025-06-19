package Ejercicios.Unidad4_Ej2;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int n1 = 0,n2 = 0;
        double resultado = 0;
        String operador = "";
        boolean validarn1 = false;
        boolean validarn2 = false;
        boolean validarOperador = false;

        while(!validarn1){
            System.out.println("\nIngrese el primer numero: ");
            String entrada = ingreso.nextLine();
            try{
                n1 = Integer.parseInt(entrada);
                validarn1 = true;
            } catch (NumberFormatException e) {
                System.out.println("\nNumero ingresado incorrecto (" + entrada + ")");
            }
        }

        while(!validarn2){
            System.out.println("\nIngrese el segundo numero: ");
            String entrada = ingreso.nextLine();
            try{
                n2 = Integer.parseInt(entrada);
                validarn2 = true;
            } catch (NumberFormatException e) {
                System.out.println("\nNumero ingresado incorrecto (" + entrada + ")");
            }
        }

        while(!validarOperador){
            System.out.println("\nIngrese el operador (+ , - , * , / ): ");
            operador = ingreso.nextLine();

            if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")){
                validarOperador = true;
            }else{
                System.out.println("ERROR - Operador invalido. Intente nuevamente: ");
            }
        }

        try{
            switch (operador){
                case "+":
                    resultado = n1 + n2;
                    break;
                case "-":
                    resultado = n1 - n2;
                    break;
                case "*":
                    resultado = n1 * n2;
                    break;
                case "/":
                    if(n2 == 0){
                        throw new ArithmeticException("Division por cero.");
                    }
                    resultado = (double) n1 / n2;
                    break;
            }
            System.out.println("\nResultado: " + resultado);

        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por cero.");
        }
    }
}
