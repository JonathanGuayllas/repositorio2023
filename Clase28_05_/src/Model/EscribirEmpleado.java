
package Model;

import Controller.*;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileOutputStream;

public class EscribirEmpleado {
    ObjectOutputStream flujoSalida;
    FileOutputStream path;
    ArrayList <Empleado> ListaEmpleados;  

    public EscribirEmpleado(FileOutputStream path, ArrayList <Empleado> ListaEmpleados) {
        this.path = path;
        this.ListaEmpleados = ListaEmpleados;
    }
    public void escribirObjetoEmpleado(){
        try{
            this.flujoSalida = new ObjectOutputStream(path);
        for (Empleado emp: ListaEmpleados)
            flujoSalida.writeObject(emp);
        }catch (Exception e){
            
        }
    }
}
