import java.util.ArrayList;

public class Cita {
    public String fecha;
    public String hora;
    public String motivo;
    public Mascota mascota;
    public ArrayList<Cita> listaCitas;

    public Cita(Mascota mascota, String fecha, String hora, String motivo) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.mascota = mascota;
        this.listaCitas = new ArrayList<Cita>();
    }

    public void agendarCita(Cita cita) {
        this.listaCitas.add(cita);
        System.out.println("Cita agendada.");
    }

    public void mostrarCitas() {
        System.out.println("\n--- Lista de citas ---");
        for (int i = 0; i < this.listaCitas.size(); i++) {
            Cita cita = this.listaCitas.get(i);
            String nombreMascota = cita.mascota.nombre;
            System.out.println("Cita para " + nombreMascota + " (" + cita.mascota.tipoMascota + ") el " + cita.fecha + " a las " + cita.hora + " por " + cita.motivo);
        }
    }
}