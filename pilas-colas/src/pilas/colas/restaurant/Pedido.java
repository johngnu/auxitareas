package pilas.colas.restaurant;

/**
 *
 * @author helen castillo
 */
public class Pedido {

    private int nroCombo;
    private int cantidad;

    public Pedido(int nroCombo, int cantidad) {
        this.nroCombo = nroCombo;
        this.cantidad = cantidad;
    }
    
    public void mostrar() {
        System.out.println("nro combo: " + nroCombo + ", cantidad: " + cantidad);
    }

    public int getNroCombo() {
        return nroCombo;
    }

    public void setNroCombo(int nroCombo) {
        this.nroCombo = nroCombo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
