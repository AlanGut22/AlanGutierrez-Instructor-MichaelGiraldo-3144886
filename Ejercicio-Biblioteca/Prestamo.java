public class Prestamo {
	private Usuario usuario;
	private Libro libro;
	private Integer fechaInicio;
	private Integer fechaLimite; 

	public Prestamo(Usuario usuario, Libro libro, Integer fechaInicio, Integer fechaLimite) {
		this.usuario = usuario;
		this.libro = libro;
		this.fechaInicio = fechaInicio;
		this.fechaLimite = fechaLimite;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Libro getLibro() {
		return libro;
	}

	public Integer getFechaLimite() {
		return fechaLimite;
	}

	public void mostrarDatos() {
		System.out.println("Usuario: " + usuario.getIdUsuario() + " | Libro: " + libro.getCodigo() + " | Inicio: Día " + fechaInicio + " | Límite: Día " + fechaLimite);
	}
}