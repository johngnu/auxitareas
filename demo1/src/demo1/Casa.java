package demo1;

public class Casa {

    private int nro;
    private String color;

    public Casa(int nro, String color) {
        this.nro = nro;
        this.color = color;
    }

    public void mostrar() {
        System.out.println("nro: " + nro + ", color: " + color);
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
