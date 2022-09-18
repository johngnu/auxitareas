package multiples.pilas.eje5;

public class Temperatura {

    private String idzona;
    private int día, temperatura, precipitación;

    public Temperatura() {
        // TODO Auto-generated constructor stub
    }

    public Temperatura(String idzona, int temperatura, int día, int precipitación) {
        super();
        this.idzona = idzona;
        this.día = día;
        this.temperatura = temperatura;
        this.precipitación = precipitación;
    }

    public String getIdzona() {
        return idzona;
    }

    public void setIdzona(String idzona) {
        this.idzona = idzona;
    }

    public int getDía() {
        return día;
    }

    public void setDía(int día) {
        this.día = día;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getPrecipitación() {
        return precipitación;
    }

    public void setPrecipitación(int precipitación) {
        this.precipitación = precipitación;
    }

    public void mostrar() {
        System.out.println("Temperatura [idzona=" + idzona + ", día=" + día + ", temperatura=" + temperatura + ", precipitación="
                + precipitación + "]");
    }

    public void leer() {

    }
}
