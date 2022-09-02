package tarea;

public class ColaIES {

    private int max = 20;
    private IEducSup v[] = new IEducSup[max + 1];
    private int ini, fin;

    ColaIES() {
        ini = fin = 0;
    }

    int nroelem() {
        return ((max + fin - ini) % max);
    }

    boolean esvacia() {
        if (nroelem() == 0) {
            return (true);
        }
        return (false);
    }

    boolean esllena() {
        if (nroelem() == max - 1) {
            return (true);
        }
        return (false);
    }

    void adicionar(IEducSup elem) {
        if (!esllena()) {

            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("Cola circular llena");
        }
    }

    IEducSup eliminar() {
        IEducSup elem = null;
        if (!esvacia()) {
            ini = (ini + 1) % max;
            elem = v[ini];
            if (nroelem() == 0) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola circular vacia");
        }
        return (elem);
    }

    void mostrar() {
        IEducSup elem;
        if (esvacia()) {
            System.out.println("Cola vacia xxx");
        } else {
            System.out.println("\n Datos de la Cola ");
            ColaIES aux = new ColaIES();
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

    void vaciar(ColaIES a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }

    }

}
