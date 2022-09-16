package exl131;

public class Obra {

    private String idTip;
    private String titulo;
    private String fecha;

    public Obra(String idTip, String titulo, String fecha) {
        this.idTip = idTip;
        this.titulo = titulo;
        this.fecha = fecha;
    }
    
    public void mostrar() {
        System.out.println("idTip: " + idTip + " titulo: " + titulo + " fecha: " + fecha);
    }

    public String getIdTip() {
        return idTip;
    }

    public void setIdTip(String idTip) {
        this.idTip = idTip;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
