public class Circulo extends Figura {
    private String radio;

    public Circulo(String radio, String color) {
        super(color);
        this.radio = radio;
    }

    public void mostrarInfo() {
        System.out.println("Los datos del circulo son:");
        System.out.println("El color es: " + getColor());
        System.out.println("El radio es: " + getRadio());
    }

    public String getRadio() {
        return radio;
    }
    public void setRadio(String radio) {
        this.radio = radio;
    }
}