package multiples.pilas.eje2;

public class MultiPilaLetra {

    private int nc;
    private PilaLetra c[] = new PilaLetra[40];

    public MultiPilaLetra() {
        for (int i = 1; i <= 11; i++) {
            c[i] = new PilaLetra();
        }
    }

    public int getNc() {
        return nc;
    }

    public void setNc(int nc) {
        this.nc = nc;
    }

    boolean esvacia(int i) {
        if (c[i].esvacia()) {
            return true;
        }
        return false;
    }

    boolean esllena(int i) {
        if (c[i].esllena()) {
            return true;
        }
        return false;
    }

    int nroElem(int i) {
        return (c[i].nroelem());
    }

    void adicionar(int i, String elem) {
        if (!c[i].esllena()) {
            c[i].adicionar(elem);
        } else {
            System.out.print("Pila" + i + " esta llena");
        }
    }

    String eliminar(int i) {
        String e = "";
        if (!c[i].esvacia()) {
            e = c[i].eliminar();
        } else {
            System.out.print("Pila " + i + " esta vacia");
        }
        return e;
    }

    void llenar(int n) {
        setNc(n);

        int i, m;
        nc = n;
        for (i = 1; i <= n; i++) {
            System.out.print("Nro. elementos Pila " + i + " :");
            m = Leer.datoInt();
            c[i].llenar(m);
        }
    }

    void llenar2() {
        setNc(5);
        c[1].adicionar("H");
        c[1].adicionar("O");
        c[1].adicionar("L");
        c[1].adicionar("A");

        c[2].adicionar("D");
        c[2].adicionar("O");
        c[2].adicionar("N");
        c[2].adicionar("D");
        c[2].adicionar("E");

        c[3].adicionar("U");
        c[3].adicionar("N");
        c[3].adicionar("A");

        c[4].adicionar("R");
        c[4].adicionar("O");
        c[4].adicionar("C");
        c[4].adicionar("A");

        c[5].adicionar("O");
        c[5].adicionar("r");
        c[5].adicionar("U");
        c[5].adicionar("r");
        c[5].adicionar("O");
    }

    void mostrar() {
        int i;
        System.out.println("--------------------------");
        System.out.println("DATOS DE LA MULTIPLE PILA");
        System.out.println("--------------------------");
        for (i = 1; i <= nc; i++) {
            System.out.println("\nDatos Pila " + i + " ");
            c[i].mostrar();
        }
    }

    void mostrar(int i) {
        c[i].mostrar();
    }

    public void vaciar(int i, PilaLetra Z) {
        c[i].vaciar(Z);
    }

    public void vaciar(int i, int j) {
        c[i].vaciar(c[j]);
    }

}
