package lab5;

class Carta {
    //Nombre, Daño, Puntos de Vida, Objetivo (Aereos, Terrestres o Aereos y Terrestres), Velocidad (Alta, Media y Baja) y Coste de Elixir. Pueden Comun, Especial, Epica y Legendaria.
    private String nombre;
    private int daño;
    private int puntos;
    private String objetivo;
    private String velocidad;
    private int coste;
    private String tipo;

    public Carta(String nombre, int daño, int puntos, String objetivo, String velocidad, int coste, String tipo) {
        this.nombre = nombre;
        this.daño = daño;
        this.puntos = puntos;
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.coste = coste;
        this.tipo = tipo;
    }

    public Carta(String nombre, String velocidad, int coste, String tipo) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.coste = coste;
        this.tipo = tipo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
