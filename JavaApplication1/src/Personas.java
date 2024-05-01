public class Personas {

    public String nomb;
    private int edad;

    public Personas(String nomb, int edad) {
        this.nomb = nomb;
        this.edad = edad;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personas{" + "nomb=" + nomb + ", edad=" + edad + '}';
    }

}
