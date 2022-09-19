package multiples.pilas.eje7;

public class Salida {

    private String codDestino;
    private CCircularPas cp;
    private Conductor c1, c2;

    public Salida() {
        // TODO Auto-generated constructor stub
    }

    public Salida(String codDestino, CCircularPas cp, Conductor c1, Conductor c2) {
        super();
        this.codDestino = codDestino;
        this.cp = cp;
        this.c1 = c1;
        this.c2 = c2;
    }

    public String getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(String codDestino) {
        this.codDestino = codDestino;
    }

    public CCircularPas getCp() {
        return cp;
    }

    public void setCp(CCircularPas cp) {
        this.cp = cp;
    }

    public Conductor getC1() {
        return c1;
    }

    public void setC1(Conductor c1) {
        this.c1 = c1;
    }

    public Conductor getC2() {
        return c2;
    }

    public void setC2(Conductor c2) {
        this.c2 = c2;
    }

    public void mostrar() {
        System.out.println("Salida [codDestino=" + codDestino + "]");
        cp.mostrar();
        c1.mostrar();
        c2.mostrar();
    }

    public void leer() {

    }
}
