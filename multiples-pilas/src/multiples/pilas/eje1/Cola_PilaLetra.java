package multiples.pilas.eje1;

public class Cola_PilaLetra {

    private int max = 40;
    private PilaLetra v[] = new PilaLetra[max + 1];
    private int ini, fin;

    public Cola_PilaLetra() {
        // TODO Auto-generated constructor stub
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

    void adicionar(PilaLetra elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena Atencion");
        }
    }

    PilaLetra eliminar() {
        PilaLetra elem = new PilaLetra();
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
        PilaLetra elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Datos de la Cola ");
            Cola_PilaLetra aux = new Cola_PilaLetra();
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
            PilaLetra z = new PilaLetra();
            z.leer();
            adicionar(z);
        }
    }

    void llenar2() {

        PilaLetra d1 = new PilaLetra();
        d1.adicionar("H");
        d1.adicionar("O");
        d1.adicionar("L");
        d1.adicionar("A");
        adicionar(d1);
        PilaLetra d2 = new PilaLetra();
        d2.adicionar("D");
        d2.adicionar("O");
        d2.adicionar("N");
        d2.adicionar("D");
        d2.adicionar("E");
        adicionar(d2);
        PilaLetra d3 = new PilaLetra();
        d3.adicionar("U");
        d3.adicionar("N");
        d3.adicionar("A");
        adicionar(d3);
        PilaLetra d4 = new PilaLetra();
        d4.adicionar("R");
        d4.adicionar("O");
        d4.adicionar("C");
        d4.adicionar("A");
        adicionar(d4);
    }

    void vaciar(Cola_PilaLetra a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
