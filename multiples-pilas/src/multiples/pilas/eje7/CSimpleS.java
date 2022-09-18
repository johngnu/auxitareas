package multiples.pilas.eje7;

public class CSimpleS {

    private int max = 40;
    private Salida v[] = new Salida[max + 1];
    private int ini, fin;

    public CSimpleS() {
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

    void adicionar(Salida elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Salida eliminar() {
        Salida elem = new Salida();
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
        Salida elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Datos de la Cola ");
            CSimpleS aux = new CSimpleS();
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

        for (int i = 1; i <= n; i++) {
            Salida z = new Salida();
            z.leer();
            adicionar(z);
        }
    }

    void vaciar(CSimpleS a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
