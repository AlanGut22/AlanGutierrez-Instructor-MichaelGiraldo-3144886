public class Triangulo extends Figura {
	public Double medidaBase;
	public Double medidaAltura;

	public Triangulo(Double medidaBase, Double medidaAltura, String nombre, Integer numLados, Double perimetro, Double area) {
		super(nombre, numLados, perimetro, area);
		this.medidaBase = medidaBase;
		this.medidaAltura = medidaAltura;
	}
}