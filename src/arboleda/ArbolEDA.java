
package arboleda;

public class ArbolEDA {

    public static void main(String[] args) {
//        ArbolBinario arbol = new ArbolBinario(2, 4);
//        arbol.insert(8);
//        arbol.insert(4);
//        arbol.insert(2);
//        arbol.insert(10);
//        arbol.insert(12);
//        arbol.insert(11);
//        arbol.insert(13);
//        arbol.insert(14);
//        
//        arbol.inOrden();

        Nodo nodoUno= new Nodo(1);
        Nodo nodoTres= new Nodo(3);
        Nodo nodoDos= new Nodo(2);
        
        Arbol arbol = new Arbol (2,3);
        
        arbol.insert(nodoDos);
        arbol.insert(nodoUno);
        arbol.insert(nodoTres);
        
        for (Nodo nodo : arbol.getArr()) {
            if(nodo!=null){
                System.out.println("Nodo padre: "+nodo);
                if(nodo.getIzquierdo()!=null){
                    
                    System.out.println("Hijo izquierdo: "+nodo.getIzquierdo());
                }
                if(nodo.getDerecho()!=null){
                    
                    System.out.println("Hijo derecho: "+nodo.getDerecho());
                }
            }
            
        }
        
        
    }
    
}
