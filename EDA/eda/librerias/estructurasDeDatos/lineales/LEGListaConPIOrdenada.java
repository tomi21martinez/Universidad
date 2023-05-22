package librerias.estructurasDeDatos.lineales;

public class LEGListaConPIOrdenada<E extends Comparable<E>> extends LEGListaConPI<E>{
    
    protected NodoLEG<E> pri, ant, ult; 
    protected int talla;
    
    public LEGListaConPIOrdenada() {
        pri = new NodoLEG<E>(null);
        ult = pri; ant = pri;
        talla = 0;  
    }

    public void insertar(E e){
        
        inicio();
        
        while(!this.esFin() && this.recuperar().compareTo(e)<0){
            this.siguiente();
        }
        
        super.insertar(e);
        
    }
    
}
