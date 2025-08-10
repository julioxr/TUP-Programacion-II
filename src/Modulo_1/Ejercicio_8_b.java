package Modulo_1;

import java.util.Scanner;

public class Ejercicio_8_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1 = input.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = input.nextDouble();
        double resultado = num1 / num2;
        System.out.println("Resultado: " + resultado);

        input.close();
    }
}