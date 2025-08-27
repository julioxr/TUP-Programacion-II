package Modulo_3;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Foxi";
        mascota1.especie = "Perro";
        mascota1.edad = 3;

        mascota1.mostrarInfo();

        mascota1.cumplirAnios();

        System.out.println("\nDespues de cumplir años:");
        mascota1.mostrarInfo();
    }
}