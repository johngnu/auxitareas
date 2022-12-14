package ejerviernes;

/**
 *
 * @author helen castillo
 */
public class IEducSup {

    private String nombre, direccion;
    private int telefono;

    public IEducSup(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    

    IEducSup() {
        nombre = " ";
        direccion = " ";
        telefono = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void mostrar() {
        System.out.println(nombre + " " + direccion + " " + telefono);
    }
}

