package multiples.pilas.eje1;

public class Pila_PilaLetra {

    private int max = 50;
    private PilaLetra v[] = new PilaLetra[max + 1];
    private int tope;

    public Pila_PilaLetra() {
        tope = 0;
    }

    public boolean esvacia()//empty
    {
        if (tope == 0) {
            return (true);
        }
        return (false);
    }

    public boolean esllena() {
        if (tope == max) {
            return (true);
        }
        return (false);
    }

    public int nroelem() //size
    {
        return (tope);
    }

    public void adicionar(PilaLetra elem) //push
    {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    public PilaLetra eliminar() //pop
    {
        PilaLetra elem = new PilaLetra();
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    public void mostrar() {
        PilaLetra elem;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("ELEMENTOS DE LA PILA");
            Pila_PilaLetra aux = new Pila_PilaLetra();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();
            }
            vaciar(aux);
        }
    }

    public void llenar(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            PilaLetra l = new PilaLetra();
            l.leer();
            adicionar(l);
        }
    }

    public void vaciar(Pila_PilaLetra a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

    public int nroElem() {
        return tope;
    }

    public void llenar2() {

        PilaLetra d1 = new PilaLetra();
        d1.adicionar("H");
        d1.adicionar("O");
        d1.adicionar("L");
        d1.adicionar("A");
        adicionar(d1);
        PilaLetra d2 = new PilaLetra();
        d2.adicionar("D");
        d2.adicionar("O");
        d2.adicionar("N");
        d2.adicionar("D");
        d2.adicionar("E");
        adicionar(d2);
        PilaLetra d3 = new PilaLetra();
        d3.adicionar("U");
        d3.adicionar("N");
        d3.adicionar("A");
        adicionar(d3);
        PilaLetra d4 = new PilaLetra();
        d4.adicionar("R");
        d4.adicionar("O");
        d4.adicionar("C");
        d4.adicionar("A");
        adicionar(d4);
        PilaLetra d5 = new PilaLetra();
        d5.adicionar("O");
        d5.adicionar("r");
        d5.adicionar("U");
        d5.adicionar("r");
        d5.adicionar("O");
        adicionar(d5);
    }

}
