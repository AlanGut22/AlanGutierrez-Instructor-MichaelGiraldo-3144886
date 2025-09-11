import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Gerente gerente = new Gerente(null, null, null);

		System.out.println("Ingrese los datos del gerente: ");
		System.out.print("Ingrese el departamento: ");
		gerente.setDepartamento(scan.nextLine());
		System.out.print("Ingrese el nombre: ");
		gerente.setNombre(scan.nextLine());
		System.out.print("Ingrese el salario: ");
		gerente.setSalario(scan.nextInt());
		System.out.println();

		gerente.mostrarInfo();

		scan.close();
	}
}
