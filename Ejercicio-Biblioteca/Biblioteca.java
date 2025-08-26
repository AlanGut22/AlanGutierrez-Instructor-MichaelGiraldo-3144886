import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Libro> listaLibros;
    public ArrayList<Usuario> listaUsuarios;
    public ArrayList<RegistroPrestamo> prestamo = new ArrayList<>();;

    public Biblioteca() {
        this.listaLibros = new ArrayList<Libro>();
        this.listaUsuarios = new ArrayList<Usuario>();
    }

    public class RegistroPrestamo {
        Usuario usuario;
        Libro libro;
        Integer fechaInicio;
        Integer fechaLimite;

        public RegistroPrestamo(Usuario usuario, Libro libro, Integer fechaInicio, Integer fechaLimite) {
            this.usuario = usuario;
            this.libro = libro;
            this.fechaInicio = fechaInicio;
            this.fechaLimite = fechaLimite;
        }
    }

    public void registrarLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("Libro registrado: " + libro.titulo);
    }

    public void registrarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.nombre);
    }

    public void prestarLibro(Integer codigoLibro, Integer idUsuario, Integer fechaInicio) {
        Libro libro = buscarLibro(codigoLibro);
        Usuario usuario = buscarUsuario(idUsuario);

        if (libro == null || usuario == null) {
            System.out.println("Libro o usuario no encontrado.");
            return;
        }

        if (libro.disponible == false) {
            System.out.println("El libro no está disponible.");
            return;
        }

        if (usuario.librosPrestados.size() == 3) {
            System.out.println("El usuario " + usuario.nombre + " ya tiene el máximo de 3 libros prestados.");
            return;
        }
        usuario.agregarPrestamo(libro);

        libro.marcarPrestado();
        Integer fechaLimite = fechaInicio + 7;
        prestamo.add(new RegistroPrestamo(usuario, libro, fechaInicio, fechaLimite));
        System.out.println("Libro prestado. Fecha límite: día " + fechaLimite);
    }

    public void devolverLibro(Integer codigoLibro, Integer idUsuario, Integer fechaInicio) {
        Libro libro = buscarLibro(codigoLibro);
        Usuario usuario = buscarUsuario(idUsuario);

        if (libro == null || usuario == null || usuario.devolverLibro(libro) != true) {
            System.out.println("Error al devolver el libro.");
            return;
        }

        libro.marcarDisponible();

        for (int i = 0; i < prestamo.size(); i++) {
            RegistroPrestamo registro = prestamo.get(i);

            if (registro.libro.codigo == codigoLibro && registro.usuario.idUsuario == idUsuario) {
                Integer diasRetraso = fechaInicio - registro.fechaLimite;
                if (diasRetraso > 0) {
                    System.out.println("Multa por retraso: $" + (diasRetraso * 500));
                } else {
                    System.out.println("Libro devuelto a tiempo. Sin multa.");
                }
                prestamo.remove(i);
                break;
            }
        }
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles:");
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro libro = listaLibros.get(i);
            if (libro.disponible) {
                libro.mostrarDatos();
            }
        }

    }

    public void mostrarUsuarios() {
        System.out.println("Usuarios:");
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuario = listaUsuarios.get(i);
            usuario.mostrarDatos();
        }
    }

    public void mostrarHistorialPrestamos() {
        System.out.println("Historial de préstamos:");

        for (int i = 0; i < prestamo.size(); i++) {
            RegistroPrestamo registro = prestamo.get(i);
            System.out.println("Usuario: " + registro.usuario.nombre + " - Libro: " + registro.libro.titulo + " - Inicio: Día " + registro.fechaInicio + " - Límite: Día " + registro.fechaLimite);
        }
    }

    public Libro buscarLibro(Integer codigo) {
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro libro = listaLibros.get(i);
            if (libro.codigo == codigo) {
                return libro;
            }
        }
        return null;
    }

    public Usuario buscarUsuario(Integer idUsuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuario = listaUsuarios.get(i);
            if (usuario.idUsuario == idUsuario) {
                return usuario;
            }
        }
        return null;
    }
}