public class Gerente extends Empleado {
	private String departamento;

	public Gerente(String departamento, String nombre, Integer salario) {
		super(nombre, salario);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void mostrarInfo() {
		System.out.println("Los datos del gerente son:");
		System.out.println("El nombre es: " + getNombre());
		System.out.println("El salario es: $" + getSalario());
		System.out.println("El departamento es: " + getDepartamento());
	}
}
