package exl131;

public class ColaAutores {

    private int max = 40;
    private Autor v[] = new Autor[max + 1];
    private int ini, fin;

    public ColaAutores() {
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

    void adicionar(Autor elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Autor eliminar() {
        Autor elem = null;
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
        Autor elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Datos de la Cola ");
            ColaAutores aux = new ColaAutores();
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

    void vaciar(ColaAutores a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
