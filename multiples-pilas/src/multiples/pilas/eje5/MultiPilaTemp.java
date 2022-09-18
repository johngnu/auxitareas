package multiples.pilas.eje5;

public class MultiPilaTemp {

    private int n;
    private PilaTemperaturas c[] = new PilaTemperaturas[12];

    MultiPilaTemp() {
        for (int i = 1; i <= 11; i++) {
            c[i] = new PilaTemperaturas();
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
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

    void adicionar(int i, Temperatura elem) {
        if (!c[i].esllena()) {
            c[i].adicionar(elem);
        } else {
            System.out.print("Cola " + i + " esta llena");
        }
    }

    Temperatura eliminar(int i) {
        Temperatura e = new Temperatura();
        if (!c[i].esvacia()) {
            e = c[i].eliminar();
        } else {
            System.out.print("Cola " + i + " esta vacia");
        }
        return e;
    }

    void llenar(int n) {
//    	nc = n;
//		for (int i = 1 ; i <= n ; i++){
//		    System.out.print ("Nro. elementos Cola Simple " + i + " :");
//		    int m = Leer.datoInt();
//		    c [i].llenar(m);
//		}
    }

    void mostrar() {
        System.out.println("--------------------------");
        System.out.println("DATOS DE LA MULTIPLE PILA");
        System.out.println("--------------------------");
        for (int i = 1; i <= n; i++) {
            System.out.println("\n\nDatos PILA " + i + " ");
            c[i].mostrar();
        }
    }

    void mostrar(int i) {
        c[i].mostrar();
    }

    public void vaciar(int i, PilaTemperaturas Z) {
        c[i].vaciar(Z);
    }

    public void vaciar(int i, int j) {
        c[i].vaciar(c[j]);
    }

    void llenar2() {
        setN(4);
        adicionar(1, new Temperatura("111", 23, 15, 150));
        adicionar(1, new Temperatura("222", 18, 15, 180));
        adicionar(1, new Temperatura("333", 25, 15, 350));
        adicionar(1, new Temperatura("111", 23, 25, 250));

        adicionar(2, new Temperatura("444", 18, 15, 350));
        adicionar(2, new Temperatura("333", 18, 15, 400));
        adicionar(2, new Temperatura("444", 25, 18, 350));
        adicionar(2, new Temperatura("555", 23, 25, 300));

        adicionar(3, new Temperatura("444", -3, 15, 350));
        adicionar(3, new Temperatura("222", 18, 15, 200));
        adicionar(3, new Temperatura("111", 25, 18, 300));
        adicionar(3, new Temperatura("555", 23, 25, 300));

        adicionar(4, new Temperatura("444", 21, 15, 200));
        adicionar(4, new Temperatura("111", 5, 18, 150));
        adicionar(4, new Temperatura("222", 3, 25, 100));                

    }
}
