class EmpleadosCompleto extends Empleado {
    public EmpleadosCompleto(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalarioAnual() {
        return getSalarioBase() * 12 * 1.1;
    }
}