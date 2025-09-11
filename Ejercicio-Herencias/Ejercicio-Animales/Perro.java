public class Perro extends Animal{
    private String raza;


    public Perro(String raza, String nombre, Integer edad){
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrarInfo(){
        System.out.println("Los datos del perro son:");
        System.out.println("El nombre es: " + getNombre());
        System.out.println("La edad es: " + getEdad());
        System.out.println("La raza es: " + getRaza());
    }
}
