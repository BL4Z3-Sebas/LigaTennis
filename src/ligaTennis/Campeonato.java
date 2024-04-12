/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligaTennis;

import java.util.ArrayList;

/**
 *
 * @author smindiola
 */
public class Campeonato {
    private ArrayList<Juego> juegos;

    public Campeonato() {
        this.juegos=new ArrayList<>();
    }
   public boolean addJuego(Juego juegos){
       this.juegos.add(juegos);
       return true;
       
   }
   public Juego getJuego(int index){
       return this.juegos.get(index);
   }
   
   public void showResumen(){
       for (Juego juego : this.juegos) {
           System.out.println("Jugador 1: "+juego.getJugador1().getNombre() );
           System.out.println("Jugador 2: "+juego.getJugador2().getNombre() );
           System.out.println("Juez: "+juego.getJuez().getNombre());
           int index=1;
           for (Set set:juego.getSets()) {
               System.out.println("Set "+index+": "+set.getPuntoJugador1()+" - "+set.getPuntoJugador2());
               index++;
           }
           System.out.println("Ganador: "+juego.getGanador().getNombre());
       }
       System.out.println("El ganador del campeonato es: "+this.juegos.get(this.juegos.size()-1).getGanador().getNombre());
   }
}
