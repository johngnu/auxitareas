package multiples.pilas.eje6;

public class Jugador {

    private String nombre, posicion;

    public Jugador() {
        // TODO Auto-generated constructor stub
    }

    public Jugador(String nombre, String posicion) {
        super();
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void mostrar() {
        System.out.println("Jugador [nombre=" + nombre + ", posicion=" + posicion + "]");
    }

    public void leer() {

    }

}
