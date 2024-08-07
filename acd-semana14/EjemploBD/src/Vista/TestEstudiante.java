package Vista;
import Modelo.Estudiante;
import Controlador.ProcesarEstudiantes;
import java.util.ArrayList;
import java.util.List;
public class TestEstudiante {
    public static void main(String[] args) {
        ArrayList<Estudiante> lstEst = new ArrayList<Estudiante>(List.of(
                new Estudiante("Pedro", (int) (Math.random()*10+0), (int) (Math.random()*10+0)), 
                new Estudiante("Suanny", (int) (Math.random()*10+0), (int) (Math.random()*10+0)),
                new Estudiante("Marquito", (int) (Math.random()*10+0), (int) (Math.random()*10+0)),
                new Estudiante("Yo", (int) (Math.random()*10+0), (int) (Math.random()*10+0))));
        ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEst);
        procesarEstudiantes.calculoPromedios();
        procesarEstudiantes.calculoEstados();
        for (Estudiante est : lstEst) 
            procesarEstudiantes.insertarEstudiante(est);
        ArrayList<Estudiante> lstEst2 = procesarEstudiantes.getLstEstudiantes();
        for (Estudiante est : lstEst2) 
            System.out.println(est);
    }
}
