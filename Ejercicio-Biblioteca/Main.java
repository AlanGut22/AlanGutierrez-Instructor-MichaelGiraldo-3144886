import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Scanner sc = new Scanner(System.in);
		Integer opcion, diaActual = 0;

		do {
			System.out.println("\n===== MENÚ BIBLIOTECA =====");
			System.out.println("1. Registrar libro");
			System.out.println("2. Registrar usuario");
			System.out.println("3. Prestar libro");
			System.out.println("4. Devolver libro");
			System.out.println("5. Mostrar libros disponibles");
			System.out.println("6. Mostrar usuarios");
			System.out.println("7. Mostrar historial de préstamos");
			System.out.println("8. Avanzar día");
			System.out.println("9. Salir");
			System.out.print("Seleccione opción: ");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
				case 1:
					System.out.print("Título: ");
					String titulo = sc.nextLine();
					System.out.print("Autor: ");
					String autor = sc.nextLine();
					System.out.print("Código: ");
					String codigo = sc.nextLine();
					biblioteca.registrarLibro(new Libro(titulo, autor, codigo));
					break;
				case 2:
					System.out.print("Nombre: ");
					String nombre = sc.nextLine();
					System.out.print("ID Usuario: ");
					String id = sc.nextLine();
					biblioteca.registrarUsuario(new Usuario(nombre, id));
					break;
				case 3:
					System.out.print("ID Usuario: ");
					String idP = sc.nextLine();
					System.out.print("Código Libro: ");
					String codP = sc.nextLine();
					biblioteca.prestarLibro(idP, codP, diaActual);
					break;
				case 4:
					System.out.print("ID Usuario: ");
					String idD = sc.nextLine();
					System.out.print("Código Libro: ");
					String codD = sc.nextLine();
					biblioteca.devolverLibro(idD, codD, diaActual);
					break;
				case 5:
					biblioteca.mostrarLibrosDisponibles();
					break;
				case 6:
					biblioteca.mostrarUsuarios();
					break;
				case 7:
					biblioteca.mostrarHistorialPrestamos();
					break;
				case 8:
					diaActual++;
					System.out.println("Día avanzado. Ahora es día " + diaActual);
					break;
				case 9:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción inválida.");
			}
		} while (opcion != 9);

		sc.close();
	}
}