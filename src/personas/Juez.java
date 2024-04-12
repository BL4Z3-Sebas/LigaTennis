/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.util.ArrayList;
import ligaTennis.Juego;

/**
 *
 * @author smindiola
 */
public class Juez extends Persona{
    
    private int edad;
    private ArrayList<Juego> juegos;
    
    public Juez(String nombre,int edad) {
        super(nombre);
        this.edad=edad;
        this.juegos= new ArrayList<>();
    }
    
    public boolean addJuego(Juego juego){
        this.juegos.add(juego);
        return true;
    }
    
}
