package viajes;

public class DestinoTuristico {

    private String id_destino;
    private String tipo;
    private String ubicacion;
    private Pila_plan p;

    public DestinoTuristico(String id_destino, String tipo, String ubicacion, Pila_plan p) {
        this.id_destino = id_destino;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.p = p;
    }

    public void mostrar() {
        System.out.println("id_destino: " + id_destino + ", tipo: " + tipo + ", ubicacion: " + ubicacion);
        p.mostrar();
    }

    public String getId_destino() {
        return id_destino;
    }

    public void setId_destino(String id_destino) {
        this.id_destino = id_destino;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Pila_plan getP() {
        return p;
    }

    public void setP(Pila_plan p) {
        this.p = p;
    }

}
