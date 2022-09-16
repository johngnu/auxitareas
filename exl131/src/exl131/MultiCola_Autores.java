package exl131;

public class MultiCola_Autores {

    private int n;
    private ColaAutores c[] = new ColaAutores[12];

    MultiCola_Autores() {
        for (int i = 1; i <= 11; i++) {
            c[i] = new ColaAutores();
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

    void adicionar(int i, Autor elem) {
        if (!c[i].esllena()) {
            c[i].adicionar(elem);
        } else {
            System.out.print("Cola " + i + " esta llena");
        }
    }

    Autor eliminar(int i) {
        Autor e = null;
        if (!c[i].esvacia()) {
            e = c[i].eliminar();
        } else {
            System.out.print("Cola " + i + " esta vacia");
        }
        return e;
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

    public void vaciar(int i, ColaAutores Z) {
        c[i].vaciar(Z);
    }

    public void vaciar(int i, int j) {
        c[i].vaciar(c[j]);
    }

}
