package hospital;

public class ColaCMedicamentos {

    private int ini, fin, max = 50;
    private Medicamento[] v = new Medicamento[max + 1];

    ColaCMedicamentos() {
        ini = fin = 0;
    }

    int nroelem() {
        return (max + fin - ini) % max;
    }

    boolean esvacia() {
        return nroelem() == 0;
    }

    boolean esllena() {
        return (max - 1) == nroelem();
    }

    void adicionar(Medicamento elem) {
        if (!esllena()) {
            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("cola llena");
        }
    }

    Medicamento eliminar() {
        Medicamento elem = null;
        if (!esvacia()) {
            ini = (ini + 1) % max;
            elem = v[ini];
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("cola vacia");
        }
        return elem;
    }

    void mostrar() {
        ColaCMedicamentos aux = new ColaCMedicamentos();
        while (!esvacia()) {
            Medicamento x = eliminar();
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    void vaciar(ColaCMedicamentos w) {
        while (!w.esvacia()) {
            adicionar(w.eliminar());
        }
    }

}
