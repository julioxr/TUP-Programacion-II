package Modulo_3;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Calificacion aumentada: " + calificacion);
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("Calificacion disminuida: " + calificacion);
    }
}