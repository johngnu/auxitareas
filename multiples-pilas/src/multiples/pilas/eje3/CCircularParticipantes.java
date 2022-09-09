package multiples.pilas.eje3;

public class CCircularParticipantes {

    private int ini, fin, max = 50;
    private Participante[] v = new Participante[max + 1];

    CCircularParticipantes() {
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

    void adicionar(Participante elem) {
        if (!esllena()) {
            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("cola llena");
        }
    }

    Participante eliminar() {
        Participante elem = null;
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

    void llenar(int n) {
        for (int i = 0; i < n; i++) {
            Participante p = new Participante();
            p.leer();
            adicionar(p);
        }
    }

    void mostrar() {
        CCircularParticipantes aux = new CCircularParticipantes();
        while (!esvacia()) {
            Participante x = eliminar();
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    void vaciar(CCircularParticipantes w) {
        while (!w.esvacia()) {
            adicionar(w.eliminar());
        }
    }

    void llenar2() {
        adicionar(new Participante("Jorge"));
        adicionar(new Participante("Pedro"));
        adicionar(new Participante("Maria"));
        adicionar(new Participante("Lucy"));
        adicionar(new Participante("Alan"));
    }
}
