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
public class MontaPuerco extends Especial {
    
    public MontaPuerco(String nombre, int daño, int puntos, String objetivo, String velocidad, int coste, String tipo) {
        super(nombre, daño, puntos, objetivo, velocidad, coste, tipo);
        velocidad="alta";
        objetivo="terrestre";
        coste=4;
    }

    public MontaPuerco(String nombre, String velocidad, int coste, String tipo) {
        super(nombre, velocidad, coste, tipo);
    }
    
    
}