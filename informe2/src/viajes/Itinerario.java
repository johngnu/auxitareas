package viajes;

public class Itinerario {

    private String tipo_evento;
    private String lugar;
    private int duracion;

    public Itinerario(String tipo_evento, String lugar, int duracion) {
        this.tipo_evento = tipo_evento;
        this.lugar = lugar;
        this.duracion = duracion;
    }

    public void mostrar() {
        System.out.println("tipo_evento: " + tipo_evento + ", lugar: " + lugar + ", duracion: " + duracion);
    }

    public String getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(String tipo_evento) {
        this.tipo_evento = tipo_evento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}
