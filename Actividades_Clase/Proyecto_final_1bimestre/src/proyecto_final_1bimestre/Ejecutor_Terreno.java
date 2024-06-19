package proyecto_final_1bimestre;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejecutor_Terreno {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        boolean opc = true;
        String respt = null;
        while (opc) {
            System.out.print("Dame el alto, ancho y vcm");
            Terreno t1 = new Terreno(tc.nextDouble(), tc.nextDouble(), tc.nextDouble());
            t1.calcularArea();
            t1.calcularCostoFinal();
            System.out.println(t1);
            System.out.println("Desea vender más (S/N)?: ");
            respt = tc.next();
            if (respt.equals("N")) {
                break;
            }
        }

    }
}

class Terreno {

    public double alto;
    public double ancho;
    public double vcm;
    public double area;
    public double costoFinal;
    public String msjCompra;

    public Terreno(double alto, double ancho, double vcm) {
        this.alto = alto;
        this.ancho = ancho;
        this.vcm = vcm;
        this.msjCompra = null;
    }

    public void calcularArea() {
        this.area = this.alto * this.ancho;
    }

    public void calcularCostoFinal() {
        this.costoFinal = area * vcm;
        if (area > 300) {
            costoFinal *= 0.8;
            msjCompra = "Felicidades 20% de descuento";
        } else if (area >= 200) {
            costoFinal *= 0.9;
            msjCompra ="Felicidades 10% de descuento";
        }
        // this.costoFinal = (area > - 200) ? (area * vcm * 0.9) : area * vcm;
    }

    @Override
    public String toString() {
        return "Terreno{" + "alto=" + alto + ", ancho=" + ancho + ", vcm=" + vcm + ", area=" + area + ", costoFinal=" + costoFinal + ", msjCompra=" + msjCompra + '}';
    }

}
