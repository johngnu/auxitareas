package multiples.pilas.eje6;

public class CCircularP {

    private int max = 50;
    private Partido v[] = new Partido[max + 1];
    private int ini, fin;

    CCircularP() {
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

    void adicionar(Partido elem) {
        if (!esllena()) {

            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("Cola circular llena");
        }
    }

    Partido eliminar() {
        Partido elem = new Partido();
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
        Partido elem;
        if (esvacia()) {
            System.out.println("Cola vacia xxx");
        } else {
            System.out.println("\n Datos de la Cola circular");
            CCircularP aux = new CCircularP();
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
            Partido elem = new Partido();
            elem.leer();
            adicionar(elem);
        }
    }

    void vaciar(CCircularP a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }

    }
}
