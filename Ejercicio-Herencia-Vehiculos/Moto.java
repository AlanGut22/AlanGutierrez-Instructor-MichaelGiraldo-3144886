public class Moto extends Vehiculo{
    private int cilindraje;

    public Moto(int cilindraje, String marca, String modelo) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
    }

    public void mostrarInfoMoto(){
        System.out.println("El numero del cilindraje es: " + getCilindraje());
    }

    public int getCilindraje(){
        return this.cilindraje;
    }
}