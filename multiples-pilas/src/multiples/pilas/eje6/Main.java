package multiples.pilas.eje6;

public class Main {

    public static void main(String[] args) {
        CSimpleE e = new CSimpleE();
        e.llenar2();
        //e.mostrar();
        MultiCCircularP p = new MultiCCircularP();
        p.llenar2();
        p.mostrar();
        //a. Mostrar los equipos que no tienen ningún partido ganado.
        //SolucionA(e, p);
        //b. Mostrar a los jugadores de los equipos cuyo partido es empate.
        //SolucionB(e, p);

        /*
			PARTICIPACION
			Mostrar el nombre de cada equipo y la cantidad de victorias que tiene.
					
		 	0.5 puntos(metodo y corrida)
         */
        SolucionC(e, p, "Lanus");
    }

    private static void SolucionB(CSimpleE e, MultiCCircularP p) {
        CSimpleE aux = new CSimpleE();
        while (!e.esvacia()) {
            Equipo x = e.eliminar();
            if (VerificaSi_El_EquipoEmpato(p, x.getNombre())) {
                System.out.println("Equipo:" + x.getNombre());
                x.getPj().mostrar();
            }
            aux.adicionar(x);
        }
        e.vaciar(aux);
    }

    private static boolean VerificaSi_El_EquipoEmpato(MultiCCircularP p, String y) {
        boolean sw = false;
        for (int i = 1; i <= p.getN(); i++) {
            CCircularP aux = new CCircularP();
            while (!p.esvacia(i)) {
                Partido x = p.eliminar(i);
                if ((x.getNomEquipoA().equals(y) && x.getNroGolesA() == x.getNroGolesB())
                        || x.getNomEqupoB().equals(y) && x.getNroGolesA() == x.getNroGolesB()) {
                    sw = true;
                }
                aux.adicionar(x);
            }
            p.vaciar(i, aux);
        }
        return sw;
    }

    private static void SolucionA(CSimpleE e, MultiCCircularP p) {
        CSimpleE aux = new CSimpleE();
        System.out.println("Equipos sin ninguna Victoria");
        while (!e.esvacia()) {
            Equipo x = e.eliminar();
            if (!VerificaTodosLosPartidos(p, x.getNombre())) {
                System.out.println("Equipo:" + x.getNombre());
            }
            aux.adicionar(x);
        }
        e.vaciar(aux);
    }

    private static boolean VerificaTodosLosPartidos(MultiCCircularP p, String y) {
        boolean sw = false;
        for (int i = 1; i <= p.getN(); i++) {
            CCircularP aux = new CCircularP();
            while (!p.esvacia(i)) {
                Partido x = p.eliminar(i);
                if ((x.getNomEquipoA().equals(y) && x.getNroGolesA() > x.getNroGolesB())
                        || (x.getNomEqupoB().equals(y) && x.getNroGolesB() > x.getNroGolesA())) {
                    sw = true;
                }
                aux.adicionar(x);
            }
            p.vaciar(i, aux);
        }
        return sw;
    }

    private static void SolucionC(CSimpleE e, MultiCCircularP p, String lanus) {
        Equipo elem;
        if (!e.esvacia()) {
            System.out.println("\n Equipos");
            CSimpleE aux = new CSimpleE();
            while (!e.esvacia()) {
                elem = e.eliminar();
                aux.adicionar(elem);                
                int cv = 0;
                for (int i = 1; i < p.getN(); i++) {
                    CCircularP paux = new CCircularP();
                    while (!p.esvacia(i)) {                        
                        Partido pa = p.eliminar(i);
                        if(pa.getNomEquipoA().equals(elem.getNombre())) {
                            if(pa.getNroGolesA() > pa.getNroGolesB()) {
                                cv++;
                            }
                        }
                        if(pa.getNomEqupoB().equals(elem.getNombre())) {
                            if(pa.getNroGolesB() > pa.getNroGolesA()) {
                                cv++;
                            }
                        }
                        paux.adicionar(pa);
                    }
                    p.vaciar(i, paux);
                }
                System.out.println("Equipo: " + elem.getNombre() + ", Victorias: " + cv);
            }
            e.vaciar(aux);
        }
    }

}
