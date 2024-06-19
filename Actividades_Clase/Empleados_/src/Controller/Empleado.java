
package Controller;


public class Empleado {
    public String nombre;
    public double salario;
    public int edad;

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", edad=" + edad + '}';
    }
    
}
