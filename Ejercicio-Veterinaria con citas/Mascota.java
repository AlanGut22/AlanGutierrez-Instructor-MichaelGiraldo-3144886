import java.util.ArrayList;

public class Mascota {
    public String nombre;
    public Integer edad;
    public String tipoMascota;
    public ArrayList<Mascota> listaMascotas;

    public Mascota(String nombre, Integer edad, String tipoMascota) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoMascota = tipoMascota;
        this.listaMascotas = new ArrayList<Mascota>();
    }

    public void agregarMascota(Mascota mascota) {
        this.listaMascotas.add(mascota);
        System.out.println("Mascota registrada: " + mascota.nombre + ", " + mascota.edad + ", " + mascota.tipoMascota);
    }

    public Mascota buscarPorNombre(String nombre) {
        for (int i = 0; i < this.listaMascotas.size(); i++) {
            Mascota mascota = this.listaMascotas.get(i);
            if (mascota.nombre != null && mascota.nombre.equalsIgnoreCase(nombre)) {
                return mascota;
            }
        }
        return null;
    }
}