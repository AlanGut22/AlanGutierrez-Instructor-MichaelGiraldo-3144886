import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circulo circulo = new Circulo(null, null);

        System.out.println("Ingrese los datos del circulo: ");
        System.out.print("Ingrese el color: ");
        circulo.setColor(scan.nextLine());
        System.out.print("Ingrese el radio: ");
        circulo.setRadio(scan.nextLine());
        System.out.println();

        circulo.mostrarInfo();

        scan.close();
    }
}