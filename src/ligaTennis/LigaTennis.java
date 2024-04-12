/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligaTennis;

import java.util.ArrayList;
import personas.Juez;
import personas.Jugador;
import personas.Persona;

/**
 *
 * @author smindiola
 */
public class LigaTennis {
    private ArrayList<Campeonato> campeonatos;
    private ArrayList<Juez> jueces;
    private ArrayList<Jugador> jugadores;

    public LigaTennis() {
        this.campeonatos=new ArrayList<>();
        this.jueces=new ArrayList<>();
        this.jugadores=new ArrayList<>();
    }
    public boolean addJuez(Juez juez){
        this.jueces.add(juez);
        return true;
    }
    
    public boolean addJugador(Jugador jugador){
        this.jugadores.add(jugador);
        return true;
    }
    public boolean addCampeonato(Campeonato campeonato){
        this.campeonatos.add(campeonato);
        return true;
    }
    public Campeonato getCampeonato(int index){
        return this.campeonatos.get(index);
    }
    public Jugador getJugador(int index){
        return this.jugadores.get(index);
    }
    public Juez getJuez(int index){
        return this.jueces.get(index);    
    }
    public void calcSetsGanadosJugadoresCampeonato(int index){
        
    }
}
