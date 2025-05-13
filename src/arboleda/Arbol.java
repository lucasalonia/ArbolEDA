/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboleda;

import java.util.ArrayList;

/**
 *
 * @author salon
 */
public class Arbol {

    private int capacidad;
    private Nodo arr[];
    private Nodo raiz;

    public Arbol(int grado, int nivel) {
        this.capacidad = (int) Math.pow(grado, nivel) - 1;
        this.arr = new Nodo[this.capacidad];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = null;
        }
    }

    public boolean insert(Nodo nodo) {
        int i = 0;
        Nodo nodoPadre = arr[i];

        if (arr[i] == null) {
            raiz=nodo;
            arr[i] = raiz;//Inserta raiz
            return true;
        } 
        else {
            while (i < capacidad && arr[i] != null) {
                
                if (nodo.getDato() <= arr[i].getDato()) {
                    
                    nodoPadre.setIzquierdo(nodo);
                    
                    i = 2 * i + 1;

                } else {
                    nodoPadre.setDerecho(nodo);
                    i = 2 * i + 2;
                }
            }
            if (i < capacidad) {
                
                arr[i] = nodo;
                return true;
            }
            System.err.println("No se pudo insertar en el arbol");
            return false;
        }
    }

    public Nodo[] getArr() {
        return arr;
    }

    public Nodo getRaiz() {
        return raiz;
    }
    
     public ArrayList inOrden() {
        ArrayList list = new ArrayList<>();
        inOrdenAux(list, 0);
        
        return list;
    }
    
    private void inOrdenAux(ArrayList list, int index) {
        if (index<capacidad && arr[index]!=null) {
            inOrdenAux(list, 2*index+1);
            list.add(arr[index]);
            System.out.println(" - "+arr[index]);
            inOrdenAux(list, 2*index+2);
        }
    }
    
    public ArrayList preOrden() {
        ArrayList list = new ArrayList<>();
        preOrdenAux(list, 0);
        
        return list;
    }
    
    private void preOrdenAux(ArrayList list, int index) {
        if (index<capacidad && arr[index]!=null) {
            list.add(arr[index]);
            System.out.println(" - "+arr[index]);
            inOrdenAux(list, 2*index+1);
            inOrdenAux(list, 2*index+2);
        }
    }
    
    private void busquedaSiEstaOrdenado(int elEscondido){
        
        if(elEscondido == raiz.getDato()){
            System.out.println("Lo encontramos esta en la raiz");
        }
        if(elEscondido<raiz.getDato()){
            System.out.println("moverse ala izq");
        }
        
    } 
    
}
