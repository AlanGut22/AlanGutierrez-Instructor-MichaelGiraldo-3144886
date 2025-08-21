import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void prestarLibro(String idUsuario, String codigoLibro, Integer diaActual) {
        Usuario usuario = buscarUsuario(idUsuario);
        Libro libro = buscarLibro(codigoLibro);

        if (usuario != null && libro != null && libro.isDisponible()) {
            if (usuario.agregarPrestamo(libro)) {
                libro.marcarPrestado();
                Integer fechaLimite = diaActual + 7;
                Prestamo prestamo = new Prestamo(usuario, libro, diaActual, fechaLimite);
                prestamos.add(prestamo);
                System.out.println("Libro prestado correctamente. Devuélvalo antes del día " + fechaLimite);
            }
        } else {
            System.out.println("No se puede realizar el préstamo.");
        }
    }

    public void devolverLibro(String idUsuario, String codigoLibro, Integer diaActual) {
        Prestamo prestamoEncontrado = null;

        for (Prestamo p : prestamos) {
            if (p.getUsuario().getIdUsuario().equals(idUsuario) && p.getLibro().getCodigo().equals(codigoLibro)) {
                prestamoEncontrado = p;
                break;
            }
        }

        if (prestamoEncontrado != null) {
            Integer retraso = diaActual - prestamoEncontrado.getFechaLimite();
            if (retraso > 0) {
                Integer multa = retraso * 500;
                System.out.println("Devolución tardía. Multa: $" + multa);
            } else {
                System.out.println("Libro devuelto a tiempo, sin multa.");
            }

            prestamoEncontrado.getLibro().marcarDisponible();
            prestamoEncontrado.getUsuario().devolverLibro(prestamoEncontrado.getLibro());
            prestamos.remove(prestamoEncontrado);
        } else {
            System.out.println("No se encontró el préstamo.");
        }
    }

    public void mostrarLibrosDisponibles() {
        for (Libro l : libros) {
            if (l.isDisponible()) {
                l.mostrarDatos();
            }
        }
    }

    public void mostrarUsuarios() {
        for (Usuario u : usuarios) {
            u.mostrarDatos();
        }
    }

    public void mostrarHistorialPrestamos() {
        for (Prestamo p : prestamos) {
            p.mostrarDatos();
        }
    }

    private Usuario buscarUsuario(String idUsuario) {
        for (Usuario u : usuarios) {
            if (u.getIdUsuario().equals(idUsuario)) {
                return u;
            }
        }
        return null;
    }

    private Libro buscarLibro(String codigo) {
        for (Libro l : libros) {
            if (l.getCodigo().equals(codigo)) {
                return l;
            }
        }
        return null;
    }
}