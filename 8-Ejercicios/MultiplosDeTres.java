import java.util.Scanner;

public class MultiplosDeTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa un número N: ");
        Integer num = scan.nextInt();

        System.out.println("Múltiplos de 3 desde 1 hasta " + num + ":");

        for (Integer i = 3; i <= num; i += 3) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}

