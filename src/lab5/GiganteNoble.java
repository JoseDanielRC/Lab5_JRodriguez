/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;


public class GiganteNoble extends Comun{
    
    public GiganteNoble(String nombre, int daño, int puntos, String objetivo, String velocidad, int coste, String tipo) {
        super(nombre, daño, puntos, objetivo, velocidad, coste, tipo);
    velocidad="media";
        objetivo="terrestre";
        coste=6;
    }

    public GiganteNoble(String nombre, String velocidad, int coste, String tipo) {
        super(nombre, velocidad, coste, tipo);
    }
    
}
