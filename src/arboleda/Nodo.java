/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboleda;

/**
 *
 * @author salon
 */
public class Nodo {
    private Nodo derecho;
    private Nodo izquierdo;
    private int dato;

    public Nodo(int dato) {
        this.dato = dato;
        this.derecho = null;
        this.izquierdo = null;
        
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public int getDato() {
        return dato;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
    
    
    
}
