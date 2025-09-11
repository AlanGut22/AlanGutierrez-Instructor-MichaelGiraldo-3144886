public class Alimento extends Producto{
	private String fechaVencimiento;

	public Alimento(String nombre, Integer precio, String fechaVencimiento) {
		super(nombre, precio);
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public void mostrarInfo() {
		System.out.println("Los datos del alimento son:");
		System.out.println("El nombre es: " + getNombre());
		System.out.println("El precio es: $" + getPrecio());
		System.out.println("La fecha de vencimiento es: " + getFechaVencimiento());
	}	
}
