import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo carro = new Carro(null, null, null);
        System.out.println("Ingrese los datos del carro: ");
        System.out.print("Nombre: ");
        carro.setNombre(scan.nextLine());
        System.out.print("Marca: ");
        carro.setMarca(scan.nextLine());
        System.out.print("Modelo: ");
        carro.setModelo(scan.nextInt());
        scan.nextLine();

        Vehiculo moto = new Moto(null, null, null);
        System.out.println("\nIngrese los datos de la moto: ");
        System.out.print("Nombre: ");
        moto.setNombre(scan.nextLine());
        System.out.print("Marca: ");
        moto.setMarca(scan.nextLine());
        System.out.print("Modelo: ");
        moto.setModelo(scan.nextInt());
        scan.nextLine();

        vehiculos.add(carro);
        vehiculos.add(moto);

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInfo();
            vehiculo.acelerar();
        }

        scan.close();
    }
}