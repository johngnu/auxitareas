package pilas.colas.restaurant;

/**
 *
 * @author desktop
 */
public class ColaCC {

    private int max = 100;
    private Combo v[] = new Combo[max + 1];
    private int ini, fin;

    ColaCC() {
        ini = fin = 0;
    }

    int nroelem() {
        return ((max + fin - ini) % max);
    }

    boolean esvacia() {
        if (nroelem() == 0) {
            return (true);
        }
        return (false);
    }

    boolean esllena() {
        if (nroelem() == max - 1) {
            return (true);
        }
        return (false);
    }

    void adicionar(Combo elem) {
        if (!esllena()) {

            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("Cola circular llena");
        }
    }

    Combo eliminar() {
        Combo elem = null;
        if (!esvacia()) {
            ini = (ini + 1) % max;
            elem = v[ini];
            if (nroelem() == 0) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola circular vacia");
        }
        return (elem);
    }

    void mostrar() {
        Combo elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Combos de la Cola ");
            ColaCC aux = new ColaCC();
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

    void vaciar(ColaCC a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
