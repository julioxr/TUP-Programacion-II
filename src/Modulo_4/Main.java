package Modulo_4;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(101, "Julio Roja", "Analista", 70000);
        Empleado e2 = new Empleado("Florencia Esmoris", "Programador");
        Empleado e3 = new Empleado("Juan Perez", "Tester");

        e1.actualizarSalario(10.0);
        e2.actualizarSalario(5000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
