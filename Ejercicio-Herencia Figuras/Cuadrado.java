public class Cuadrado extends Figura {
	public Double medidaLado;

	public Cuadrado(Double medidaLado, String nombre, Integer numLados, Double perimetro, Double area) {
		super(nombre, numLados, perimetro, area);
		this.medidaLado = medidaLado;
	}
}