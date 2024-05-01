
public class TestPersona {

    public static void main(String[] args) {
        /*
        Persona p1 = new Persona();
        Persona p2 = new Persona("Nicole", 20);
        Persona p3 = new Persona("Liz");
        p3.setEdad(p3.calcularEdad(2005));
        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());
        System.out.println(p2.getNombre());
        System.out.println(p2.getEdad());
        System.out.println(p3.getNombre());
        System.out.println(p3.getEdad());// calculo la edad llamando al metodo
        System.out.println(p3.toString());
         */
        Persona p1 = new Persona(2010, 42, 2);
        Persona p2 = new Persona(2000, 100, 1);
        p1.calcularEdad();
        p1.calcularSueldo();
        p2.calcularEdad();
        p2.calcularSueldo();
        System.out.println(p1);
        System.out.println(p2);
    }
}

class Persona {

    
    private int nacimiento;
    protected double horas;
    public double costoHora;
    public double sueldo;
    // public Persona() {} // sobrecarga constructores (todos en valores vacios)
    // public Persona(String nomb) { // constructores solo 2 o más (si no get y set)
    //    this.nomb = nomb;
    //}

    public Persona(int nacimiento, int horas, int  costoHora) {
        this.nacimiento = nacimiento;
        this.horas = horas;
        this.costoHora = costoHora;
    }

    @Override
    public String toString() {
        return String.format("Persona{año de nacimiento = %d, horas trabajadas = %.0f, costo hora = %.2f, sueldo = %.2f}",
                nacimiento, horas, costoHora, sueldo);
    }

    public void calcularEdad() {
        this.nacimiento = 2024 - nacimiento;
    }

    // if ternario
    public void reCalcularSueldo() {
        //                condicion               si              no
        this.horas = (this.horas > 40) ? horas * 2 * calcularSueldo : horas * 1.1;
        
    }
    public void calcularSueldo(){
        this.sueldo = (nacimiento >= 18) ? horas * 1.1 : horas * 1.05;
    }
}
/*

}

/*
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int calcularEdad(int anioNac) {
        return 2024 - anioNac;

    }

    public String getNombre() {
        return this.nomb;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nEdad:%d", this.nomb, this.edad);
    }
 */
