package Modulo_2;

import java.util.Scanner;

public class Ejercicio_9 {

    // a) Calcular costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona inválida, se asigna costo 0.");
            return 0;
        }
    }

    // b) Calcular total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();

        input.nextLine();
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = input.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        input.close();
    }
}
