package multiples.pilas.eje7;

public class PilaDestino {

    private int max = 40;
    private Destino v[] = new Destino[max + 1];
    private int tope;

    public PilaDestino() {
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

    void adicionar(Destino elem) {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    Destino eliminar() {
        Destino elem = new Destino();
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void mostrar() {
        Destino elem;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila ");
            PilaDestino aux = new PilaDestino();
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
            Destino x = new Destino();
            x.leer();
            adicionar(x);
        }
    }

    void vaciar(PilaDestino a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

    void llenar2() {
        adicionar(new Destino("d111", "11/02/22", "22:00", "La Paz", 350));
        adicionar(new Destino("d222", "13/04/22", "15:00", "Oruro", 500));
        adicionar(new Destino("d333", "11/05/19", "18:00", "Coroico", 200));
        adicionar(new Destino("d444", "16/08/22", "15:00", "Cobija", 900));
        adicionar(new Destino("d555", "19/02/18", "19:00", "Iquique", 400));
    }
}
