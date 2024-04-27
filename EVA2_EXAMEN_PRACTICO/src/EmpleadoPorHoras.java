class EmpleadoPorHoras extends Empleado implements EmpleadosHoras {
    private double salarioPorHora;

    public EmpleadoPorHoras(String nombre, double salarioBase, double salarioPorHora) {
        super(nombre, salarioBase);
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double calcularSalarioAnual() {
        return calcularSalarioMensual(160) * 12;
    }

    @Override
    public double calcularSalarioMensual(int horasTrabajadas) {
        return getSalarioBase() + salarioPorHora * horasTrabajadas;
    }
}