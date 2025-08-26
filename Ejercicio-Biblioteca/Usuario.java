import java.util.ArrayList;

public class Usuario {
    public String nombre;
    public Integer idUsuario;
    public ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, Integer idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<>();
    }

    public void mostrarDatos() {
        System.out.println("Usuario: " + nombre + " - ID: " + idUsuario + " - Libros prestados: " + librosPrestados.size());
    }

    public boolean agregarPrestamo(Libro libro) {
        if (librosPrestados.size() <= 3) {
            librosPrestados.add(libro);
            return true;
        } else {
            System.out.println("El usuario ya tiene el máximo de 3 libros prestados.");
            return false;
        }
    }

    public boolean devolverLibro(Libro libro) {
        return librosPrestados.remove(libro);
    }
}