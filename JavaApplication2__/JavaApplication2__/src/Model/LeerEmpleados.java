package Model;
import Controller.Empleado;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
public class LeerEmpleados {
    public ArrayList<Empleado> listEmpleados;
    public ObjectInputStream flujoEntradaEmp;
    public FileInputStream pathArch;
    public LeerEmpleados(FileInputStream pathArch) {
        this.pathArch = pathArch;
    }
    public void lecturaEmpleadosArchivo(){
        listEmpleados = new ArrayList<Empleado>();
    }
}
