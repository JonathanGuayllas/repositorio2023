
package Model;

import Controller.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class LeerEmpleados {
    ObjectOutputStream flujoSalida;
    FileOutputStream path;
    ArrayList <Empleado> ListaEmpleados;

    public LeerEmpleados(FileOutputStream path) {
        this.path = path;
    }
    
}
