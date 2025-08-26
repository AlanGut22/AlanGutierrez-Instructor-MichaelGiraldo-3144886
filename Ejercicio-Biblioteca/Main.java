import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Scanner scanner = new Scanner(System.in);
		Integer opcion;
		Integer diaActual = 0;

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
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
				case 1:
					System.out.print("Título: ");
					String titulo = scanner.nextLine();
					System.out.print("Autor: ");
					String autor = scanner.nextLine();
					System.out.print("Código: ");
					Integer codigo = scanner.nextInt();
					biblioteca.registrarLibro(new Libro(titulo, autor, codigo));
					break;

				case 2:
					System.out.print("Nombre: ");
					String nombre = scanner.nextLine();
					System.out.print("ID Usuario: ");
					Integer idUsuario = scanner.nextInt();
					biblioteca.registrarUsuario(new Usuario(nombre, idUsuario));
					break;

				case 3:
					System.out.print("ID Usuario: ");
					Integer idUsuarioPrestamo = scanner.nextInt();
					System.out.print("Código Libro: ");
					Integer codigoLibroPrestamo = scanner.nextInt();
					biblioteca.prestarLibro(codigoLibroPrestamo, idUsuarioPrestamo, diaActual);
					break;

				case 4:
					System.out.print("ID Usuario: ");
					Integer idUsuarioDevolucion = scanner.nextInt();
					System.out.print("Código Libro: ");
					Integer codigoLibroDevolucion = scanner.nextInt();
					biblioteca.devolverLibro(codigoLibroDevolucion, idUsuarioDevolucion, diaActual);
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
		scanner.close();
	}
}