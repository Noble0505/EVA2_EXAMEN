
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleadoTiempoCompleto = new EmpleadosCompleto("Juan", 3000);
        Empleado empleadoPorHoras = new EmpleadoPorHoras("Pedro", 2000, 10);
        Empleado empleadoPorContrato = new EmpleadosContrato("Maria", 2500);

        imprimirDatos(empleadoTiempoCompleto);
        imprimirDatos(empleadoPorHoras);
        imprimirDatos(empleadoPorContrato);
    }


    public static void imprimirDatos(Empleado empleado) {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario anual: $" + empleado.calcularSalarioAnual());
        System.out.println();
    }


}
