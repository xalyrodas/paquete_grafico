package src.Libros;

public class libro {
    private String titulo;
    private String autor;
    private String fecha;

    public libro(String titulo, String autor, String fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {

        return autor;
    }

    public String getFecha() {
        return fecha;
    }
    @Override
    public  String toString() {
        return "titulo:" +titulo +"Autor: " + autor + "Fecha " + fecha;
    }
}

