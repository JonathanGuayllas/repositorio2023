package Controller;

import java.util.ArrayList;

public class Empresa {

    public ArrayList<Empleado> ListaEmpleados;

    public Empresa(ArrayList<Empleado> ListaEmpleados) {
        this.ListaEmpleados = ListaEmpleados;
    }

    public void asignarEstrellas(String carrerasDemandadas[]) {
        for (Empleado emp : ListaEmpleados) {
            emp.calcularNumEstrellas(carrerasDemandadas);
        }
    }

    @Override
    public String toString() {
        return "Empresa{" + "ListaEmpleados=" + ListaEmpleados + '}';
    }

}
