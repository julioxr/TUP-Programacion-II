package Modulo_3;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();

        estudiante1.nombre = "Lucia";
        estudiante1.apellido = "Gomez";
        estudiante1.curso = "Programacion II";
        estudiante1.calificacion = 7.5;

        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(1.5);
        estudiante1.bajarCalificacion(2.0);

    }
}