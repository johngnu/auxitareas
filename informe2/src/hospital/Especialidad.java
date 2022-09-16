package hospital;

public class Especialidad {

    private String nombre;
    private MultiColaPacientes mcp;
    private PilaMedicos pm;
    private ColaCMedicamentos ccm;

    public Especialidad(String nombre, MultiColaPacientes mcp, PilaMedicos pm, ColaCMedicamentos ccm) {
        this.nombre = nombre;
        this.mcp = mcp;
        this.pm = pm;
        this.ccm = ccm;
    }
    
    public void mostrar() {
        System.out.println("Especialidad: " + nombre);
        mcp.mostrar();
        pm.mostrar();
        ccm.mostrar();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public MultiColaPacientes getMcp() {
        return mcp;
    }

    public void setMcp(MultiColaPacientes mcp) {
        this.mcp = mcp;
    }

    public PilaMedicos getPm() {
        return pm;
    }

    public void setPm(PilaMedicos pm) {
        this.pm = pm;
    }

    public ColaCMedicamentos getCcm() {
        return ccm;
    }

    public void setCcm(ColaCMedicamentos ccm) {
        this.ccm = ccm;
    }

}
