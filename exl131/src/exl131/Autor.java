package exl131;

import java.util.Stack;

public class Autor {
    
    private String ci;
    private String nomAut;
    private String dirAut;
    private String nacionalidad;
    private Stack<Obra> obras;
    
    public Autor(String ci, String nomAut, String dirAut, Stack<Obra> obras) {
        this.ci = ci;
        this.nomAut = nomAut;
        this.dirAut = dirAut;
        this.obras = obras;
    }
    
    public void mostrar() {
        System.out.println("ci: " + ci + " nombre: " + nomAut + " nacionalidad" + nacionalidad);
        mostrar(obras);
    }
    
    public void mostrar(Stack<Obra> miStack) {
        Stack<Obra> aux = new Stack<Obra>();
        while (!miStack.isEmpty()) {
            Obra elem = miStack.pop();
            aux.push(elem);
            elem.mostrar();
        }
        vaciar(miStack, aux);
    }
    
    public void vaciar(Stack<Obra> miStack, Stack<Obra> aux) {
        while (!aux.isEmpty()) {
            miStack.push(aux.pop());
        }
    }
    
    public String getCi() {
        return ci;
    }
    
    public void setCi(String ci) {
        this.ci = ci;
    }
    
    public String getNomAut() {
        return nomAut;
    }
    
    public void setNomAut(String nomAut) {
        this.nomAut = nomAut;
    }
    
    public String getDirAut() {
        return dirAut;
    }
    
    public void setDirAut(String dirAut) {
        this.dirAut = dirAut;
    }
    
    public Stack<Obra> getObras() {
        return obras;
    }
    
    public void setObras(Stack<Obra> obras) {
        this.obras = obras;
    }
    
}
