/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerviernes;

/**
 *
 * @author desktop
 */
public class IEducSup {

    private String nombre, direccion;
    private int telefono;

    IEducSup(String a, String b, int c) {
        nombre = a;
        direccion = b;
        telefono = c;
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

