public class Carro extends Vehiculo {
    private int numPuertas;

    public Carro(int numPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    public void mostrarInfoCarro(){
        System.out.println("El numero de puertas es: " + getNumPuertas());
    }

    public int getNumPuertas(){
        return this.numPuertas;
    }
}