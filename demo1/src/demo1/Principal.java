package demo1;

/**
 *
 * @author desktop
 */
public class Principal {

    public static void main(String[] args) {
        Casa c = new Casa(1023, "rojo");
        Casa n = new Casa(11, "amarillo");
        
        PilaCasa p = new PilaCasa();
        p.adicionar(c);
        p.adicionar(n);
        
        p.mostrar();
        
        ColaCasa co = new ColaCasa();
        co.adicionar(c);
        co.adicionar(n);
        
        //co.mostrar();
        

        //sumar(c, n);
        //.out.println("nro casa: " + c.getNro());
        //aumentarNro(c);
        //System.out.println("nro casa: " + c.getNro());

        //cambiarColor(c);
        //System.out.println("El color de la casa c es: " + c.getColor());

        //cambiarColor(n);
        //System.out.println("El color de la casa c es: " + n.getColor());

        //verSiEsPrimo(c.getNro());
    }

    public static void verSiEsPrimo(int nro) {
        int cd = 0;
        //for (int i = 2; i <= (nro/2); i++) {
        int i = 2;
        while(i <= (nro/2)) {
            if(nro % i == 0) {
                cd++;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("divs: " + cd);
        if(cd == 0) {
            System.out.println("El nro de la casa es primo");
        } else {
            System.out.println("El nro de la casa no es primo");
        }
    }

    public static void cambiarColor(Casa x) {
        if (x.getNro() % 2 == 0) {
            x.setColor("azul");
        } else {
            x.setColor("verde");
        }
    }

    public static void aumentarNro(Casa c) {
        //c.nro = c.nro + 10;
        c.setNro(c.getNro() + 10);
    }

    public static void sumar(Casa a, Casa b) {
        int sum = a.getNro() + b.getNro();
        System.out.println("las suma de las casas es: " + sum);
    }

}
