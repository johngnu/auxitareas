package multiples.pilas.eje7;

public class Pasajero {

    private String ci, nombre, observacion;

    public Pasajero() {
        // TODO Auto-generated constructor stub
    }

    public Pasajero(String ci, String nombre, String observac) {
        super();
        this.ci = ci;
        this.nombre = nombre;
        this.observacion = observac;
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

    public String getObservac() {
        return observacion;
    }

    public void setObservac(String observac) {
        this.observacion = observac;
    }

    public void mostrar() {
        System.out.println("Pasajero [ci=" + ci + ", nombre=" + nombre + ", observacion=" + observacion + "]");
    }

    public void leer() {

    }
}
