package libro;

public class ColaS_Libro {

    int ini, fin;
    int max = 50;
    Libro v[];

    ColaS_Libro() {
        ini = fin = 0;
        v = new Libro[max];
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

    void adicionar(Libro elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Libro eliminar() {
        Libro elem = null;
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
        Libro elem = null;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("Datos de la Cola ");
            ColaS_Libro aux = new ColaS_Libro();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();
            }
            System.out.println("");
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                adicionar(elem);
            }
        }
    }

    void vaciar(ColaS_Libro a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
