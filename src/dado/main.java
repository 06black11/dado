/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dado;

/**
 *
 * @author caicedo
 */
import java.util.Random;

public class main {


   public static void main(String[] args) {
    Dado dado = new Dado();
    dado.lanzar();
    System.out.println("El número obtenido es: " + dado.getNumero());
}

}
