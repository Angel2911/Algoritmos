
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
            
}
