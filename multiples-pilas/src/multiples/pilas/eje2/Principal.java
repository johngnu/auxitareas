package multiples.pilas.eje2;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MultiPilaLetra p = new MultiPilaLetra();
        p.llenar2();
        p.mostrar();
        //Sea una Multiple Pila de Letras

        //a. Cuántas palabras contienen el carácter X?
        SolucionA(p, "A");
        //b. Llevar el i-ésimo carácter de cada palabra a una nueva pila
        SolucionB(p, 3);
        p.mostrar();
        //c. Cuantas palabras tienen 2 vocales
        //SolucionC(p);

        SolucionD(p);
        //d. Mostrar las palabras palindromas
        // RESOLVER: 0.5 pts sobre auxiliatura (PARTICIPACION) presentacion en plataforma
    }

    private static void SolucionD(MultiPilaLetra p) {
        for (int i = 1; i <= p.getNc(); i++) {
            PilaLetra aux = new PilaLetra();
            String w = "";
            while (!p.esvacia(i)) {
                String y = p.eliminar(i);
                w = w + y;
                aux.adicionar(y);
            }
            p.vaciar(i, aux);
            StringBuilder strb = new StringBuilder(w);		 
            if (w.equals(strb.reverse().toString())) {
                System.out.println(w + " esta palabra es palindroma");
            }
        }
    }
    
    private static void SolucionC(MultiPilaLetra p) {
        int contPrincipal = 0;
        for (int i = 1; i <= p.getNc(); i++) {
            PilaLetra aux = new PilaLetra();
            int cont2 = 0;
            while (!p.esvacia(i)) {
                String y = p.eliminar(i);
                if (y.equals("A") || y.equals("E") || y.equals("I") || y.equals("O") || y.equals("U")
                        || y.equals("a") || y.equals("e") || y.equals("i") || y.equals("o") || y.equals("u")) {
                    cont2++;
                }
                aux.adicionar(y);
            }
            p.vaciar(i, aux);
            if (cont2 == 2) {
                contPrincipal++;
            }
        }
        System.out.println(contPrincipal + " palabras tienen '2' vocales");
    }

    private static void SolucionB(MultiPilaLetra p, int ie) {
        PilaLetra nueva = new PilaLetra();
        for (int i = 1; i <= p.getNc(); i++) {
            PilaLetra aux = new PilaLetra();
            if (ie <= p.nroElem(i)) {
                while (p.nroElem(i) > ie) {
                    aux.adicionar(p.eliminar(i));
                }
                String y = p.eliminar(i);
                nueva.adicionar(y);
                //Adicionar el elemento extraido
                p.adicionar(i, y);
                //Reponer los elementos del auxiliar
                p.vaciar(i, aux);
            }
        }
        p.vaciar(p.getNc() + 1, nueva);
        p.setNc(p.getNc() + 1);
    }

    private static void SolucionA(MultiPilaLetra p, String carX) {
        int cont = 0;
        for (int i = 1; i <= p.getNc(); i++) {
            PilaLetra aux = new PilaLetra();
            boolean sw = false;
            while (!p.esvacia(i)) {
                String x = p.eliminar(i);
                if (x.equals(carX)) {
                    sw = true;
                }
                aux.adicionar(x);
            }
            p.vaciar(i, aux);
            if (sw) {
                cont++;
            }
        }
        System.out.println(cont + " palabras tienen al caracter '" + carX + "'");
    }

}
