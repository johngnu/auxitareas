package multiples.pilas.eje6;

public class PilaJugadores {

    private int max = 40;
    private Jugador v[] = new Jugador[max + 1];
    private int tope;

    public PilaJugadores() {
        tope = 0;
    }

    boolean esvacia() {
        if (tope == 0) {
            return (true);
        }
        return (false);
    }

    boolean esllena() {
        if (tope == max) {
            return (true);
        }
        return (false);
    }

    int nroelem() {
        return (tope);
    }

    void adicionar(Jugador elem) {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    Jugador eliminar() {
        Jugador elem = new Jugador();
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void mostrar() {
        Jugador elem;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila ");
            PilaJugadores aux = new PilaJugadores();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                adicionar(elem);
            }
        }
    }

    void llenar(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            Jugador x = new Jugador();
            x.leer();
            adicionar(x);
        }
    }

    void vaciar(PilaJugadores a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

}
