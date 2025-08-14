import java.util.Scanner;

public class NumeroPerfecto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresa un número entero positivo: ");
		Integer num = scan.nextInt();

		if (num <= 0) {
			System.out.println("El número debe ser mayor que 0.");
			return;
		}

		Integer suma = 0;

		for (Integer i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				suma += i;
			}
		}

		if (suma == num) {
			System.out.println(num + " es un número perfecto.");
		} else {
			System.out.println(num + " no es un número perfecto.");
		}

		scan.close();
	}
}