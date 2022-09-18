package multiples.pilas.eje4;

public class Categoria {

    private String nomCategoria;
    private CSimpleTProd tp;
    private MultiCCircularImp imp;

    public Categoria() {
        // TODO Auto-generated constructor stub
    }

    public Categoria(String nomCategoria, CSimpleTProd tp, MultiCCircularImp imp) {
        super();
        this.nomCategoria = nomCategoria;
        this.tp = tp;
        this.imp = imp;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public CSimpleTProd getTp() {
        return tp;
    }

    public void setTp(CSimpleTProd tp) {
        this.tp = tp;
    }

    public MultiCCircularImp getImp() {
        return imp;
    }

    public void setImp(MultiCCircularImp imp) {
        this.imp = imp;
    }

    public void mostrar() {
        System.out.println("Categoria [nomCategoria=" + nomCategoria + "]");
        tp.mostrar();
        imp.mostrar();
    }

    public void leer() {

    }
}
