package Model;

import Controller.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscribirEmpleados {

    ObjectOutputStream flujoSalida;
    FileOutputStream path;
    ArrayList<Empleado> listaEmpleados;

    public EscribirEmpleados(FileOutputStream path, ArrayList<Empleado> listaEmpleados) {
        this.path = path;
        this.listaEmpleados = listaEmpleados;
    }

    public void escribirObjetosEmpleados() {
        try {
            this.flujoSalida = new ObjectOutputStream(path);
            for (Empleado emp : listaEmpleados) {
                flujoSalida.writeObject(emp);
            }
        } catch (Exception e) {
        }
    }
}
