
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

        Nodo nodo1= new Nodo(10);
        Nodo nodo2= new Nodo(20);
        Nodo nodo3= new Nodo(30);
        Nodo nodo4= new Nodo(40);
        Nodo nodo5= new Nodo(50);
        Nodo nodo6= new Nodo(15);
        Nodo nodo7= new Nodo(25);
        
        Arbol arbol = new Arbol (2,5);
        
        arbol.insert(nodo3);
        arbol.insert(nodo2);
        arbol.insert(nodo1);
        arbol.insert(nodo4);
        arbol.insert(nodo5);
        arbol.insert(nodo6);
        arbol.insert(nodo7);
        
        arbol.inOrden();
        //arbol.preOrden();
        
        
        System.out.println("Raiz :"+ arbol.getRaiz());
        
        
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
