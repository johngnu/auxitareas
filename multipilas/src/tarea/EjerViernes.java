package tarea;

public class EjerViernes {

    public static void main(String[] args) {
        ColaIES A = new ColaIES();
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

        ColaIES B = new ColaIES();
        B.adicionar(e4);
        B.adicionar(e5);

        ColaIES C = new ColaIES();
        C.adicionar(e6);
        C.adicionar(e7);
        C.adicionar(e8);
        C.adicionar(e9);

        PilaZ Z = new PilaZ();
        Zona z1 = new Zona("Centro", "Central", A);
        Zona z2 = new Zona("Cotahuma", "Llojeta", B);
        Zona z3 = new Zona("Sur", "Calacoto", C);

        Z.adicionar(z1);
        Z.adicionar(z2);
        Z.adicionar(z3);
        Z.mostrar();
    }
}
