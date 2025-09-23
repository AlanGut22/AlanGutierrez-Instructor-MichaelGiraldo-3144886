public class Moto extends Vehiculo{
    public Moto(String nombre, String marca, Integer modelo) {
        super(nombre, marca, modelo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nLos datos de la moto son: ");
        System.out.println("El nombre es: " + getNombre());
        System.out.println("La marca es: " + getMarca());
        System.out.println("El modelo es: " + getModelo());
    }

    public void acelerar() {
        System.out.print("\nLa " + getNombre() + " aceleró 50km y luego frenó.");
    }
}