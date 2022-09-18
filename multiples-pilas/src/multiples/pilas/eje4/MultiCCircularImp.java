package multiples.pilas.eje4;

public class MultiCCircularImp {

    private int n;
    private CCircularImp c[] = new CCircularImp[12];

    MultiCCircularImp() {
        for (int i = 1; i <= 11; i++) {
            c[i] = new CCircularImp();
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

    void adicionar(int i, Importacion elem) {
        if (!c[i].esllena()) {
            c[i].adicionar(elem);
        } else {
            System.out.print("Cola " + i + " esta llena");
        }
    }

    Importacion eliminar(int i) {
        Importacion e = new Importacion();
        if (!c[i].esvacia()) {
            e = c[i].eliminar();
        } else {
            System.out.print("Cola " + i + " esta vacia");
        }
        return e;
    }

    void llenar2() {

    }

//    void llenar (int n){
//    	
//    	setNc(n);
//    	CCircularC cc1 = new CCircularC();
//    	cc1.adicionar(new Contenedor("Amarillo", "Alarcon", 300));
//    	cc1.adicionar(new Contenedor("Azul", "Belzu", 300));
//    	cc1.adicionar(new Contenedor("Amarillo", "AV.02", 300));
//    	CCircularC cc2 = new CCircularC();
//    	cc2.adicionar(new Contenedor("Amarillo", "Alarcon", 300));
//    	cc2.adicionar(new Contenedor("Azul", "Belzu", 200));
//    	
//    	CCircularC cc3 = new CCircularC();
//    	cc3.adicionar(new Contenedor("Azul", "Belzu", 300));
//    	cc3.adicionar(new Contenedor("Azul", "San Luis", 200));
//    	CCircularC cc4 = new CCircularC();
//    	cc4.adicionar(new Contenedor("Azul", "Buenos Aires", 300));
//    	
//    	CCircularC cc5 = new CCircularC();
//    	cc5.adicionar(new Contenedor("Azul", "Andreu", 200));
//    	cc5.adicionar(new Contenedor("Amarillo", "AV.01", 300));
//    	cc5.adicionar(new Contenedor("Amarillo", "AV.01", 300));
//    	CCircularC cc6 = new CCircularC();
//    	cc6.adicionar(new Contenedor("Azul", "Andreu", 200));
//    	cc6.adicionar(new Contenedor("Amarillo", "AV.01", 300));
//    	
//    	CCircularC cc7 = new CCircularC();
//    	cc7.adicionar(new Contenedor("Amarillo", "San Luis", 200));
//    	cc7.adicionar(new Contenedor("Amarillo", "Andreu", 300));
//    	cc7.adicionar(new Contenedor("Amarillo", "Avaroa", 300));
//    	CCircularC cc8 = new CCircularC();
//    	cc8.adicionar(new Contenedor("Azul", "Belzu", 300));
//    	CCircularC cc9 = new CCircularC();
//    	cc9.adicionar(new Contenedor("Azul", "Belzu", 300));
//    	
//    	
//    	c[1].adicionar(new Importacion("San Jorge", cc1));
//    	c[1].adicionar(new Importacion("Santa Barbara",cc2));
//    	
//    	c[2].adicionar(new Importacion("Villa Victoria", cc3));
//    	c[2].adicionar(new Importacion("El Tejar", cc4));
//    	
//    	c[3].adicionar(new Importacion("Obrajes", cc5));
//    	c[3].adicionar(new Importacion("San Miguel", cc6));
//    	
//    	c[4].adicionar(new Importacion("Tembladerani", cc7));
//    	c[4].adicionar(new Importacion("Sopocachi", cc8));
//    	c[4].adicionar(new Importacion("Llojeta", cc9));
//    	
//    	
////    	nc = n;
////		for (int i = 1 ; i <= n ; i++){
////		    System.out.print ("Nro. elementos Cola Simple " + i + " :");
////		    int m = Leer.datoInt();
////		    c [i].llenar(m);
////		}
//    }
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

    public void vaciar(int i, CCircularImp Z) {
        c[i].vaciar(Z);
    }

    public void vaciar(int i, int j) {
        c[i].vaciar(c[j]);
    }

}
