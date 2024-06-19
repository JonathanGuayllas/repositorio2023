
public class Herencia_1 {

    public static void main(String[] args) {
        // deben salir 4 no 3 
            ReparacionChapasPintura trabChapas= new ReparacionChapasPintura(0, "Auto de suanny", 14);
        ReparacionMecanica trabMecanico = new ReparacionMecanica(0, 0, "Moto de Ricardo", 14);
        Revision trabRevision = new Revision(0, "Moto de pedro", 7);
        trabMecanico.setEstado("INICIADO");
        trabChapas.setEstado("INICIADO");
        trabRevision.setEstado("INICIADO");
        trabMecanico.aumentarPrecio(100);
        trabChapas.aumentarHoras(5.5);
        trabMecanico.calcularCostoTrabajo();
        System.out.println(trabMecanico);
        System.out.println(trabChapas);
        System.out.println(trabRevision);
        
    }
}
// clase padre de la que se heredan todos los metodos y variables 
class Trabajo {

    public int id;
    public String descripcion;
    public double numeroHoras;
    public String estado;
    public double costoTrabajo;
    public int plazo;

    public Trabajo() {
    }

    public Trabajo(int id, String descripcion, int plazo) {
        this.id = id;
        this.descripcion = descripcion;
        this.plazo = plazo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void aumentarHoras(double numerosHoraIncremento) {
        this.numeroHoras += numerosHoraIncremento;

    }

    public double calcularCostoTrabajo() {
        this.costoTrabajo = this.numeroHoras * 30;
        return this.costoTrabajo;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "id=" + id + ", descripcion=" + descripcion + ", numeroHoras=" + numeroHoras + ", estado=" + estado + ", costoTrabajo=" + costoTrabajo + ", plazo=" + plazo + '}';
    }

}
// hereda todo de forma implicita aunque no lo use
class ReparacionMecanica extends Trabajo {

    public double precioMaterial;

    public ReparacionMecanica(double precioMaterial, int id, String descripcion, int plazo) {
        super(id, descripcion, plazo);
        this.precioMaterial = precioMaterial;
    }

    @Override
    public double calcularCostoTrabajo() {
        //                  heredo la clase con el super 
        this.costoTrabajo = super.calcularCostoTrabajo() + (this.precioMaterial*1.1);
        return this.costoTrabajo;
    }

    public void aumentarPrecio(double precioMaterialExtra) {
        this.precioMaterial+= precioMaterialExtra;
    }

    @Override
    public String toString() {
        return "ReparacionMecanica{" + super.toString() + "precioMaterial=" + precioMaterial + '}';
    }

}

class ReparacionChapasPintura extends Trabajo {

    public double precioMaterial;

    public ReparacionChapasPintura(int id, String descripcion, int plazo) {
        super(id, descripcion, plazo);
        this.precioMaterial = precioMaterial;
    }

    public double calcularCostoTrabajo() {
        this.costoTrabajo = super.calcularCostoTrabajo() + (this.precioMaterial*1.3);
        return this.costoTrabajo;
    }

    public void aumentarPrecio() {
    }

    @Override
    public String toString() {
                                    // mejora el to string mejorando   
        return "ReparacionChapasPintura{" + super.toString() + "precioMaterial=" + precioMaterial + '}';
    }

}

class Revision extends Trabajo {

    public Revision(int id, String descripcion, int plazo) {
        super(id, descripcion, plazo);
    }

    @Override
    public double calcularCostoTrabajo() {
        this.costoTrabajo = super.calcularCostoTrabajo() + 20;
        return this.costoTrabajo;
    }
}
