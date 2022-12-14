package listaDobleEnlace;
// @autor GAGO RAMOS EDUARDO JESÚS

public class IteradorLista {

    private Nodo actual;
    
    public IteradorLista(ListaDoble ld) {
        actual = ld.cabeza;
    }

    public Nodo siguiente() {
        Nodo a;
        a = actual;
        if (actual != null) {
            actual = actual.adelante;
        }
        return a;
    }
}
