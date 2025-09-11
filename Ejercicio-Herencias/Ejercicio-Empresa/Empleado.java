public class Empleado {
	private String nombre;
	private Integer salario;

	public Empleado(String nombre, Integer salario) {
		this.nombre = nombre;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}
}
