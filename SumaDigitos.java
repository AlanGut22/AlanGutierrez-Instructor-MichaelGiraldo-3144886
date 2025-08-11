import java.util.Scanner;

public class SumaDigitos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresa un número entero: ");
		Integer num = scan.nextInt();

		Integer suma = 0;

		while (num > 0) {
			Integer digito = num % 10;
			suma += digito;
			num /= 10;
		}

		System.out.println("La suma de los dígitos es: " + suma);
		scan.close();
	}
}