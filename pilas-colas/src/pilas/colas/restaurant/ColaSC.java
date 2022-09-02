package pilas.colas.restaurant;

/**
 *
 * @author helen castillo
 */
public class ColaSC {

    private int max = 50;
    private Comensal v[] = new Comensal[max + 1];
    private int ini, fin;

    ColaSC() {
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

    void adicionar(Comensal elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Comensal eliminar() {
        Comensal elem = null;
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
        Comensal elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Comensales de la Cola ");

            ColaSC aux = new ColaSC();
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

    void vaciar(ColaSC a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

}
