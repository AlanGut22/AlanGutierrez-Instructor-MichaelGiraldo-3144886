import java.util.Scanner;

public class ContarDigitos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresa un número entero: ");
		Integer num = scan.nextInt();

		Integer contador = 0;

		if (num == 0) {
			contador = 1;
		} else {
			while (num > 0) {
				num = num / 10;
				contador++;
			}
		}

		System.out.println("El número tiene " + contador + " dígitos.");
		scan.close();
	}
}