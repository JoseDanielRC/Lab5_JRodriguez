/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Daniel RC
 */
public class MiniPekka extends Especial {
    
    public MiniPekka(String nombre, int daño, int puntos, String objetivo, String velocidad, int coste, String tipo) {
        super(nombre, daño, puntos, objetivo, velocidad, coste, tipo);
        //Velocidad Alta y Objetivos Terrestres. Cuesta 4 de elixir.
        velocidad="alta";
        objetivo="terrestre";
        coste=4;
    }

    public MiniPekka(String nombre, String velocidad, int coste, String tipo) {
        super(nombre, velocidad, coste, tipo);
    }
    
    
}
