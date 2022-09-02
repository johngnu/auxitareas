package pilas.colas.alimentos;

/**
 *
 * @author helen castillo
 */
public class Alimento {

    private String nombre;
    private int precio;

    public Alimento(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("nombre: " + nombre + ", precio: " + precio);
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
