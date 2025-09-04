public class Circulo extends Figura {
	public Double radio;

	public Circulo(Double radio, String nombre, Integer numLados, Double perimetro, Double area) {
		super(nombre, numLados, perimetro, area);
		this.radio = radio;
	}
}