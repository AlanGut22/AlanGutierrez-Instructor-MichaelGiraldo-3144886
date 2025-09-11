import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perro perro = new Perro(null, null, null);

        System.out.println("Ingrese los datos del perro: ");
        System.out.print("Ingrese la raza: ");
        perro.setRaza(scanner.nextLine());
        System.out.print("Ingrese el nombre: ");
        perro.setNombre(scanner.nextLine());
        System.out.print("Ingrese la edad: ");
        perro.setEdad(scanner.nextInt());
        System.out.println();

        perro.mostrarInfo();
        scanner.close();
    }
}
