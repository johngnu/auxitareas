/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajes;

/**
 *
 * @author desktop
 */
public class Viaje {
    private String id_destino;
    private String nom_cliente;
    private String tipo_transporte;

    public Viaje(String id_destino, String nom_cliente, String tipo_transporte) {
        this.id_destino = id_destino;
        this.nom_cliente = nom_cliente;
        this.tipo_transporte = tipo_transporte;
    }
    public void mostrar(){
        System.out.println("id_destino: " + id_destino + ", nom_cliente: " + nom_cliente + ", tipo_transporte: " + tipo_transporte);
    }

    public String getId_destino() {
        return id_destino;
    }

    public void setId_destino(String id_destino) {
        this.id_destino = id_destino;
    }

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public String getTipo_transporte() {
        return tipo_transporte;
    }

    public void setTipo_transporte(String tipo_transporte) {
        this.tipo_transporte = tipo_transporte;
    }
    
    
    
    
}
