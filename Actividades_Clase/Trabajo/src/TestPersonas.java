/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utpl
 */
public class TestPersonas {
    public static void main(String[] args) {
        Personas p1 = new Personas();
        Personas p2 = new Personas();
        System.out.println(p1);
        System.out.println(p2);
    }
 
}
class Personas {

    public String nomb;
    private int edad;

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }
    public void setEdad(int anioNac){
        this.edad = 2024 - anioNac;
    }
    public void calcularEdad(int anioNac){
        this.setEdad(2024 - anioNac);
    }
    
}

