package Modulo_3;

public class Ejercicio_4 {
    public static void main(String[] args) {

        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();

        g1.idGallina = 1;
        g1.edad = 2;
        g1.huevosPuestos = 5;

        g2.idGallina = 2;
        g2.edad = 4;
        g2.huevosPuestos = 1;

        g1.envejecer();
        g1.ponerHuevo();

        g2.envejecer();
        g2.ponerHuevo();

        System.out.println("\nEstado final de las gallinas:");
        g1.mostrarEstado();
        System.out.println();
        g2.mostrarEstado();
    }
}