/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

class Mazos {
   //tendran Coste que sera el promedio del coste de las cartas y contendran 3 cartas
    private double coste;
    private Carta carta1;
    private Carta carta2;
    private Carta carta3;

    public Mazos(double coste, Carta carta1, Carta carta2, Carta carta3) {
        this.coste = coste;
        this.carta1 = carta1;
        this.carta2 = carta2;
        this.carta3 = carta3;
    }

    public Mazos() {
    }
    

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public Carta getCarta1() {
        return carta1;
    }

    public void setCarta1(Carta carta1) {
        this.carta1 = carta1;
    }

    public Carta getCarta2() {
        return carta2;
    }

    public void setCarta2(Carta carta2) {
        this.carta2 = carta2;
    }

    public Carta getCarta3() {
        return carta3;
    }

    public void setCarta3(Carta carta3) {
        this.carta3 = carta3;
    }

    @Override
    public String toString() {
        return "Mazo" ;
    }
    
}
