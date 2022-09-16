package libro;

public class Libro {

    private String titulo;
    private String autor;
    private int nro_pagians;

    public Libro(String titulo, String autor, int nro_pagians) {
        this.titulo = titulo;
        this.autor = autor;
        this.nro_pagians = nro_pagians;
    }

    public void mostrar() {
        System.out.println("titulo: " + titulo + ", autor: " + autor + ", nro. paginas: " + nro_pagians);
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

    public int getNro_pagians() {
        return nro_pagians;
    }

    public void setNro_pagians(int nro_pagians) {
        this.nro_pagians = nro_pagians;
    }

}
