package entradasalida;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class EntradaSalida {

    public static void main(String[] args) throws FileNotFoundException {
        // FLUJO DE SALIDA (escritura)
        System.out.println("Hola Mundo");
        Formatter s = new Formatter("test.txt");
        s.format("%s", "steven fallo un poco");
        s.close();
        // Flujo de entrada (lectura)
        Scanner e = new Scanner(System.in);
        String saludo = e.nextLine();
        System.out.println("Ingreso es: " + saludo);
        Scanner s1= new Scanner(new File("test.txt"));
        String valor = s1.nextLine();
        System.out.println("El valor leído del archivo es: " + valor);
    }
    
}
