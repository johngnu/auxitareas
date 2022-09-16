package viajes;

public class MultiplePila_Itinerario {//vector de pilas

    private int np;  //numero de pilas
    private Pila_Itinerario v[] = new Pila_Itinerario[100];

    MultiplePila_Itinerario() {
        for (int i = 1; i < 100; i++) {
            v[i] = new Pila_Itinerario();
        }
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }

    int nroelem(int i) {
        return (v[i].nroelem());
    }

    boolean esvacia(int i) {
        if (v[i].esvacia()) {
            return true;
        }
        return false;
    }

    boolean esllena(int i) {
        if (v[i].esllena()) {
            return true;
        }
        return false;
    }

    void adicionar(int i, Itinerario L) {
        if (!v[i].esllena()) {
            v[i].adicionar(L);
        } else {
            System.out.print("Pila " + i + " esta llena");
        }
    }

    Itinerario eliminar(int i) {
        Itinerario e = null;
        if (!v[i].esvacia()) {
            e = v[i].eliminar();
        } else {
            System.out.print("Pila " + i + " esta vacia");
        }
        return e;
    }

    void mostrar(int i) {
        v[i].mostrar();
    }

    void mostrar() {
        for (int i = 1; i <= np; i++) {
            System.out.println("\n\nItinerarios Pila " + i + " ");
            v[i].mostrar();
        }
    }

    void vaciar(int i, Pila_Itinerario a) {
        while (!a.esvacia()) {
            adicionar(i, a.eliminar());
        }
    }

    void vaciar(int i, int j) {
        v[i].vaciar(v[j]);
    }
}
