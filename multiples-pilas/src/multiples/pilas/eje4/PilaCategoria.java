package multiples.pilas.eje4;

public class PilaCategoria {

    private int max = 40;
    private Categoria v[] = new Categoria[max + 1];
    private int tope;

    public PilaCategoria() {
        tope = 0;
    }

    boolean esvacia() {
        if (tope == 0) {
            return (true);
        }
        return (false);
    }

    boolean esllena() {
        if (tope == max) {
            return (true);
        }
        return (false);
    }

    int nroelem() {
        return (tope);
    }

    void adicionar(Categoria elem) {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    Categoria eliminar() {
        Categoria elem = new Categoria();
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void mostrar() {
        Categoria elem;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila ");
            PilaCategoria aux = new PilaCategoria();
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
            Categoria x = new Categoria();
            x.leer();
            adicionar(x);
        }
    }

    void vaciar(PilaCategoria a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

}
