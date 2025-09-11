import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Alimento alimento = new Alimento(null, null, null);

		System.out.println("Ingrese los datos del alimento");
		System.out.print("Ingrese el nombre del alimento:");
		alimento.setNombre(scan.nextLine());
		System.out.print("Ingrese el precio del alimento:");
		alimento.setPrecio(scan.nextInt());
		scan.nextLine();
		System.out.print("Ingrese la fecha de vencimiento del alimento:");
		alimento.setFechaVencimiento(scan.nextLine());
		System.out.println();

		alimento.mostrarInfo();

		scan.close();
	}
}
