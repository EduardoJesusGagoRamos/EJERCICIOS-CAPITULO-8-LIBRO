// @autor GAGO RAMOS EDUARDO JESÚS

package ListaEnteros;
// clase Nodo con las dos partes de un nodo y su constructor

public class Nodo {

    int dato;
    Nodo enlace;

    public Nodo(int x) {
        dato = x;
        enlace = null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
