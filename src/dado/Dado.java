/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dado;

/**
 *
 * @author caicedo
 */
import java.util.Random;

public class Dado {
    private int numero;

    public Dado() {
        this.numero = 0;
    }

    public void lanzar() {
        Random rand = new Random();
        this.numero = rand.nextInt(6) + 1;
    }

    public int getNumero() {
        return this.numero;
    }
}
    
    
    

