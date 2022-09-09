package ejerviernes;

public class Principal {
    
    public static void main(String[] args) {
        // TODO code application logic here
        PilaIES A = new PilaIES();
        IEducSup e1 = new IEducSup("ies1", "", 1);
        IEducSup e2 = new IEducSup("ies8", "", 13);
        IEducSup e3 = new IEducSup("ies5", "", 12);
        IEducSup e4 = new IEducSup("ies10", "", 71);
        IEducSup e5 = new IEducSup("ies3", "", 19);
        IEducSup e6 = new IEducSup("ies33", "", 4);
        IEducSup e7 = new IEducSup("ies37", "", 149);
        IEducSup e8 = new IEducSup("ies23", "", 129);
        IEducSup e9 = new IEducSup("ies34", "", 149);
        A.adicionar(e1);
        A.adicionar(e2);
        A.adicionar(e3);
        
        PilaIES B = new PilaIES();
        B.adicionar(e4);
        B.adicionar(e5);
        
        PilaIES C = new PilaIES();
        C.adicionar(e6);
        C.adicionar(e7);
        C.adicionar(e8);
        C.adicionar(e9);
        
        ColaSZ Z = new ColaSZ();
        Zona z1 = new Zona("Centro", "Central", A);
        Zona z2 = new Zona("Cotahuma", "Llojeta", B);
        Zona z3 = new Zona("Sur", "Calacoto", C);
        
        Z.adicionar(z1);
        Z.adicionar(z2);
        Z.adicionar(z3);
        Z.mostrar();

        // 5
        mostrar(Z, "Calacoto");
        
        
    }
    
    public static void mostrar(ColaSZ Z, String nombre) {
        Zona elem = null;
        if (Z.esvacia()) {
            System.out.println("Cola vacia");
        } else {
            ColaSZ aux = new ColaSZ();
            while (!Z.esvacia()) {
                elem = Z.eliminar();
                aux.adicionar(elem);
                if (elem.getNombre().equals(nombre)) {
                    System.out.println("Instituciones de la zona: " + elem.getNombre());
                    elem.getC().mostrar();
                }
            }
            System.out.println("");
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                Z.adicionar(elem);
            }
        }
    }
    
    public static void mostrar(PilaIES A, ColaSZ Z, String nombre) {
        IEducSup elem = new IEducSup();
        if (A.esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Institucion: " + nombre);
            PilaIES aux = new PilaIES();
            while (!A.esvacia()) {
                elem = A.eliminar();
                aux.adicionar(elem);
                if (nombre.equals(elem.getNombre())) {
                    // falta
                }
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                A.adicionar(elem);
            }
        }
    }
}
