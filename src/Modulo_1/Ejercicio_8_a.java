package Modulo_1;

import java.util.Scanner;

public class Ejercicio_8_a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = input.nextInt();
        int resultado = num1 / num2;
        System.out.println("Resultado: " + resultado);

        input.close();
    }
}