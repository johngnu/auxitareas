package multiples.pilas.eje6;

public class Partido {

    private String fecha, nomEquipoA, nomEqupoB;
    private int nroGolesA, nroGolesB;

    public Partido() {
        // TODO Auto-generated constructor stub
    }

    public Partido(String fecha, String nomEquipoA, String nomEqupoB, int nroGolesA, int nroGolesB) {
        super();
        this.fecha = fecha;
        this.nomEquipoA = nomEquipoA;
        this.nomEqupoB = nomEqupoB;
        this.nroGolesA = nroGolesA;
        this.nroGolesB = nroGolesB;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNomEquipoA() {
        return nomEquipoA;
    }

    public void setNomEquipoA(String nomEquipoA) {
        this.nomEquipoA = nomEquipoA;
    }

    public String getNomEqupoB() {
        return nomEqupoB;
    }

    public void setNomEqupoB(String nomEqupoB) {
        this.nomEqupoB = nomEqupoB;
    }

    public int getNroGolesA() {
        return nroGolesA;
    }

    public void setNroGolesA(int nroGolesA) {
        this.nroGolesA = nroGolesA;
    }

    public int getNroGolesB() {
        return nroGolesB;
    }

    public void setNroGolesB(int nroGolesB) {
        this.nroGolesB = nroGolesB;
    }

    public void mostrar() {
        System.out.println("Partido [fecha=" + fecha + ", nomEquipoA=" + nomEquipoA + ", nomEqupoB=" + nomEqupoB + ", nroGolesA="
                + nroGolesA + ", nroGolesB=" + nroGolesB + "]");
    }

    public void leer() {

    }
}
