/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author EVE-HP
 */
public class jugador {
    //Atributos
    String nombredeljugador;
    int edad;
    int puntaje;
    
    //Conatructor

    public jugador(String nombredeljugador, int edad, int puntaje) {
        this.nombredeljugador = nombredeljugador;
        this.edad = edad;
        this.puntaje = puntaje;
    }
    
    // Metodo
    public void mostrardatos(){
        System.out.print("El nombre del jugador es;"+nombredeljugador);
          System.out.print("La edad es ;"+edad); 
         System.out.print("Elpuntaje es ;"+puntaje);
      

  
    }
    
}
