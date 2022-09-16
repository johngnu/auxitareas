package libro;

/**
 *
 * @author helen castillo
 */
public class Principal {

    public static void main(String[] args) {
        Libro l1 = new Libro("t1", "a1", 30);
        Libro l2 = new Libro("t2", "a2", 49);
        Libro l3 = new Libro("t3", "a1", 112);
        Libro l4 = new Libro("t4", "a3", 34);

        Libro l5 = new Libro("t5", "a1", 180);
        Libro l6 = new Libro("t6", "a3", 134);

        ColaS_Libro c1 = new ColaS_Libro();
        c1.adicionar(l1);
        c1.adicionar(l2);
        c1.adicionar(l3);
        c1.adicionar(l4);

        ColaS_Libro c2 = new ColaS_Libro();
        c2.adicionar(l5);
        c2.adicionar(l6);

        Pila_ColaLibro p = new Pila_ColaLibro();
        p.adicionar(c1);
        p.adicionar(c2);

        p.mostrar();
        // a
        solucionA(p, "a3");
        
        // b
        solucionB(p);
        
        // c
        solucionC("a2",  l1);
    }

    public static void solucionA(Pila_ColaLibro pcl, String x) {
        ColaS_Libro elem = null;
        if (pcl.esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("A. Libros escriopts por: " + x);
            Pila_ColaLibro aux = new Pila_ColaLibro();
            while (!pcl.esvacia()) {
                elem = pcl.eliminar();
                aux.adicionar(elem);
                Libro celem = null;
                if (elem.esvacia()) {
                    System.out.println("Cola vacia");
                } else {
                    ColaS_Libro caux = new ColaS_Libro();
                    while (!elem.esvacia()) {
                        celem = elem.eliminar();
                        caux.adicionar(celem);
                        if (x.equals(celem.getAutor())) {
                            System.out.println(celem.getTitulo());
                        }
                    }
                    elem.vaciar(caux);                    
                }
            }
            pcl.vaciar(aux);
        }
    }

    public static void solucionB(Pila_ColaLibro pcl) {
        System.out.println();
        ColaS_Libro elem = null;
        if (pcl.esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("B. Libros con no pags multiplo de 7:");
            Pila_ColaLibro aux = new Pila_ColaLibro();
            while (!pcl.esvacia()) {
                elem = pcl.eliminar();
                aux.adicionar(elem);
                Libro celem = null;
                if (elem.esvacia()) {
                    System.out.println("Cola vacia");
                } else {
                    ColaS_Libro caux = new ColaS_Libro();
                    while (!elem.esvacia()) {
                        celem = elem.eliminar();
                        caux.adicionar(celem);
                        if (celem.getNro_pagians() % 7 == 0) {
                            celem.mostrar();
                        }
                    }
                    //elem.vaciar(caux);                    
                }
            }
            pcl.vaciar(aux);
        }
    }

    public static void solucionC(String x, Libro y) {
        System.out.println();
        System.out.println("C. el libro:");
        y.mostrar();
        if(y.getAutor().equals(x)) {            
            System.out.println("fue escrito por: " + x);
        } else {
            System.out.println("No fue escrito por: " + x);
        }
    }

}
