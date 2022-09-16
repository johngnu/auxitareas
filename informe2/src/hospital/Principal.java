package hospital;

public class Principal {

    public static void main(String[] args) {
        Paciente p1 = new Paciente("p1", "d1", 30);
        Paciente p2 = new Paciente("p2", "d2", 40);
        Paciente p3 = new Paciente("p3", "d1", 70);

        MultiColaPacientes mcp = new MultiColaPacientes();
        mcp.setN(3);
        mcp.adicionar(1, p1);
        mcp.adicionar(2, p1);
        mcp.adicionar(3, p1);

        //mcp.mostrar();
        Medico m1 = new Medico("m1", "alto", 52);
        Medico m2 = new Medico("m2", "medio", 48);

        PilaMedicos pm = new PilaMedicos();
        pm.adicionar(m1);
        pm.adicionar(m2);

        Medicamento md1 = new Medicamento("med1", "f1", 70);
        Medicamento md2 = new Medicamento("med2", "f1", 50);
        Medicamento md3 = new Medicamento("med3", "f2", 30);

        ColaCMedicamentos ccm = new ColaCMedicamentos();
        ccm.adicionar(md1);
        ccm.adicionar(md2);
        ccm.adicionar(md3);

        //ccm.mostrar();
        Especialidad e1 = new Especialidad("neumologia", mcp, pm, ccm);
        Especialidad e2 = new Especialidad("cardiologia", mcp, pm, ccm);

        PilaEspecialidad pe = new PilaEspecialidad();
        pe.adicionar(e1);
        pe.adicionar(e2);

        pe.mostrar();
        
        solucionA(pe);
        
        solucionB(pe);
    }

    public static void solucionB(PilaEspecialidad p) {
        Especialidad e = null;
        if (p.esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n B. nro medicos por experiencia en cardiologia");
            int cm1 = 0;
            int cm2 = 0;
            int cm3 = 0;
            PilaEspecialidad eaux = new PilaEspecialidad();
            while (!p.esvacia()) {
                e = p.eliminar();
                eaux.adicionar(e);
                if (e.getNombre().equals("cardiologia")) {
                    PilaMedicos pm = e.getPm();
                    Medico elem = null;
                    if (pm.esvacia()) {
                        System.out.println("Pila vacia");
                    } else {
                        System.out.println("\n Datos de la Pila ");
                        PilaMedicos aux = new PilaMedicos();
                        while (!pm.esvacia()) {
                            elem = pm.eliminar();
                            aux.adicionar(elem);
                            if (elem.getExperiencia().equals("alto")) {
                                cm1++;
                            }
                            if (elem.getExperiencia().equals("medio")) {
                                cm2++;
                            }
                            if (elem.getExperiencia().equals("bajo")) {
                                cm3++;
                            }
                        }
                        pm.vaciar(aux);
                    }
                }
            }
            p.vaciar(eaux);
            System.out.println("alto: " + cm1);
            System.out.println("medio: " + cm2);
            System.out.println("bajo: " + cm3);
        }
    }

    public static void solucionA(PilaEspecialidad p) {
        Especialidad e = null;
        if (p.esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n A. mover mayores a nuevo consultorio");
            PilaEspecialidad eaux = new PilaEspecialidad();
            while (!p.esvacia()) {
                e = p.eliminar();
                eaux.adicionar(e);
                if (e.getNombre().equals("neumologia")) {
                   MultiColaPacientes mcp = e.getMcp();
                   mcp.setN(mcp.getN() + 1);
                   for (int i = 1; i <= mcp.getN() -1; i++) {
                       Paciente pa = mcp.eliminar(i);
                       
                   }                   
                }
            }
            p.vaciar(eaux);
        }
    }
}
