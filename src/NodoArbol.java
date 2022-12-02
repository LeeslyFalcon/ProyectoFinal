/**
 *
 * @author netosolis.com
 */
public class NodoArbol {
    private int dato;
    private NodoArbol izq,der;
    public NodoArbol(int dato){
        this.dato = dato;
        izq = null;
        der = null;
    }

    public int getDato() {
        return dato;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    } 
}
