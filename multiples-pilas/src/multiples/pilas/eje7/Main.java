package multiples.pilas.eje7;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PilaDestino d = new PilaDestino();
        d.llenar2();
        d.mostrar();
        MultiCSimpleS s = new MultiCSimpleS();
        s.llenar2();
        s.mostrar();
        //a. Crear un objeto Pila destinos y una múltiple cola simple de salidas,
        //llenar y mostrar
        //b. Mostrar las fechas en las cuales el conductor con ci X efectuó salidas.
        //SolucionB(d, s, "1111");

        /*
		PARTICIPACION
		c. Colocar en la primera cola de la múltiple cola, todas las salidas al
		destino X, distribuyendo el resto de las salidas de la primera cola al
		resto de las colas.
		
		SolucionC(d,s,"La Paz");
		 
		0.5 puntos(metodo y corrida)

         */
        //
        SolucionC(d, s, "La Paz");
        
        s.mostrar();
    }

    private static void SolucionB(PilaDestino d, MultiCSimpleS s, String ci) {
        System.out.println("Salidas del conductor con ci '" + ci + "'");
        for (int i = 1; i <= s.getN(); i++) {
            CSimpleS aux = new CSimpleS();
            while (!s.esvacia(i)) {
                Salida x = s.eliminar(i);
                if (x.getC1().getCi().equals(ci) || x.getC2().getCi().equals(ci)) {
                    MostrarFechaDestino(x.getCodDestino(), d);
                }
                aux.adicionar(x);
            }
            s.vaciar(i, aux);
        }
    }

    private static void MostrarFechaDestino(String codDestino, PilaDestino d) {
        PilaDestino aux = new PilaDestino();
        while (!d.esvacia()) {
            Destino x = d.eliminar();
            if (x.getCodDestino().equals(codDestino)) {
                System.out.println("Fecha: " + x.getFechaPartida());
            }
            aux.adicionar(x);
        }
        d.vaciar(aux);
    }

    private static void SolucionC(PilaDestino d, MultiCSimpleS s, String dx) {
        Destino elem;
        if (!d.esvacia()) {
            System.out.println("\n Datos de la Pila ");
            PilaDestino aux = new PilaDestino();
            while (!d.esvacia()) {
                elem = d.eliminar();
                if (elem.getDestino().equals(dx)) {
                    System.out.println("*********** Entro aqui con " + s.getN());
                    CSimpleS auxd = new CSimpleS();
                    CSimpleS auxt;
                    for (int i = 1; i <= s.getN(); i++) {
                        auxt = new CSimpleS();
                        while (!s.esvacia(i)) {
                            Salida sa = s.eliminar(i);
                            if (sa.getCodDestino().equals(elem.getCodDestino())) {
                                auxd.adicionar(sa);
                            } else {
                                auxt.adicionar(sa);
                            }
                        }
                        s.vaciar(i, auxt);                        
                    }
                    auxt = new CSimpleS();
                    while (!s.esvacia(1)) {
                        Salida sa = s.eliminar(1);
                        auxt.adicionar(sa);
                    }
                    s.vaciar(1, auxd);
                }
                aux.adicionar(elem);
            }
            d.vaciar(aux);
        }
    }

}
