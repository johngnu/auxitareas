package multiples.pilas.eje6;

public class CSimpleE {

    private int max = 40;
    private Equipo v[] = new Equipo[max + 1];
    private int ini, fin;

    public CSimpleE() {
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

    void adicionar(Equipo elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Equipo eliminar() {
        Equipo elem = new Equipo();
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
        Equipo elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Datos de la Cola ");
            CSimpleE aux = new CSimpleE();
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
            Equipo z = new Equipo();
            z.leer();
            adicionar(z);
        }
    }

    void vaciar(CSimpleE a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

    void llenar2() {
        PilaJugadores p1 = new PilaJugadores();
        PilaJugadores p2 = new PilaJugadores();
        PilaJugadores p3 = new PilaJugadores();
        PilaJugadores p4 = new PilaJugadores();
        p1.adicionar(new Jugador("Alan", "arquero"));
        p1.adicionar(new Jugador("Jorge", "defensa"));
        p1.adicionar(new Jugador("Luis", "arquero"));
        p1.adicionar(new Jugador("Pedro", "defensa"));

        p2.adicionar(new Jugador("Jorge", "arquero"));
        p2.adicionar(new Jugador("Alan", "defensa"));
        p2.adicionar(new Jugador("Luis", "delantero"));
        p2.adicionar(new Jugador("Juan", "defensa"));

        p3.adicionar(new Jugador("Marcos", "arquero"));
        p3.adicionar(new Jugador("Abraham", "defensa"));
        p3.adicionar(new Jugador("Luis", "delantero"));
        p3.adicionar(new Jugador("Jhimy", "delantero"));
        p3.adicionar(new Jugador("Elias", "arquero"));
        p3.adicionar(new Jugador("Juan", "defensa"));

        p4.adicionar(new Jugador("Miguel", "arquero"));
        p4.adicionar(new Jugador("Abraham", "defensa"));
        p4.adicionar(new Jugador("Luis", "defensa"));
        p4.adicionar(new Jugador("Jhimy", "delantero"));
        p4.adicionar(new Jugador("Lucas", "delantero"));
        p4.adicionar(new Jugador("Rolando", "defensa"));

        adicionar(new Equipo("Boca", p1));
        adicionar(new Equipo("River", p2));
        adicionar(new Equipo("Junior", p3));
        adicionar(new Equipo("Lanus", p4));
    }
}
