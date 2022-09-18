package multiples.pilas.eje5;

public class Zona {

    private String idZona, nombre;

    public Zona() {
        // TODO Auto-generated constructor stub
    }

    public Zona(String idZona, String nombre) {
        super();
        this.idZona = idZona;
        this.nombre = nombre;
    }

    public String getIdZona() {
        return idZona;
    }

    public void setIdZona(String idZona) {
        this.idZona = idZona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Zona [idZona=" + idZona + ", nombre=" + nombre + "]");
    }

    public void leer() {

    }
}
