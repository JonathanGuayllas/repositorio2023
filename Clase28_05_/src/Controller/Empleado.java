package Controller;

public class Empleado {

    public String titulo;
    public int edad;
    public int experiencia;
    public int numEstrella;

    public Empleado(String titulo, int edad, int experiencia) {
        this.titulo = titulo;
        this.edad = edad;
        this.experiencia = experiencia;
    }

    public void calcularNumEstrellas(String carrerasDemandadas[]) {
        for (String carrera : carrerasDemandadas) {
            if (titulo.equals(carrera)) {
                numEstrella = 1;
            }
            break;
        }
        if (((edad >= 18) && (edad <= 30)) && (experiencia >= 6)){
            
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "titulo=" + titulo + ", edad=" + edad + ", experiencia=" + experiencia + '}';
    }

}
