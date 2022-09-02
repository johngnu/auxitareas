package tarea;

public class Zona {

    private String macrodistrito, nombre;
    private ColaIES c = new ColaIES();

    Zona(String a, String b, ColaIES d) {
        macrodistrito = a;
        nombre = b;
        c = d;
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

    public ColaIES getC() {
        return c;
    }

    public void setC(ColaIES c) {
        this.c = c;
    }

    public void mostrar() {
        System.out.println(macrodistrito + " " + nombre);
        c.mostrar();
    }
    
}
