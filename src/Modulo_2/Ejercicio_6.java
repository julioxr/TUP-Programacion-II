package Modulo_2;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int num = input.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        input.close();
    }
}
