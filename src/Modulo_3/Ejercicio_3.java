package Modulo_3;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Libro libro1 = new Libro();

        libro1.setTitulo("La invencion de Morel");
        libro1.setAutor("Adolfo Bioy Casare");
        libro1.setAnioPublicacion(1940);

        libro1.mostrarInfo();

        libro1.setAnioPublicacion(-200);

        libro1.setAnioPublicacion(2020);

        System.out.println("\nInformacion final del libro:");
        libro1.mostrarInfo();
    }
}