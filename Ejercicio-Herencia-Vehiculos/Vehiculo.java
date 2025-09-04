public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo(){
        System.out.println("Los datos del vehiculo son:");
        System.out.println("La marca es: " + getMarca());
        System.out.println("El modelo es: " +  getModelo());
    }

    public String getMarca() {
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
}