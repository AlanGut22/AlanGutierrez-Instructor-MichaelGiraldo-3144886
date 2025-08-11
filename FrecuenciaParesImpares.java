import java.util.Scanner;

public class FrecuenciaParesImpares {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Integer pares = 0;
		Integer impares = 0;

		System.out.println("Ingresa 10 números enteros:");

		for (Integer i = 1; i <= 10; i++) {
			System.out.print("Número " + i + ": ");
			Integer num = scan.nextInt();

			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("Cantidad de números pares: " + pares);
		System.out.println("Cantidad de números impares: " + impares);

		scan.close();
	}
}