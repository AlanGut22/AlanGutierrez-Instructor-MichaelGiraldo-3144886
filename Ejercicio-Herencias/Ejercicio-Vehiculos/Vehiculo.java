public class Vehiculo {
    private String marca;
    private String modelo;
    private Integer año;

    public Vehiculo(String marca, String modelo, Integer año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Integer getAño() {
        return año;
    }
}