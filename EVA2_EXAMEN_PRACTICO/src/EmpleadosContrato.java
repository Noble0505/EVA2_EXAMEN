
    class EmpleadosContrato extends Empleado {
        public EmpleadosContrato(String nombre, double salarioBase) {
            super(nombre, salarioBase);
        }

        @Override
        public double calcularSalarioAnual() {
            return getSalarioBase() * 12;
        }
    }


