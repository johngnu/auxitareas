package pilas.colas.alimentos;

/**
 *
 * @author helen castillo
 */
public class Principal {

    public static void main(String[] args) {
        Alimento a1 = new Alimento("leche", 6);
        Alimento a2 = new Alimento("avena", 25);
        Alimento a3 = new Alimento("cafe", 20);
        Alimento a4 = new Alimento("galletas", 25);
        Alimento a5 = new Alimento("arroz", 160);

        ColaS cola = new ColaS();
        cola.adicionar(a1);
        cola.adicionar(a2);
        cola.adicionar(a3);
        cola.adicionar(a4);
        cola.adicionar(a5);

        cola.mostrar();

        // a
        //ordenar_a(cola);
        //cola.mostrar();
        // b
        //ordenar_d(cola);
        //cola.mostrar();
        // c
        mayor_precio(cola);
    }

    public static void ordenar_a(ColaS cola) {
        Alimento elem;
        ColaS o = new ColaS();
        int n = cola.nroelem();
        if (cola.esvacia()) {
            System.out.println("Cola vacia");
        } else {
            for (int i = 0; i < n; i++) {
                ColaS aux = new ColaS();
                Alimento m = cola.eliminar();// new Alimento("", 0);
                aux.adicionar(m);
                while (!cola.esvacia()) {
                    elem = cola.eliminar();
                    aux.adicionar(elem);
                    if (elem.getPrecio() < m.getPrecio()) {
                        m = elem;
                    }
                }

                o.adicionar(m);
                while (!aux.esvacia()) {
                    elem = aux.eliminar();
                    if (!m.getNombre().equals(elem.getNombre())) {
                        cola.adicionar(elem);
                    }
                }
            }

            while (!o.esvacia()) {
                elem = o.eliminar();
                cola.adicionar(elem);
            }
        }
    }

    public static void ordenar_d(ColaS cola) {
        Alimento elem;
        ColaS o = new ColaS();
        int n = cola.nroelem();
        if (cola.esvacia()) {
            System.out.println("Cola vacia");
        } else {
            for (int i = 0; i < n; i++) {
                ColaS aux = new ColaS();
                Alimento m = new Alimento("", 0);
                while (!cola.esvacia()) {
                    elem = cola.eliminar();
                    aux.adicionar(elem);
                    if (m.getPrecio() < elem.getPrecio()) {
                        m = elem;
                    }
                }

                o.adicionar(m);
                while (!aux.esvacia()) {
                    elem = aux.eliminar();
                    if (!m.getNombre().equals(elem.getNombre())) {
                        cola.adicionar(elem);
                    }
                }
            }

            while (!o.esvacia()) {
                elem = o.eliminar();
                cola.adicionar(elem);
            }
        }
    }

    public static void mayor_precio(ColaS cola) {
        Alimento elem;
        ColaS o = new ColaS();
        int n = cola.nroelem();
        int p = 0;
        if (cola.esvacia()) {
            System.out.println("Cola vacia");
        } else {
            for (int i = 0; i < n; i++) {
                ColaS aux = new ColaS();
                Alimento m = new Alimento("", 0);
                while (!cola.esvacia()) {
                    elem = cola.eliminar();
                    aux.adicionar(elem);
                    if (m.getPrecio() < elem.getPrecio()) {
                        m = elem;
                    }
                }
                if (i == 0) {
                    p = m.getPrecio();
                }
                o.adicionar(m);
                while (!aux.esvacia()) {
                    elem = aux.eliminar();
                    if (!m.getNombre().equals(elem.getNombre())) {
                        cola.adicionar(elem);
                    }
                }
            }
            System.out.println("\nAlimentos con el mayor precio: ");
            while (!o.esvacia()) {
                elem = o.eliminar();
                cola.adicionar(elem);
                if (elem.getPrecio() == p) {
                    elem.mostrar();
                }
            }
        }
    }

}
