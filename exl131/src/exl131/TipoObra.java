package exl131;

public class TipoObra {

    private String idTip;
    private String nomTip;
    private int costoNal;
    private int costoExt;

    public TipoObra(String idTip, String nomTip, int costoNal, int costoExt) {
        this.idTip = idTip;
        this.nomTip = nomTip;
        this.costoNal = costoNal;
        this.costoExt = costoExt;
    }

    public void mostrar() {
        System.out.println("idTip: " + idTip + " nomTip: " + nomTip + " costoNal: " + costoNal + " costoExt: " + costoExt);
    }

    public String getIdTip() {
        return idTip;
    }

    public void setIdTip(String idTip) {
        this.idTip = idTip;
    }

    public String getNomTip() {
        return nomTip;
    }

    public void setNomTip(String nomTip) {
        this.nomTip = nomTip;
    }

    public int getCostoNal() {
        return costoNal;
    }

    public void setCostoNal(int costoNal) {
        this.costoNal = costoNal;
    }

    public int getCostoExt() {
        return costoExt;
    }

    public void setCostoExt(int costoExt) {
        this.costoExt = costoExt;
    }

}
