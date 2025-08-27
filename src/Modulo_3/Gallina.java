package Modulo_3;

public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " puso un huevo. Total huevos: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " ahora tiene " + edad + " años.");
    }

    public void mostrarEstado() {
        System.out.println("ID Gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}