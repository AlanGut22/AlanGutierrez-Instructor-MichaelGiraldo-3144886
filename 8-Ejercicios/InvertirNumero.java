import java.util.Scanner;

public class InvertirNumero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresa un número entero: ");
		Integer num = scan.nextInt();

		Integer original = num;
		Integer invertido = 0;

		while (num > 0) {
			Integer digito = num % 10;
			invertido = invertido * 10 + digito;
			num /= 10;
		}

		System.out.println("Número invertido de " + original + " es: " + invertido);
		scan.close();
	}
}