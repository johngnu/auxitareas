package exl131;

import java.util.Stack;

public class Principal {

    public static void main(String[] args) {
        TipoObra t1 = new TipoObra("t1", "Fonogramas", 150, 300);
        TipoObra t2 = new TipoObra("t2", "Obras escritas", 100, 200);

        Stack<TipoObra> tipos = new Stack<>();
        tipos.add(t1);
        tipos.add(t2);
        
        mostrarTipos(tipos);

        Obra o1 = new Obra("t1", "tit1", "01/01/2022");
        Obra o2 = new Obra("t1", "tit1", "01/01/2022");
        Obra o3 = new Obra("t1", "tit1", "01/01/2022");

        //o1.mostrar();

        Stack<Obra> obras = new Stack<>();
        obras.add(o1);
        obras.add(o2);
        obras.add(o3);

        // mostrar el stack
        //mostrar(obras);
        Autor a1 = new Autor("13342538", "helen", "av. trigales", "boliviana", obras);
        Autor a2 = new Autor("123", "autor2", "lomas cabas", "estranjero", obras);

        //ColaAutores ca = new ColaAutores();
        //ca.adicionar(a1);
        MultiCola_Autores mca = new MultiCola_Autores();
        mca.setN(1);

        mca.adicionar(1, a1);

        mca.mostrar();
    }

    public static void mostrar(Stack<Obra> miStack) {
        
        Stack<Obra> aux = new Stack<Obra>();
        while (!miStack.isEmpty()) {
            Obra elem = miStack.pop();
            aux.push(elem);
            elem.mostrar();
        }
        vaciar(miStack, aux);
    }

    public static void vaciar(Stack<Obra> miStack, Stack<Obra> aux) {
        while (!aux.isEmpty()) {
            miStack.push(aux.pop());
        }
    }

    private static void mostrarTipos(Stack<TipoObra> tipos) {
        System.out.println("mostrra tipos de obra");
        Stack<TipoObra> aux = new Stack<>();
        while (!tipos.isEmpty()) {
            TipoObra elem = tipos.pop();
            aux.push(elem);
            elem.mostrar();
        }
        vaciarTipos(tipos, aux);
    }

    public static void vaciarTipos(Stack<TipoObra> miStack, Stack<TipoObra> aux) {
        while (!aux.isEmpty()) {
            miStack.push(aux.pop());
        }
    }
}
