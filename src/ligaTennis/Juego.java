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

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Juez getJuez() {
        return juez;
    }

    public ArrayList<Set> getSets() {
        return sets;
    }
}
/**
------------- Resultados -------------

Jugador 1: Rafael Nadal
Jugador 2: Martina Hingis
Juez: Pedro Perez
Set 1: 6 - 4
Set 2: 1 - 6
Set 3: 6 - 3
Ganador: Rafael Nadal

Jugador 1: Roger Federer
Jugador 2: Monica Seles
Juez: Alejandro Fernandez
Set 1: 6 - 1
Set 2: 5 - 7
Set 3: 3 - 6
Ganador: Monica Seles

Jugador 1: Novak Djokovic
Jugador 2: Venus Williams
Juez: Pedro Perez
Set 1: 1 - 6
Set 2: 4 - 6
Ganador: Venus Williams

Jugador 1: Andre Agassi
Jugador 2: Martina Navratilova
Juez: Alejandro Fernandez
Set 1: 6 - 2
Set 2: 6 - 0
Ganador: Andre Agassi

Jugador 1: Rafael Nadal
Jugador 2: Monica Seles
Juez: Pedro Perez
Set 1: 6 - 4
Set 2: 4 - 6
Set 3: 3 - 6
Ganador: Monica Seles

Jugador 1: Venus Williams
Jugador 2: Andre Agassi
Juez: Alejandro Fernandez
Set 1: 7 - 5
Set 2: 2 - 6
Set 3: 1 - 6
Ganador: Andre Agassi

Jugador 1: Monica Seles
Jugador 2: Andre Agassi
Juez: Pedro Perez
Set 1: 6 - 2
Set 2: 3 - 6
Set 3: 7 - 9
Ganador: Andre Agassi

El ganador del campeonato es: Andre Agassi

El jugador: Rafael Nadal gano 3 sets en el campeonato
El jugador: Martina Hingis gano 1 sets en el campeonato
El jugador: Roger Federer gano 1 sets en el campeonato
El jugador: Monica Seles gano 5 sets en el campeonato
El jugador: Novak Djokovic gano 0 sets en el campeonato
El jugador: Venus Williams gano 3 sets en el campeonato
El jugador: Andre Agassi gano 6 sets en el campeonato
El jugador: Martina Navratilova gano 0 sets en el campeonato
*/