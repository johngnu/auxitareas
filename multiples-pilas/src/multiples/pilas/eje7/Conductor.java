package multiples.pilas.eje7;

public class Conductor {

    private String ci, nombre;

    public Conductor() {
        // TODO Auto-generated constructor stub
    }

    public Conductor(String ci, String nombre) {
        super();
        this.ci = ci;
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Conductor [ci=" + ci + ", nombre=" + nombre + "]");
    }

    public void leer() {

    }
}
