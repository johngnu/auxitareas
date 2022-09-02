package ejerviernes;

/**
 *
 * @author desktop
 */
public class ColaSZ {

    int ini, fin;
    int max = 50;
    Zona v[];

    ColaSZ() {
        ini = fin = 0;
        v = new Zona[max];
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

    void adicionar(Zona elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Zona eliminar() {
        Zona elem = null;
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
        Zona elem = null;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("Datos de la Cola ");
            ColaSZ aux = new ColaSZ();
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


    /* void llenar (int n)
    {
        
        String x = " ";
	for (int i = 1 ; i <= n ; i++)
        {
            System.out.println("introdusca el "+i+" elemento");
            x = ls.nextLine();
	    adicionar (x);
    
        }
    }*/
    void vaciar(ColaSZ a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }

    }
}
