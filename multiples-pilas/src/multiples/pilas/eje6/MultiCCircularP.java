package multiples.pilas.eje6;

public class MultiCCircularP {

    private int n;
    private CCircularP c[] = new CCircularP[12];

    MultiCCircularP() {
        for (int i = 1; i <= 11; i++) {
            c[i] = new CCircularP();
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

    void adicionar(int i, Partido elem) {
        if (!c[i].esllena()) {
            c[i].adicionar(elem);
        } else {
            System.out.print("Cola " + i + " esta llena");
        }
    }

    Partido eliminar(int i) {
        Partido e = new Partido();
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
            System.out.println("\n\nDatos Cola Circular " + i + " ");
            c[i].mostrar();
        }
    }

    void mostrar(int i) {
        c[i].mostrar();
    }

    public void vaciar(int i, CCircularP Z) {
        c[i].vaciar(Z);
    }

    public void vaciar(int i, int j) {
        c[i].vaciar(c[j]);
    }

    public void llenar2() {
        setN(4);
        adicionar(1, new Partido("15/12/22", "Boca", "River", 4, 1));
        adicionar(1, new Partido("15/12/22", "Lanus", "Junior", 1, 2));
        adicionar(1, new Partido("15/11/22", "Boca", "Jnior", 4, 0));
        //Otra forma de adicionar
        Partido p1 = new Partido("08/08/19", "Boca", "Lanus", 3, 0);
        c[1].adicionar(p1);

        adicionar(2, new Partido("15/12/22", "River", "Boca", 0, 5));
        adicionar(2, new Partido("15/12/22", "Boca", "Lanus", 6, 1));
        adicionar(2, new Partido("15/12/22", "Junior", "River", 2, 3));

        adicionar(3, new Partido("15/12/22", "River", "Lanus", 2, 2));
        adicionar(3, new Partido("15/10/22", "Boca", "Lanus", 6, 1));
        adicionar(3, new Partido("31/05/21", "Junior", "River", 1, 3));

        adicionar(4, new Partido("15/10/19", "Boca", "River", 6, 2));
        adicionar(4, new Partido("15/11/19", "Boca", "Lanus", 4, 1));
        adicionar(4, new Partido("15/12/19", "Boca", "Junior", 3, 0));

    }
}
