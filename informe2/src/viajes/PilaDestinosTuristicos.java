package viajes;

public class PilaDestinosTuristicos {
    private int max = 50;
    private Pila_plan v[] = new Pila_plan[max + 1];
    private int tope;

    public PilaDestinosTuristicos() {
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

    public void adicionar(Pila_plan elem) //push
    {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    public Pila_plan eliminar() //pop
    {
        Pila_plan elem = new Pila_plan();
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    public void mostrar() {
        Pila_plan elem;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("ELEMENTOS DE LA PILA");
            PilaDestinosTuristicos aux = new PilaDestinosTuristicos();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();
            }
            vaciar(aux);
        }
    }

    
    public void vaciar(PilaDestinosTuristicos a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

    public int nroElem() {
        return tope;
    }
}
