package Modulo_3;

public class Ejercicio_5 {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial();
        nave1.nombre = "Apollo 11";
        nave1.combustible = 50;

        nave1.mostrarEstado();
        nave1.avanzar(30);

        nave1.recargarCombustible(40);

        nave1.despegar();
        nave1.avanzar(20);

        System.out.println("\nEstado final de la nave:");
        nave1.mostrarEstado();
    }
}