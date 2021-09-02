/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_miguelsierraarroyo_luisfuenteslicero_khalilelhagekassem;

import java.awt.List;

/**
 *
 * @author khali
 */
public class Bloque extends Nodo{
    //Aqui estoy buscando una alternatica al vector transacciones
    private Transaccion transacciones[] = new Transaccion[3];
    private Bloque bloqueSiguiente;
    private static int id = 0;
    
    public Bloque() {
        super(String.valueOf(id++));
    }

    public static int getId() {
        return id;
    }
    
}
