package multiples.pilas.eje4;

public class TipoProducto {

    private String idTP, nomTP;

    public TipoProducto() {
        // TODO Auto-generated constructor stub
    }

    public TipoProducto(String idTP, String nomTP) {
        super();
        this.idTP = idTP;
        this.nomTP = nomTP;
    }

    public String getIdTP() {
        return idTP;
    }

    public void setIdTP(String idTP) {
        this.idTP = idTP;
    }

    public String getNomTP() {
        return nomTP;
    }

    public void setNomTP(String nomTP) {
        this.nomTP = nomTP;
    }

    public void mostrar() {
        System.out.println("TipoProducto [idTP=" + idTP + ", nomTP=" + nomTP + "]");
    }

    public void leer() {

    }
}
