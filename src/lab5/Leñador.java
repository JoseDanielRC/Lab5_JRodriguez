
package lab5;


public class Leñador extends Legendaria {
    
    public Leñador(String nombre, int daño, int puntos, String objetivo, String velocidad, int coste, String tipo) {
        super(nombre, daño, puntos, objetivo, velocidad, coste, tipo);
        velocidad="alta";
        objetivo="terrestre";
        coste=4;
    
    }

    public Leñador(String nombre, String velocidad, int coste, String tipo) {
        super(nombre, velocidad, coste, tipo);
    }
    
}
