package tarea;

public class PilaZ {

    private int max = 100;
    private Zona v[] = new Zona[max + 1];
    private int tope;

    PilaZ() {
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

    void adicionar(Zona elem) {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    Zona eliminar() {
        Zona elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void mostrar() {
        Zona elem;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila ");
            PilaZ aux = new PilaZ();
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

    void vaciar(PilaZ a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }

    }
}
