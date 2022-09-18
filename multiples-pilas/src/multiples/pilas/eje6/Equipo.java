package multiples.pilas.eje6;

public class Equipo {

    private String nombre;
    private PilaJugadores pj;

    public Equipo() {
        // TODO Auto-generated constructor stub
    }

    public Equipo(String nombre, PilaJugadores pj) {
        super();
        this.nombre = nombre;
        this.pj = pj;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PilaJugadores getPj() {
        return pj;
    }

    public void setPj(PilaJugadores pj) {
        this.pj = pj;
    }

    public void mostrar() {
        System.out.println("Equipo [nombre=" + nombre + "]");
        pj.mostrar();
    }

    public void leer() {

    }
}
