package pilas.colas.restaurant;

/**
 *
 * @author helen castillo
 */
public class Principal {

    public static void main(String[] args) {
        Combo c1 = new Combo(1, "2x1 pollo", 34);
        Combo c2 = new Combo(2, "pollo entero + refresco", 94);
        Combo c3 = new Combo(3, "salchi doble", 25);

        ColaCC combos = new ColaCC();
        combos.adicionar(c1);
        combos.adicionar(c2);
        combos.adicionar(c3);
        combos.mostrar();

        Pedido p1 = new Pedido(1, 2);
        Pedido p2 = new Pedido(2, 1);
        Pedido p3 = new Pedido(2, 3);

        PilaPedido pp1 = new PilaPedido();
        pp1.adicionar(p1);
        pp1.adicionar(p3);

        PilaPedido pp2 = new PilaPedido();
        pp2.adicionar(p2);

        Comensal co1 = new Comensal("juan", pp1);
        Comensal co2 = new Comensal("ana", pp2);

        ColaSC cola = new ColaSC();
        cola.adicionar(co1);
        cola.adicionar(co2);
        cola.mostrar();
        
        //a 
        costo(cola, combos);
    }

    public static void costo(ColaSC cola, ColaCC combos) {
        Comensal elem;
        if (cola.esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\nCosto total por comensal");
            ColaSC aux = new ColaSC();
            while (!cola.esvacia()) {
                elem = cola.eliminar();
                aux.adicionar(elem);
                PilaPedido pp = elem.getPedidos();
                Pedido pelem;

                int total = 0;

                if (pp.esvacia()) {
                    System.out.println("Pila vacia");
                } else {
                    PilaPedido paux = new PilaPedido();
                    while (!pp.esvacia()) {
                        pelem = pp.eliminar();
                        paux.adicionar(pelem);
                        // combos

                        Combo celem;
                        if (combos.esvacia()) {
                            System.out.println("Cola vacia");
                        } else {
                            ColaCC caux = new ColaCC();
                            while (!combos.esvacia()) {
                                celem = combos.eliminar();
                                caux.adicionar(celem);
                                if (celem.getNroCombo() == pelem.getNroCombo()) {
                                    total += (celem.getPrecio() * pelem.getCantidad());
                                }
                            }
                            while (!caux.esvacia()) {
                                celem = caux.eliminar();
                                combos.adicionar(celem);
                            }
                        }
                    }
                    while (!paux.esvacia()) {
                        pelem = paux.eliminar();
                        pp.adicionar(pelem);
                    }
                }

                System.out.println("Comensal: " + elem.getNombreComensal() + ", total: " + total);
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                cola.adicionar(elem);
            }
        }
    }
}
