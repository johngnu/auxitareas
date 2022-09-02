package pilas.colas.restaurant;

/**
 *
 * @author helen castillo
 */
public class Comensal {

    private String nombreComensal;
    private PilaPedido pedidos;

    public Comensal(String nombreComensal, PilaPedido pedidos) {
        this.nombreComensal = nombreComensal;
        this.pedidos = pedidos;
    }
    
    public void mostrar() {
        System.out.println("\nNom. comensal: " + nombreComensal);
        pedidos.mostrar();
    }

    public String getNombreComensal() {
        return nombreComensal;
    }

    public void setNombreComensal(String nombreComensal) {
        this.nombreComensal = nombreComensal;
    }

    public PilaPedido getPedidos() {
        return pedidos;
    }

    public void setPedidos(PilaPedido pedidos) {
        this.pedidos = pedidos;
    }

}
