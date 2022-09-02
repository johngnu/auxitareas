package pilas.colas.restaurant;

/**
 *
 * @author helen castillo
 */
public class Combo {

    private int nroCombo;
    private String nombre;
    private int precio;

    public Combo(int nroCombo, String nombre, int precio) {
        this.nroCombo = nroCombo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("nro combo: " + nroCombo + ", nombre: " + nombre + ", precio: " + precio);
    }

    public int getNroCombo() {
        return nroCombo;
    }

    public void setNroCombo(int nroCombo) {
        this.nroCombo = nroCombo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
