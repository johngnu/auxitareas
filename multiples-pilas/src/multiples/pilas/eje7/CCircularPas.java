package multiples.pilas.eje7;

public class CCircularPas {

    private int max = 50;
    private Pasajero v[] = new Pasajero[max + 1];
    private int ini, fin;

    CCircularPas() {
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

    void adicionar(Pasajero elem) {
        if (!esllena()) {

            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("Cola circular llena");
        }
    }

    Pasajero eliminar() {
        Pasajero elem = new Pasajero();
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
        Pasajero elem;
        if (esvacia()) {
            System.out.println("Cola vacia xxx");
        } else {
            System.out.println("\n Datos de la Cola de pasajeros");
            CCircularPas aux = new CCircularPas();
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
            Pasajero elem = new Pasajero();
            elem.leer();
            adicionar(elem);
        }
    }

    void vaciar(CCircularPas a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }

    }
}
