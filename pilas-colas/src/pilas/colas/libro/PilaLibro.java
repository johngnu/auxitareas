package pilas.colas.libro;

/**
 *
 * @author helen castillo
 */
public class PilaLibro {

    private int max = 100;
    private Libro v[] = new Libro[max + 1];
    private int tope;

    PilaLibro() {
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

    void adicionar(Libro elem) {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    Libro eliminar() {
        Libro elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void mostrar() {
        Libro elem;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila ");
            PilaLibro aux = new PilaLibro();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrarLibro();
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                adicionar(elem);
            }
        }
    }

    void vaciar(PilaLibro a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

}
