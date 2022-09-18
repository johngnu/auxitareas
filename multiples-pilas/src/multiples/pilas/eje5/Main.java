/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples.pilas.eje5;

/**
 *
 * @author desktop
 */
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CSimpleZ z = new CSimpleZ();
        z.llenar2();
        //z.mostrar();
        MultiPilaTemp t = new MultiPilaTemp();
        t.llenar2();
        //t.mostrar();
        //a. Mostrar la fecha (mes y día) en que se presentó lluvia en la Zona de nombre
        //X (se presenta lluvia si es que la precipitación es mayor a 250).
//		SolucionA(z,t,"Garita");
        //b. Verificar si en el mes de marzo se presentaron temperaturas bajo cero de la
        //Zona de nombre X, si es así se pide eliminar tanto la Zona como las
        //temperaturas de la misma.
//		SolucionB(z,t,"Garita");
//		z.mostrar();
//		t.mostrar();
        //c. Mostrar el nombre de las zonas que presentaron lluvias.
//		SolucionC(z,t);

        /*
			PARTICIPACION
			d. De la Zona X,llevar las temperaturas mayores a y, al final de cada pila 
		 	0.5 puntos(metodo y corrida)
         */
        SolucionD(z, t, "Garita", 20);
        t.mostrar();
    }

    private static void SolucionD(CSimpleZ z, MultiPilaTemp t, String zx, int ty) {
        Zona elem;
        if (!z.esvacia()) {
            System.out.println("D. zona: " + zx);
            CSimpleZ aux = new CSimpleZ();
            while (!z.esvacia()) {
                elem = z.eliminar();
                aux.adicionar(elem);
                if (elem.getNombre().equals(zx)) {
                    //elem.getIdZona()
                    System.out.println(t.getN());
                    for (int i = 1; i <= t.getN(); i++) {
                        PilaTemperaturas taux = new PilaTemperaturas();
                        PilaTemperaturas aux20 = new PilaTemperaturas();
                        while (!t.esvacia(i)) {
                            Temperatura te = t.eliminar(i);
                            if (te.getIdzona().equals(elem.getIdZona())) {
                                if (te.getTemperatura() <= ty) {
                                    taux.adicionar(te);
                                } else {
                                    aux20.adicionar(te);
                                }
                            } else {
                                taux.adicionar(te);
                            }
                        }
                        t.vaciar(i, taux);
                        t.vaciar(i, aux20);
                    }
                }
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                z.adicionar(elem);
            }
        }
    }

    private static void SolucionC(CSimpleZ z, MultiPilaTemp t) {
        CSimpleZ aux = new CSimpleZ();
        System.out.println("Zonas que presentaron lluvia");
        while (!z.esvacia()) {
            Zona x = z.eliminar();
            if (VerificaLLuvia(x.getIdZona(), t)) {
                System.out.println("nombre Zona: " + x.getNombre());
            }
            aux.adicionar(x);
        }
        z.vaciar(aux);
    }

    private static boolean VerificaLLuvia(String idZona, MultiPilaTemp t) {
        boolean sw = false;
        for (int i = 1; i <= t.getN(); i++) {
            PilaTemperaturas aux = new PilaTemperaturas();
            while (!t.esvacia(i)) {
                Temperatura x = t.eliminar(i);
                if (x.getPrecipitación() < 250) {
                    sw = true;
                }
                aux.adicionar(x);
            }
            t.vaciar(i, aux);
        }

        return sw;
    }

    private static void SolucionB(CSimpleZ z, MultiPilaTemp t, String nomX) {
        CSimpleZ aux = new CSimpleZ();
        boolean sw = false;
        while (!z.esvacia()) {
            Zona x = z.eliminar();
            if (x.getNombre().equals(nomX)) {
                if (EncuentraTemperaturaBajoCero(t, x.getIdZona())) {
                    sw = true;
                }
            }
            aux.adicionar(x);
        }
        z.vaciar(aux);
        if (sw) {
            System.out.println("SI se presennto lluvia en marzo en la zona '" + nomX + "'");
            while (!z.esvacia()) {
                Zona x = z.eliminar();
                if (!x.getNombre().equals(nomX)) {
                    aux.adicionar(x);
                }
            }
            z.vaciar(aux);
        } else {
            System.out.println("NO se presennto lluvia en marzo en la zona '" + nomX + "'");
        }
    }

    private static boolean EncuentraTemperaturaBajoCero(MultiPilaTemp t, String idZona) {
        boolean sw = false;
        PilaTemperaturas aux = new PilaTemperaturas();
        while (!t.esvacia(3)) {
            Temperatura x = t.eliminar(3);
            if (x.getIdzona().equals(idZona)) {
                if (x.getTemperatura() < 0) {
                    sw = true;
                }
            }
            aux.adicionar(x);
        }
        t.vaciar(3, aux);
        if (sw) {
            for (int i = 1; i <= t.getN(); i++) {
                while (!t.esvacia(i)) {
                    Temperatura x = t.eliminar(i);
                    if (!x.getIdzona().equals(idZona)) {
                        aux.adicionar(x);
                    }
                }
                t.vaciar(i, aux);
            }
        }
        return sw;
    }

    private static void SolucionA(CSimpleZ z, MultiPilaTemp t, String nomX) {
        System.out.println("Fechas donde se presento lluvia en la zona '" + nomX + "'");
        CSimpleZ aux = new CSimpleZ();
        while (!z.esvacia()) {
            Zona x = z.eliminar();
            if (x.getNombre().equals(nomX)) {
                MuestraFecha_LluviaDeZonaX(t, x.getIdZona());
            }
            aux.adicionar(x);
        }
        z.vaciar(aux);
    }

    private static void MuestraFecha_LluviaDeZonaX(MultiPilaTemp t, String idZona) {
        for (int i = 1; i <= t.getN(); i++) {
            PilaTemperaturas aux = new PilaTemperaturas();
            while (!t.esvacia(i)) {
                Temperatura x = t.eliminar(i);
                if (x.getIdzona().equals(idZona) && x.getPrecipitación() > 250) {
                    System.out.println("Mes: " + i + " dia:" + x.getDía());
                }
                aux.adicionar(x);
            }
            t.vaciar(i, aux);
        }
    }

}
