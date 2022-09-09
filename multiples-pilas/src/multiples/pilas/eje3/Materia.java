package multiples.pilas.eje3;

public class Materia {

    private String sigla;
    private PilaProyectos proy;

    public Materia() {
        // TODO Auto-generated constructor stub
    }

    public Materia(String sigla, PilaProyectos proy) {
        super();
        this.sigla = sigla;
        this.proy = proy;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public PilaProyectos getProy() {
        return proy;
    }

    public void setProy(PilaProyectos proy) {
        this.proy = proy;
    }

    @Override
    public String toString() {
        return "Materia [sigla=" + sigla + "]";
    }

    public void mostrar() {
        System.out.println(toString());
        proy.mostrar();
    }

    public void leer() {

    }
}
