
package arbolbinario;

public class Nodo {
    int dato;
    String nombre;
    Nodo hijoIzquierdo, hijoDerecho;
    
    public Nodo(int d, String nom){
        this.dato=d;
        this.nombre=nom;
        this.hijoIzquierdo=null;
        this.hijoDerecho=null;
        
    }
    public String toString(){
        return nombre + "el numero es: "+dato;
    }
    public void preOrden(Nodo localNode) {

        if(localNode != null) {
            System.out.println(localNode.val);
            preOrden(localNode.hijoIzquierdo);
            preOrden(localNode.hijoDerecho); 
        }   
    }


    public void postOrden(Nodo r){
        if (r!=null){
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho);
            System.out.println(r.dato);
        }
    }       
    public Nodo buscarNodo(int d){
        Nodo aux=raiz;
        while (aux.dato!=d){
            if (d<aux.dato){    
                aux=aux.hijoIzquierdo;
            }else{
                aux=aux.hijoDerecho;
            }
            if (aux==null){
                return null;
            }
        }
        return aux;
    }           
}
