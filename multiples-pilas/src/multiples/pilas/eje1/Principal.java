package multiples.pilas.eje1;

public class Principal {

    public static void main(String[] args) {
        Pila_PilaLetra p = new Pila_PilaLetra();
        // Cola_PilaLetra p = new Cola_PilaLetra();
        p.llenar2();
        p.mostrar();
        //Sea una Cola de Objetos PilaLetra
        //a. Cuántas palabras contienen el carácter X?
        // SolucionA(p,"A");
        //b. Llevar el i-ésimo carácter de cada palabra a una nueva pila
        // SolucionB(p,4);
        //mostrar();
        //c. Cuantas palabras tienen 2 vocales
        SolucionC(p);
        //d. Mostrar las palabras palindromas

        // RESOLVER: 0.5 pts sobre auxiliatura (PARTICIPACION) presentacion en plataforma
    }

    private static void SolucionC(Pila_PilaLetra p) {
        Pila_PilaLetra aux = new Pila_PilaLetra();
        int contPrin = 0;
        while (!p.esvacia()) {
            PilaLetra aux1 = new PilaLetra();
            PilaLetra x = p.eliminar();
            int cont2 = 0;
            while (!x.esvacia()) {
                String y = x.eliminar();
                if (y.equals("A") || y.equals("E") || y.equals("I") || y.equals("O") || y.equals("U")
                        || y.equals("a") || y.equals("e") || y.equals("i") || y.equals("o") || y.equals("u")) {
                    cont2++;
                }
                aux1.adicionar(y);
            }
            x.vaciar(aux1);
            if (cont2 == 2) {
                contPrin++;
            }
            aux.adicionar(x);
        }
        p.vaciar(aux);
        System.out.println(contPrin + " palabras contienen a '2' vocales");
    }

    private static void SolucionB(Pila_PilaLetra p, int ie) {
        Pila_PilaLetra aux = new Pila_PilaLetra();
        PilaLetra nuevo = new PilaLetra();
        while (!p.esvacia()) {
            PilaLetra aux1 = new PilaLetra();
            PilaLetra x = p.eliminar();
            if (ie <= x.nroelem()) {
                aux1.vaciar(x);
                for (int i = 1; i < ie; i++) {
                    x.adicionar(aux1.eliminar());
                }
                String y = aux1.eliminar();
                nuevo.adicionar(y);
                x.adicionar(y);
                x.vaciar(aux1);
            }
            aux.adicionar(x);
        }
        p.vaciar(aux);
        p.adicionar(nuevo);
    }

    private static void SolucionA(Pila_PilaLetra p, String carX) {
        Pila_PilaLetra aux = new Pila_PilaLetra();
        int cont = 0;
        while (!p.esvacia()) {
            PilaLetra aux1 = new PilaLetra();
            PilaLetra x = p.eliminar();
            boolean sw = false;
            while (!x.esvacia()) {
                String y = x.eliminar();
                if (y.equals(carX)) {
                    sw = true;
                }
                aux1.adicionar(y);
            }
            x.vaciar(aux1);
            if (sw) {
                cont++;
            }
            aux.adicionar(x);
        }
        p.vaciar(aux);
        System.out.println(cont + " palabras tienen el caracter '" + carX + "'");
    }

}
