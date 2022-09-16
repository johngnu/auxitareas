package viajes;

public class Principal {

    public static void main(String[] args) {

        Itinerario I1 = new Itinerario("Almuerzo", "Plaza", 30);
        Itinerario I2 = new Itinerario("Paseo", "Museo", 60);
        Itinerario I3 = new Itinerario("Cena", "Hotel", 40);
        Itinerario I4 = new Itinerario("Paseo", "Playa", 80);
        Itinerario I5 = new Itinerario("Festival", "Hotel", 120);
        Itinerario I6 = new Itinerario("Desayuno", "Plaza 30", 40);
        Itinerario I7 = new Itinerario("Almuerzo", "Hotel", 60);
        Itinerario I8 = new Itinerario("Fiesta", "Discoteca", 150);
        
        Viaje v1 = new Viaje("H55", "Juan duran", "Tren");
        Viaje v2 = new Viaje("J665", "Jazmin Loza", "Avion");
        Viaje v3 = new Viaje("G232", "Alan Ruiz", "Bus");
        Viaje v4 = new Viaje("T44", "Pedro Lopez", "Tren");
        
        ColaSViajes cv = new ColaSViajes();
        cv.adicionar(v1);
        cv.adicionar(v2);
        cv.adicionar(v3);
        cv.adicionar(v4);        
        //cv.mostrar();
        
        MultiplePila_Itinerario mp = new MultiplePila_Itinerario();
        mp.setNp(4);
        mp.adicionar(1, I1);
        mp.adicionar(1, I2);
        mp.adicionar(1, I3);
        
        mp.adicionar(2, I2);
        mp.adicionar(2, I4);
        
        mp.adicionar(3, I1);
        mp.adicionar(3, I2);
        mp.adicionar(3, I3);
        mp.adicionar(3, I5);
        
        mp.adicionar(4, I6);
        mp.adicionar(4, I2);
        mp.adicionar(4, I7);
        mp.adicionar(4, I3);
        mp.adicionar(4, I8);
        
        //mp.mostrar();

        Plan p1 = new Plan("Promo", 852, "t1", "h1");
        Plan p2 = new Plan("Promo 2", 320, "t1", "h1");
        Pila_plan pp = new Pila_plan();
        pp.adicionar(p1);
        pp.adicionar(p2);
        
        DestinoTuristico dt = new DestinoTuristico("SCZ", "tour", "santa cruz", pp);
        //dt.mostrar();
        
        // a
        solucionA(cv, mp, 1);
        
    }

    private static void solucionA(ColaSViajes cv, MultiplePila_Itinerario mp, int i) {
        Viaje elem = null;
        if (cv.esvacia()) {
            System.out.println("Cola vacia");
        } else {
            int c = 1;
            ColaSViajes aux = new ColaSViajes();
            while (!cv.esvacia()) {
                elem = cv.eliminar();
                aux.adicionar(elem);
                if(c == i) {
                    System.out.println("Cliente: " + elem.getNom_cliente());
                    Itinerario it = mp.eliminar(i);
                    
                }
                c++;
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                cv.adicionar(elem);
            }
        }
    }

    
}
