package multiples.pilas.eje3;

public class Proyecto {

    private String titulo;
    private CCircularParticipantes p;

    public Proyecto() {
        // TODO Auto-generated constructor stub
    }

    public Proyecto(String titulo, CCircularParticipantes p) {
        super();
        this.titulo = titulo;
        this.p = p;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public CCircularParticipantes getP() {
        return p;
    }

    public void setP(CCircularParticipantes p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Proyecto [titulo=" + titulo + "]";
    }

    public void mostrar() {
        System.out.println(toString());
        p.mostrar();
    }

    public void leer() {

    }
}
