package hospital;

public class Medicamento {

    private String nombre;
    private String fabricante;
    private int stock;

    public Medicamento(String nombre, String fabricante, int stock) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.stock = stock;
    }

    public void mostrar() {
        System.out.println("nombre: " + nombre + ", fabricante:" + fabricante + ", stock: " + stock);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
