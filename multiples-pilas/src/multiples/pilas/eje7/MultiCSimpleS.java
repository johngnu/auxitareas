package multiples.pilas.eje7;

public class MultiCSimpleS {

    private int n;
    private CSimpleS c[] = new CSimpleS[12];

    MultiCSimpleS() {
        for (int i = 1; i <= 11; i++) {
            c[i] = new CSimpleS();
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    boolean esvacia(int i) {
        if (c[i].esvacia()) {
            return true;
        }
        return false;
    }

    boolean esllena(int i) {
        if (c[i].esllena()) {
            return true;
        }
        return false;
    }

    int nroElem(int i) {
        return (c[i].nroelem());
    }

    void adicionar(int i, Salida elem) {
        if (!c[i].esllena()) {
            c[i].adicionar(elem);
        } else {
            System.out.print("Cola " + i + " esta llena");
        }
    }

    Salida eliminar(int i) {
        Salida e = new Salida();
        if (!c[i].esvacia()) {
            e = c[i].eliminar();
        } else {
            System.out.print("Cola " + i + " esta vacia");
        }
        return e;
    }

    void llenar(int n) {
//    	this.n = n;
//		for (int i = 1 ; i <= n ; i++){
//		    System.out.print ("Nro. elementos Cola Simple " + i + " :");
//		    int m = Leer.datoInt();
//		    c [i].llenar(m);
//		}
    }

    void mostrar() {
        System.out.println("--------------------------");
        System.out.println("DATOS DE LA MULTIPLE COLA");
        System.out.println("--------------------------");
        for (int i = 1; i <= n; i++) {
            System.out.println("\n\nDatos Cola Simple " + i + " ");
            c[i].mostrar();
        }
    }

    void mostrar(int i) {
        c[i].mostrar();
    }

    public void vaciar(int i, CSimpleS Z) {
        c[i].vaciar(Z);
    }

    public void vaciar(int i, int j) {
        c[i].vaciar(c[j]);
    }

    public void llenar2() {
        setN(3);
        CCircularPas c1 = new CCircularPas(),
                c2 = new CCircularPas(),
                c3 = new CCircularPas(),
                c4 = new CCircularPas(),
                c5 = new CCircularPas();
        c1.adicionar(new Pasajero("111", "Juan", "ninguna"));
        c1.adicionar(new Pasajero("222", "Pedro", "ninguna"));
        c1.adicionar(new Pasajero("333", "Luca", "ninguna"));
        c1.adicionar(new Pasajero("444", "Pepe", "ninguna"));

        c2.adicionar(new Pasajero("555", "Maria", "ninguna"));
        c2.adicionar(new Pasajero("666", "Luna", "ninguna"));
        c2.adicionar(new Pasajero("777", "Lucy", "ninguna"));
        c2.adicionar(new Pasajero("888", "Jose", "ninguna"));

        c3.adicionar(new Pasajero("999", "Emy", "ninguna"));
        c3.adicionar(new Pasajero("123", "Perla", "ninguna"));
        c3.adicionar(new Pasajero("456", "Adrian", "ninguna"));
        c3.adicionar(new Pasajero("789", "Mario", "ninguna"));

        c4.adicionar(new Pasajero("987", "Emy", "ninguna"));
        c4.adicionar(new Pasajero("321", "Jose", "ninguna"));
        c4.adicionar(new Pasajero("654", "Manuel", "ninguna"));

        c5.adicionar(new Pasajero("963", "Rosa", "ninguna"));
        c5.adicionar(new Pasajero("852", "Adrian", "ninguna"));
        c5.adicionar(new Pasajero("741", "Mario", "ninguna"));

        adicionar(1, new Salida("d111", c1, new Conductor("1111", "carlos"), new Conductor("3333", "bryan")));
        adicionar(1, new Salida("d333", c2, new Conductor("2222", "pedro"), new Conductor("4444", "juan")));

        adicionar(2, new Salida("d222", c3, new Conductor("4444", "juan"), new Conductor("2222", "pedro")));
        adicionar(2, new Salida("d444", c4, new Conductor("1111", "carlos"), new Conductor("5555", "jose")));

        adicionar(3, new Salida("d111", c5, new Conductor("5555", "jose"), new Conductor("1111", "carlos")));

    }
}
