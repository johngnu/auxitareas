package multiples.pilas.eje3;

public class Participante {

    private String nombre;

    public Participante() {
        // TODO Auto-generated constructor stub
    }

    public Participante(String nombre) {
        super();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Participante [nombre=" + nombre + "]";
    }

    public void mostrar() {
        System.out.println(toString());
    }

    public void leer() {

    }
}
