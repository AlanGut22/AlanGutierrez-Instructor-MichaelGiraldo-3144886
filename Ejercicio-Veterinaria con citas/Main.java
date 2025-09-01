import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mascota mascota = new Mascota(null, null, null);
        Cita cita = new Cita(null, null, null, null);

        Scanner scan = new Scanner(System.in);
        Integer contador = 0;

        while (contador != 4) {
            System.out.println("\n===== MENÚ Veterinaria =====");
            System.out.println("1. Registrar mascota");
            System.out.println("2. Agendar cita");
            System.out.println("3. Listado de las citas");
            System.out.println("4. Salir");
            System.out.print("Seleccione opción: ");
            contador = scan.nextInt();
            scan.nextLine();

            switch (contador) {
                case 1:
                    System.out.println("Registre su mascota:");
                    System.out.print("Nombre: ");
                    String nombre = scan.nextLine();
                    System.out.print("Edad: ");
                    Integer edad = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Tipo de Mascota: ");
                    String tipoMascota = scan.nextLine();

                    mascota.agregarMascota(new Mascota(nombre, edad, tipoMascota));
                    break;

                case 2:
                    System.out.print("Nombre de la mascota: ");
                    String nombreMascota = scan.nextLine();

                    Mascota encontrada = mascota.buscarPorNombre(nombreMascota);
                    if (encontrada == null) {
                        System.out.println("Mascota no encontrada. Regístrela primero.");
                        break;
                    }

                    System.out.print("Fecha de la cita: ");
                    String fecha = scan.nextLine();
                    System.out.print("Hora de la cita: ");
                    String hora = scan.nextLine();
                    System.out.print("Motivo de la cita: ");
                    String motivo = scan.nextLine();

                    cita.agendarCita(new Cita(encontrada, fecha, hora, motivo));
                    break;

                case 3:
                    cita.mostrarCitas();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        scan.close();
    }
}