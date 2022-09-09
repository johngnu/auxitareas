package multiples.pilas.eje3;

public class CSimpleMaterias {

    private int max = 40;
    private Materia v[] = new Materia[max + 1];
    private int ini, fin;

    public CSimpleMaterias() {
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

    void adicionar(Materia elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Materia eliminar() {
        Materia elem = new Materia();
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
        Materia elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Datos de la Cola ");
            CSimpleMaterias aux = new CSimpleMaterias();
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
            Materia z = new Materia();
            z.leer();
            adicionar(z);
        }
    }

    void vaciar(CSimpleMaterias a) {
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

        PilaProyectos proy1 = new PilaProyectos();
        proy1.adicionar(new Proyecto("Diagramas", p1));
        proy1.adicionar(new Proyecto("Teoria", p2));

        adicionar(new Materia("INF-111", proy1));

        CCircularParticipantes p3 = new CCircularParticipantes();
        p3.adicionar(new Participante("Ana"));
        p3.adicionar(new Participante("Alyn"));
        p3.adicionar(new Participante("Grover"));
        p3.adicionar(new Participante("Belen"));
        PilaProyectos proy2 = new PilaProyectos();

        proy2.adicionar(new Proyecto("Algoritmos", p3));

        adicionar(new Materia("INF-143", proy2));
    }

}
