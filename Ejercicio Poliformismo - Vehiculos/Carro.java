public class Carro extends Vehiculo {
    public Carro(String nombre, String marca, Integer modelo) {
        super(nombre, marca, modelo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nLos datos del carro son: ");
        System.out.println("La marca es: " + getMarca());
        System.out.println("El modelo es: " + getModelo());
        System.out.println("El nombre es: " + getNombre());
    }

    public void acelerar() {
        System.out.print("\nEl " + getNombre() + " aceleró 20km.");
    }
}