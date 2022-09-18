package multiples.pilas.eje5;

public class CSimpleZ {

    private int max = 40;
    private Zona v[] = new Zona[max + 1];
    private int ini, fin;

    public CSimpleZ() {
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

    void adicionar(Zona elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Zona eliminar() {
        Zona elem = new Zona();
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
        Zona elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Datos de la Cola ");
            CSimpleZ aux = new CSimpleZ();
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
            Zona z = new Zona();
            z.leer();
            adicionar(z);
        }
    }

    void vaciar(CSimpleZ a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

    void llenar2() {
        adicionar(new Zona("111", "Portada"));
        adicionar(new Zona("222", "Lomas"));
        adicionar(new Zona("333", "Rio Seco"));
        adicionar(new Zona("444", "Garita"));
        adicionar(new Zona("555", "San Pedro"));
    }
}
