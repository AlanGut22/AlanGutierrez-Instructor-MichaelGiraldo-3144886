import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese los datos del carro: ");
        System.out.print("Ingrese la marca: ");
        String marca = scan.nextLine();
        System.out.print("Ingrese el modelo: ");
        String modelo = scan.nextLine();
        System.out.print("Ingrese el año: ");
        Integer año = scan.nextInt();
        System.out.print("Ingrese el número de puertas: ");
        Integer numPuertas = scan.nextInt();
        System.out.println();

        Carro carro = new Carro(numPuertas, marca, modelo, año);

        carro.mostrarInfo();

        scan.close();
    }
}