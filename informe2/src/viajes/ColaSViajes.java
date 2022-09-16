package viajes;

public class ColaSViajes {

    int ini, fin;
    int max = 50;
    Viaje v[];

    ColaSViajes() {
        ini = fin = 0;
        v = new Viaje[max];
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

    void adicionar(Viaje elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Viaje eliminar() {
        Viaje elem = null;
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
        Viaje elem = null;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("Datos de la Cola ");
            ColaSViajes aux = new ColaSViajes();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();
            }
            System.out.println("");
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                adicionar(elem);
            }
        }
    }

    void vaciar(ColaSViajes a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
