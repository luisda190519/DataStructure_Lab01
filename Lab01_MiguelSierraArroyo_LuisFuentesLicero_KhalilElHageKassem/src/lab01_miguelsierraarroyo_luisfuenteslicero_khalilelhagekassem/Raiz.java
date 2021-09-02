/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_miguelsierraarroyo_luisfuenteslicero_khalilelhagekassem;

/**
 *
 * @author khali
 */
public class Raiz extends Nodo {
    private Usuario usuario;
    private Bloque bloque;
            
    public Raiz(String texto) {
        super(texto);
        usuario = new Usuario("Usuario", "Origen", 1000);
        bloque = new Bloque();
    }
    
}
