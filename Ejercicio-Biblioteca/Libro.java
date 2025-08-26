public class Libro {
    public String titulo;
    public String autor;
    public Integer codigo;
    public boolean disponible;

    public Libro(String titulo, String autor, Integer codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponible = true;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo + " - Título: " + titulo + " - Autor: " + autor + " - Disponible: " + disponible);
    }

    public void marcarPrestado() {
        disponible = false;
    }

    public void marcarDisponible() {
        disponible = true;
    }
}