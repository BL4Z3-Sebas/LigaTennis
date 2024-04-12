/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import ligaTennis.Campeonato;
import ligaTennis.Juego;
import ligaTennis.LigaTennis;
import ligaTennis.Set;
import personas.Juez;
import personas.Jugador;

/**
 *
 * @author smindiola
 */
public class main {
   
   
        public static void main(String[] args) {
        // Creacion de la liga
        LigaTennis liga = new LigaTennis();

        // Creacion de los jueces
        liga.addJuez(new Juez("Pedro Perez", 35));
        liga.addJuez(new Juez("Alejandro Fernandez", 29));
        liga.addJuez(new Juez("Mercedez", 54));

        // Creacion de los jugadores
        liga.addJugador(new Jugador("Rafael Nadal", 1250));
        liga.addJugador(new Jugador("Martina Hingis", 980));
        liga.addJugador(new Jugador("Roger Federer", 1420));
        liga.addJugador(new Jugador("Monica Seles", 1120));
        liga.addJugador(new Jugador("Novak Djokovic", 1030));
        liga.addJugador(new Jugador("Venus Williams", 1390));
        liga.addJugador(new Jugador("Andre Agassi", 940));
        liga.addJugador(new Jugador("Martina Navratilova", 1080));

        // Creacion del campeonato
        liga.addCampeonato(new Campeonato());

        // Todos los juegos de la primera ronda se crean en este punto.
        for (int i = 0; i < 8; i += 2) {
            liga.getCampeonato(0).addJuego(new Juego(liga.getJugador(i), liga.getJugador(i + 1), liga.getJuez((i / 2) % 2)));
        }

        liga.getCampeonato(0).getJuego(0).addSets(new Set(6, 4), new Set(1, 6), new Set(6, 3));
        liga.getCampeonato(0).getJuego(1).addSets(new Set(6, 1), new Set(5, 7), new Set(3, 6));
        liga.getCampeonato(0).getJuego(2).addSets(new Set(1, 6), new Set(4, 6));
        liga.getCampeonato(0).getJuego(3).addSets(new Set(6, 2), new Set(6, 0));

        // Semifinal
        for (int i = 0; i < 4; i += 2) {
            liga.getCampeonato(0).addJuego(new Juego(liga.getCampeonato(0).getJuego(i), liga.getCampeonato(0).getJuego(i + 1), liga.getJuez((i / 2) % 2)));
        }

        liga.getCampeonato(0).getJuego(4).addSets(new Set(6, 4), new Set(4, 6), new Set(3, 6));
        liga.getCampeonato(0).getJuego(5).addSets(new Set(7, 5), new Set(2, 6), new Set(1, 6));

        // Final
        liga.getCampeonato(0).addJuego(new Juego(liga.getCampeonato(0).getJuego(4), liga.getCampeonato(0).getJuego(5), liga.getJuez(0)));
        liga.getCampeonato(0).getJuego(6).addSets(new Set(6, 2), new Set(3, 6), new Set(7, 9));

        // Ejecucion de metodos
        liga.getCampeonato(0).showResumen();
        liga.calcSetsGanadosJugadoresCampeonato(0);
    }
       
}
