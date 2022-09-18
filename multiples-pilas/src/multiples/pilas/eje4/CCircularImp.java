package multiples.pilas.eje4;

public class CCircularImp {

    private int max = 50;
    private Importacion v[] = new Importacion[max + 1];
    private int ini, fin;

    CCircularImp() {
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

    void adicionar(Importacion elem) {
        if (!esllena()) {

            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("Cola circular llena");
        }
    }

    Importacion eliminar() {
        Importacion elem = new Importacion();
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
        Importacion elem;
        if (esvacia()) {
            System.out.println("Cola vacia xxx");
        } else {
            System.out.println("\n Datos de la Cola de Importaciones ");
            CCircularImp aux = new CCircularImp();
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
            Importacion elem = new Importacion();
            elem.leer();
            adicionar(elem);
        }
    }

    void vaciar(CCircularImp a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }

    }

}
