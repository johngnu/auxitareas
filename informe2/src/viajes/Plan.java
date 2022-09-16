package viajes;

public class Plan {

    private String detalle;
    private int costo;
    private String tipo;
    private String nom_hotel;

    public Plan(String detalle, int costo, String tipo, String nom_hotel) {
        this.detalle = detalle;
        this.costo = costo;
        this.tipo = tipo;
        this.nom_hotel = nom_hotel;
    }

    public void mostrar() {
        System.out.println("Detalle: " + detalle + ", costo: " + costo + ", tipo: " + tipo + ", nom_hotel: " + nom_hotel);
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNom_hotel() {
        return nom_hotel;
    }

    public void setNom_hotel(String nom_hotel) {
        this.nom_hotel = nom_hotel;
    }

}
