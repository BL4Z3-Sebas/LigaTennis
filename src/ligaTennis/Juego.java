/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligaTennis;

import java.util.ArrayList;
import personas.Juez;
import personas.Jugador;

/**
 *
 * @author smindiola
 */
public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Juez juez;
    private Juego juegoPrevio1;
    private Juego juegoPrevio2;
    private Juego JuegoSiguiente;
    private ArrayList<Set> sets;

    public Juego(Jugador jugador1, Jugador jugador2, Juez juez) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.juez = juez;
        this.juegoPrevio1=null;
        this.juegoPrevio2=null;
        this.JuegoSiguiente=null;
        this.sets=new ArrayList<>();
        
        this.jugador1.addJuego(this);
        this.jugador2.addJuego(this);
        this.juez.addJuego(this);
    }

    public Juego( Juego juegoPrevio1, Juego juegoPrevio2,Juez juez) {
        
        this.jugador1 = juegoPrevio1.getGanador();
        this.jugador2 = juegoPrevio2.getGanador();
         this.juez = juez;
        this.juegoPrevio1=juegoPrevio1;
        this.juegoPrevio2=juegoPrevio2;
        this.JuegoSiguiente=null;
        this.sets=new ArrayList<>();
        
        this.jugador1.addJuego(this);
        this.jugador2.addJuego(this);
        this.juez.addJuego(this);
        
        this.juegoPrevio1.setJuegoSiguiente(this);
        this.juegoPrevio2.setJuegoSiguiente(this);
    }

    public void setJuegoSiguiente(Juego JuegoSiguiente) {
        this.JuegoSiguiente = JuegoSiguiente;
    }
    
    
    public boolean addSets(Set set1,Set set2,Set set3){
        this.sets.add(set1);
        this.sets.add(set2);
        this.sets.add(set3);
        return true;
    }
   
    public boolean addSets(Set set1,Set set2){
        this.sets.add(set1);
        this.sets.add(set2);
        
        return true;
    }
    
    public Jugador getGanador(){
        Set ultimoSet=this.sets.get(this.sets.size()-1);
        if (ultimoSet.getPuntoJugador1()> ultimoSet.getPuntoJugador2()) {
            return this.jugador1;
        }
        return this.jugador2;
    }
}
