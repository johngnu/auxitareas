package multiples.pilas.eje3;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CSimpleMaterias m = new CSimpleMaterias();
        m.llenar2();
        m.mostrar();

        //a. Cuantos proyectos se presentarán en cada materia
        //		SolucionA(m);
        //b. Mostrar la sigla de la materia, el titulo del 
        //   proyecto que tengan 3 participantes
        //		SolucionB(m);
        //c. Verificar si la en la materia X se encuentra el Participante Y
        //SolucionC(m, "INF-111", "Alan");
        //d. De las materias que tengan X numero de participantes,
        //   mostrar la materia y eliminar a los ultimo participantes de cada proyecto
        // RESOLVER: 0.5 pts sobre auxiliatura (PARTICIPACION) presentacion en plataforma
        //SolucionC(m, "INF-111", "Alan");
        SolucionD(m, 4);

        m.mostrar();
    }

    private static void SolucionD(CSimpleMaterias m, int xe) {
        CSimpleMaterias caux = new CSimpleMaterias();
        while (!m.esvacia()) {
            Materia x = m.eliminar();
            Proyecto pelem;
            if (!x.getProy().esvacia()) {
                PilaProyectos paux = new PilaProyectos();
                while (!x.getProy().esvacia()) {
                    pelem = x.getProy().eliminar();
                    if (pelem.getP().nroelem() == xe) {
                        System.out.println("*** Materia: " + x.getSigla());
                        System.out.println("*** nparts.: " + pelem.getP().nroelem());
                        CCircularParticipantes aux = new CCircularParticipantes();
                        for (int i = 1; i < (pelem.getP().nroelem() - 1); i++) { // n participantes - 1
                            Participante pr = pelem.getP().eliminar();
                            aux.adicionar(pr);
                        }
                        //pelem.getP().vaciar(aux);
                    }
                    paux.adicionar(pelem);
                }
                x.getProy().vaciar(paux);
            }
            caux.adicionar(x);
        }
        m.vaciar(caux);
    }

    private static void SolucionC(CSimpleMaterias m, String mat, String part) {
        CSimpleMaterias aux = new CSimpleMaterias();
        boolean sw = false;
        while (!m.esvacia()) {
            Materia x = m.eliminar();
            if (x.getSigla().equals(mat) && BuscaParticipante(x.getProy(), part)) {
                sw = true;
            }
            aux.adicionar(x);
        }
        m.vaciar(aux);
        if (sw) {
            System.out.println("SI existe el participante '" + part + "' en la materia '" + mat + "'");
        } else {
            System.out.println("NO existe el participante '" + part + "' en la materia '" + mat + "'");
        }
    }

    private static boolean BuscaParticipante(PilaProyectos p, String part) {
        boolean sw = false;
        PilaProyectos aux = new PilaProyectos();
        while (!p.esvacia()) {
            Proyecto x = p.eliminar();
            if (BuscaParticipante_2(x.getP(), part)) {
                sw = true;
            }
            aux.adicionar(x);
        }
        p.vaciar(aux);
        return sw;
    }

    private static boolean BuscaParticipante_2(CCircularParticipantes p, String part) {
        boolean sw = false;
        CCircularParticipantes aux = new CCircularParticipantes();
        while (!p.esvacia()) {
            Participante x = p.eliminar();
            if (x.getNombre().equals(part)) {
                sw = true;
            }
            aux.adicionar(x);
        }
        p.vaciar(aux);
        return sw;
    }

    private static void SolucionB(CSimpleMaterias m) {
        CSimpleMaterias aux = new CSimpleMaterias();
        while (!m.esvacia()) {
            Materia x = m.eliminar();
            VerificaParticipantes(x.getProy(), x.getSigla());
            aux.adicionar(x);
        }
        m.vaciar(aux);
    }

    private static void VerificaParticipantes(PilaProyectos p, String mat) {
        PilaProyectos aux = new PilaProyectos();
        while (!p.esvacia()) {
            Proyecto x = p.eliminar();
            if (x.getP().nroelem() == 3) {
                System.out.println(mat);
                System.out.println(x.getTitulo());
            }
            aux.adicionar(x);
        }
        p.vaciar(aux);
    }

    private static void SolucionA(CSimpleMaterias m) {
        CSimpleMaterias aux = new CSimpleMaterias();
        while (!m.esvacia()) {
            Materia x = m.eliminar();
            System.out.println(x.getSigla());
            System.out.println("Cantidad de proyectos: " + x.getProy().nroelem());
            aux.adicionar(x);
        }
        m.vaciar(aux);
    }

}
