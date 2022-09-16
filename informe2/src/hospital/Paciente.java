package hospital;

public class Paciente {

    private String nombre;
    private String dolencia;
    private int edad;

    public Paciente(String nombre, String dolencia, int edad) {
        this.nombre = nombre;
        this.dolencia = dolencia;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("nombre: " + nombre + ", dolencia: " + dolencia + ", edad:" + edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDolencia() {
        return dolencia;
    }

    public void setDolencia(String dolencia) {
        this.dolencia = dolencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
