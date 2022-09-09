package demo1;

public class ColaCasa {

    int ini, fin;
    int max = 50;
    Casa v[];

    ColaCasa() {
        ini = fin = 0;
        v = new Casa[max];
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

    void adicionar(Casa elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Casa eliminar() {
        Casa elem = null;
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
        Casa elem = null;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("Datos de la Cola ");
            ColaCasa aux = new ColaCasa();
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
    void vaciar(ColaCasa a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
