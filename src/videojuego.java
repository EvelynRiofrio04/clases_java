/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author EVE-HP
 */
public class videojuego {
    //Atributos
    String nombredevideojuego;
    int puntaje;
    int niveles;
    long tiempo;
    String nombrejugador;
    
    //Constructor

    public videojuego(String nombredevideojuego, int puntaje, int niveles, long tiempo, String nombrejugador) {
        this.nombredevideojuego = nombredevideojuego;
        this.puntaje = puntaje;
        this.niveles = niveles;
        this.tiempo = tiempo;
        this.nombrejugador = nombrejugador;
    }
    
    //Metodo
    public void mostrardatos(){
        System.out.print("El nombre de videojuego es ;"+nombredevideojuego);
          System.out.print("El puntaje de videojuego ;"+puntaje);
           System.out.print("El nivel es;"+niveles);
           System.out.print("El tiempo;"+tiempo);
          System.out.print("El nombre jugador ;"+nombrejugador);
    }

    
}
