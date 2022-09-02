package pilas.colas.libro;

/**
 *
 * @author helen castillo
 */
public class Libro {

    private String titulo;
    private String autor;
    private int nroPaginas;

    public Libro(String titulo, String autor, int nroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public void mostrarLibro() {
        System.out.println("titulo: " + titulo + ", autor: " + autor + ", nro paginas: " + nroPaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

}
