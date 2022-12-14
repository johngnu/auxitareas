package pilas.colas.libro;

/**
 *
 * @author helen castillo
 */
public class Principal {

    public static void main(String[] args) {
        Libro l1 = new Libro("Percy Jackson", "Rick Riordan", 320);
        Libro l2 = new Libro("Harry Poter", "J.K Rowling", 90);
        Libro l3 = new Libro("Metamorfosis", "Kafka", 120);
        Libro l4 = new Libro("El Tunel", "Ernesto Sabato", 95);

        Libro l5 = new Libro("aaa", "bbbb", 20);
        //Libro l6 = new Libro("bbb", "ssss", 20);

        PilaLibro pila = new PilaLibro();
        pila.adicionar(l1);
        pila.adicionar(l2);
        pila.adicionar(l3);
        pila.adicionar(l4);
        pila.adicionar(l5);

        pila.mostrar();

        // a
        System.out.println("\neliminar k=5");
        eliminar_k(pila, 5);
        pila.mostrar();

        // b
        System.out.println("\ninsertar nuevos despues de paginas < 100");
        insertar(pila);
        pila.mostrar();
        
        // c
        System.out.println("\nverificar autor yyy");
        verificar(pila, "yyy");
        
    }

    public static void eliminar_k(PilaLibro pila, int k) {
        Libro elem;
        if (pila.esvacia()) {
            System.out.println("Pila vacia");
        } else {
            PilaLibro aux = new PilaLibro();
            while (!pila.esvacia()) {
                elem = pila.eliminar();
                aux.adicionar(elem);
            }
            int c = 1;
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                if (c != k) {
                    pila.adicionar(elem);
                }
                c++;
            }
        }
    }

    public static void insertar(PilaLibro pila) {
        Libro elem;
        if (pila.esvacia()) {
            System.out.println("Pila vacia");
        } else {
            PilaLibro aux = new PilaLibro();
            while (!pila.esvacia()) {
                elem = pila.eliminar();
                aux.adicionar(elem);
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                pila.adicionar(elem);
                if (elem.getNroPaginas() < 100) {
                    pila.adicionar(new Libro("xxx", "yyy", 0));
                }
            }
        }
    }

    public static void verificar(PilaLibro pila, String autor) {
        Libro elem;
        int c = 0;
        if (pila.esvacia()) {
            System.out.println("Pila vacia");
        } else {
            PilaLibro aux = new PilaLibro();
            while (!pila.esvacia()) {
                elem = pila.eliminar();
                aux.adicionar(elem);
                if (elem.getAutor().equals(autor)) {
                    c++;
                }
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                pila.adicionar(elem);
            }
        }
        if (c > 1) {
            System.out.println("SI existe mas de un libre del autor: " + autor);
        } else {
            System.out.println("NO existe mas de un libre del autor: " + autor);
        }
    }
}
