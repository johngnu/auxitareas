package multiples.pilas.eje4;

public class Importacion {

    private String idTP;
    private int valor;

    public Importacion() {
        // TODO Auto-generated constructor stub
    }

    public Importacion(String idTP, int valor) {
        super();
        this.idTP = idTP;
        this.valor = valor;
    }

    public String getIdTP() {
        return idTP;
    }

    public void setIdTP(String idTP) {
        this.idTP = idTP;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void mostrar() {
        System.out.println("Importacion [idTP=" + idTP + ", valor=" + valor + "]");
    }

    public void leer() {

    }
}
