public class Vehiculo {
    private String nombre;
    private String marca;
    private Integer modelo;

    public Vehiculo(String nombre, String marca, Integer modelo) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getMarca() {
        return this.marca;
    }

    public Integer getModelo() {
        return this.modelo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Los datos del vehiculo son: ");
        System.out.println("El nombre es: " + getNombre());
        System.out.println("La marca es: " + getMarca());
        System.out.println("El modelo es: " + getModelo());
    }

    public void acelerar() {
        System.out.print("El vehiculo aceleró.");
    }
}