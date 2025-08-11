import java.util.Scanner;

public class VerificarPrimo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresa un número: ");
		Integer num = scan.nextInt();

		Boolean esPrimo = true;

		if (num <= 1) {
			esPrimo = false;
		} else {
			for (Integer i = 2; i < num; i++) {
				if (num % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}

		if (esPrimo) {
			System.out.println(num + " es un número primo.");
		} else {
			System.out.println(num + " no es un número primo.");
		}

		scan.close();
	}
}
