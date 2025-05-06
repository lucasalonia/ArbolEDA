
package arboleda;

import java.util.ArrayList;

public class ArbolBinario {
    
    private final int[] arr;
    
    private final int capacidad;

    public ArbolBinario(int grado, int nivel) {
        this.capacidad = (int) Math.pow(grado, nivel)-1;
        this.arr = new int[this.capacidad];
        
        for (int i=0; i<arr.length; i++) {
            
            arr[i] = -1;
        }
    }
    
    public boolean insert(int dato ) {
        int i = 0;
        
        if (arr[i]==-1) {
            arr[i] = dato;
            return true;
        }else {
            while (i<capacidad && arr[i]!=-1) {
                if (dato<=arr[i]) {
                    
                    i = 2*i+1;
                    
                }else {
                    
                    i = 2*i+2;
                }
            }
            if (i<capacidad) {
                arr[i] = dato;
                return true;
            }
            System.err.println("No se pudo insertar en el arbol");
            return false;
        }
    }
    
    public ArrayList inOrden() {
        ArrayList list = new ArrayList<>();
        inOrdenAux(list, 0);
        
        return list;
    }
    
    private void inOrdenAux(ArrayList list, int index) {
        if (index<capacidad && arr[index]!=-1) {
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
        if (index<capacidad && arr[index]!=-1) {
            list.add(arr[index]);
            System.out.println(" - "+arr[index]);
            inOrdenAux(list, 2*index+1);
            inOrdenAux(list, 2*index+2);
        }
    }
    
     public ArrayList postOrden() {
        ArrayList list = new ArrayList<>();
        postOrdenAux(list, 0);
        
        return list;
    }
    
    private void postOrdenAux(ArrayList list, int index) {
        if (index<capacidad && arr[index]!=-1) {
            inOrdenAux(list, 2*index+1);
            inOrdenAux(list, 2*index+2);
            list.add(arr[index]);
            System.out.println(" - "+arr[index]);
        }
    }
    
    
}
