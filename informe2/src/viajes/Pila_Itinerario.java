package viajes;

public class Pila_Itinerario {

    private int max = 40;
    private int tope;
    private Itinerario v[] = new Itinerario[max + 1];

    public Pila_Itinerario() {
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

    void adicionar(Itinerario elem) {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    Itinerario eliminar() {
        Itinerario elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void mostrar() {
        Itinerario elem = null;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila ");
            Pila_Itinerario aux = new Pila_Itinerario();
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

    void vaciar(Pila_Itinerario a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
