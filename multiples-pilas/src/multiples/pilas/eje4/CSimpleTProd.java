package multiples.pilas.eje4;

public class CSimpleTProd {

    private int max = 40;
    private TipoProducto v[] = new TipoProducto[max + 1];
    private int ini, fin;

    public CSimpleTProd() {
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

    void adicionar(TipoProducto elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    TipoProducto eliminar() {
        TipoProducto elem = new TipoProducto();
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
        TipoProducto elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Datos de la Cola ");
            CSimpleTProd aux = new CSimpleTProd();
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
            TipoProducto z = new TipoProducto();
            z.leer();
            adicionar(z);
        }
    }

    void vaciar(CSimpleTProd a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

    void llenar2() {

    }
}
