/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;

/**
 *
 * @author Daniel RC
 */
public class Clan {
    //nombre, lista de miembros, fecha de creación, usuario líder y tipo (Bronce, Plata, Oro y Legendario).
    private String nombre;
    private ArrayList<Usuarios>miembros=new  ArrayList();
    private Usuarios lider;
    String tipo;
}

