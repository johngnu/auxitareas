package pilas.colas.alimentos;

/**
 *
 * @author helen castillo
 */
public class ColaS {

    private int max = 50;
    private Alimento v[] = new Alimento[max + 1];
    private int ini, fin;

    ColaS() {
        ini = fin = 0;
    }

    boolean esvacia() {
        if (ini == 0 && fin == 0) {
            return (true);
        }
        return (false);
    }

    boolean esllena() {
        if (fin == max) {
            return (true);
        }
        return (false);
    }

    int nroelem() {
        return (fin - ini);
    }

    void adicionar(Alimento elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Alimento eliminar() {
        Alimento elem = null;
        if (!esvacia()) {
            ini++;
            elem = v[ini];
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola Simple vacia");
        }
        return (elem);
    }

    void mostrar() {
        Alimento elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Lineas de la Cola ");

            ColaS aux = new ColaS();
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

    void vaciar(ColaS a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
