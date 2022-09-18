package multiples.pilas.eje7;

public class Destino {

    private String codDestino, fechaPartida, horaSalida, destino;
    private int costo;

    public Destino() {
        // TODO Auto-generated constructor stub
    }

    public Destino(String codDestino, String fechaPartida, String horaSalida, String destino, int costo) {
        super();
        this.codDestino = codDestino;
        this.fechaPartida = fechaPartida;
        this.horaSalida = horaSalida;
        this.destino = destino;
        this.costo = costo;
    }

    public String getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(String codDestino) {
        this.codDestino = codDestino;
    }

    public String getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(String fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void mostrar() {
        System.out.println("Destino [codDestino=" + codDestino + ", fechaPartida=" + fechaPartida + ", horaSalida=" + horaSalida
                + ", destino=" + destino + ", costo=" + costo + "]");
    }

    public void leer() {

    }
}
