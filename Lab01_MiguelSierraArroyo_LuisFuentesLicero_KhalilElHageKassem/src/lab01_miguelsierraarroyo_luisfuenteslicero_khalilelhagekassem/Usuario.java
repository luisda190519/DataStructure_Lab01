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
public class Usuario extends Nodo{
    private String nombre;
    private String apellido;
    private float balance;
    private Usuario izquierda;
    private Usuario derecha;
    private static int id = 0;
    
    public Usuario(String nombre, String apellido, float balance) {
        super(String.valueOf(id++));
        this.nombre = nombre;
        this.apellido = apellido;
        this.balance = balance;
    }

    public Usuario getIzquierda() {
        return izquierda;
    }
    public Usuario getDerecha() {
        return derecha;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public float getBalance() {
        return balance;
    }
    public static int getId() {
        return id;
    }

    public void setIzquierda(Usuario izquierda) {
        this.izquierda = izquierda;
    }
    public void setDerecha(Usuario derecha) {
        this.derecha = derecha;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    } 
}
