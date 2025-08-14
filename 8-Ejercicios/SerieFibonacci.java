import java.util.Scanner;

public class SerieFibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("¿Cuántos términos de la serie Fibonacci deseas ver?: ");
		Integer num = scan.nextInt();

		if (num <= 0) {
			System.out.println("Debes ingresar un número mayor que 0.");
			return;
		}

		Integer a = 0;
		Integer b = 1;

		System.out.println("Los primeros " + num + " términos de la serie Fibonacci son:");

		for (Integer i = 0; i < num; i++) {
			System.out.print(a + " ");

			Integer siguiente = a + b;
			a = b;
			b = siguiente;
		}

		scan.close();
	}
}