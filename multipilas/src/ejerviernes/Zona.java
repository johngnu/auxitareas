package ejerviernes;

/**
 *
 * @author estudiante
 */
public class Zona {

    private String macrodistrito, nombre;
    private PilaIES c = new PilaIES();

    Zona(String a, String b, PilaIES d) {
        macrodistrito = a;
        nombre = b;
        c = d;
    }

    Zona() {
        macrodistrito = " ";
        nombre = " ";
    }

    public String getMacrodistrito() {
        return macrodistrito;
    }

    public void setMacrodistrito(String macrodistrito) {
        this.macrodistrito = macrodistrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PilaIES getC() {
        return c;
    }

    public void setC(PilaIES c) {
        this.c = c;
    }

    public void mostrar() {
        System.out.println(macrodistrito + " " + nombre);
        c.mostrar();
    }

}
