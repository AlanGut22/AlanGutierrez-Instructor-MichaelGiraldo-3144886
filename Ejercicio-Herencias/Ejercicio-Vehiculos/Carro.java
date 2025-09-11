public class Carro extends Vehiculo {
    private Integer numPuertas;

    public Carro(Integer numPuertas, String marca, String modelo, Integer año) {
        super(marca, modelo, año);
        this.numPuertas = numPuertas;
    }

    public void mostrarInfo() {
        System.out.println("Los datos del vehiculo son:");
        System.out.println("La marca es: " + getMarca());
        System.out.println("El modelo es: " + getModelo());
        System.out.println("El año es: " + getAño());
        System.out.println("El numero de puertas es: " + getNumPuertas());
    }

    public Integer getNumPuertas() {
        return this.numPuertas;
    }
}