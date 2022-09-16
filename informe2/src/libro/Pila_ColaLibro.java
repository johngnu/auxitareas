package libro;

public class Pila_ColaLibro {

    private int max = 100;
    private ColaS_Libro v[] = new ColaS_Libro[max + 1];
    private int tope;

    Pila_ColaLibro() {
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

    void adicionar(ColaS_Libro elem) {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    ColaS_Libro eliminar() {
        ColaS_Libro elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void mostrar() {
        ColaS_Libro elem = null;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila ");
            Pila_ColaLibro aux = new Pila_ColaLibro();
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

    void vaciar(Pila_ColaLibro a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
