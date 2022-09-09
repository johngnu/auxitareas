package multiples.pilas.eje3;

public class PilaProyectos {

    private int max = 40;
    private Proyecto v[] = new Proyecto[max + 1];
    private int tope;

    public PilaProyectos() {
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

    void adicionar(Proyecto elem) {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    Proyecto eliminar() {
        Proyecto elem = new Proyecto();
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void mostrar() {
        Proyecto elem;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila ");
            PilaProyectos aux = new PilaProyectos();
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
            Proyecto x = new Proyecto();
            x.leer();
            adicionar(x);
        }
    }

    void vaciar(PilaProyectos a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

    void llenar2() {
        CCircularParticipantes p1 = new CCircularParticipantes();
        p1.adicionar(new Participante("Jorge"));
        p1.adicionar(new Participante("Pedro"));
        p1.adicionar(new Participante("Maria"));
        p1.adicionar(new Participante("Lucy"));
        p1.adicionar(new Participante("Alan"));

        CCircularParticipantes p2 = new CCircularParticipantes();
        p2.adicionar(new Participante("Lucas"));
        p2.adicionar(new Participante("Jose"));
        p2.adicionar(new Participante("Maria"));

        CCircularParticipantes p3 = new CCircularParticipantes();
        p3.adicionar(new Participante("Ana"));
        p3.adicionar(new Participante("Alyn"));
        p3.adicionar(new Participante("Grover"));
        p3.adicionar(new Participante("Belen"));

        adicionar(new Proyecto("Represa", p1));
        adicionar(new Proyecto("Logistica", p2));
        adicionar(new Proyecto("Algoritmos", p3));
    }

}
