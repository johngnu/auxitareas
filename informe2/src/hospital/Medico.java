package hospital;

public class Medico {

    private String nombre;
    private String experiencia;
    private int edad;

    public Medico(String nombre, String experiencia, int edad) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("nombre: " + nombre + ", edad: " + edad + ", experiencia: " + experiencia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
