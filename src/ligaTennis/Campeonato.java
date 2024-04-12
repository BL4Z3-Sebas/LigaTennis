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
       
   }
}
