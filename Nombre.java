//CRUD (Create, Read, Update, Delete)

import java.util.Scanner;

public class Nombre {
	private static final int CANTIDAD_NOMBRES = 5;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nombres = new String[CANTIDAD_NOMBRES];
		int opcion;

		do {
			System.out.println("\n CRUD DE NOMBRES ");
			System.out.println("1. Crear nombres");
			System.out.println("2. Leer nombres");
			System.out.println("3. Actualizar nombre");
			System.out.println("4. Eliminar nombre");
			System.out.println("5. Salir");
			System.out.print("Elegi una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
				case 1:
					cargarNombres(nombres, scanner);
					break;
				case 2:
					listarNombres(nombres);
					break;
				case 3:
					actualizarNombre(nombres, scanner);
					break;
				case 4:
					eliminarNombre(nombres, scanner);
					break;
				case 5:
					System.out.println("Programa finalizado.");
					break;
				default:
					System.out.println("Opción incorrecta.");
			}
		} while (opcion != 5);

		scanner.close();
	}

	private static void cargarNombres(String[] nombres, Scanner scanner) {
		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Ingresa el nombre " + (i + 1) + ": ");
			nombres[i] = scanner.nextLine();
		}
		System.out.println("Los cinco nombres fueron guardados");
	}

	private static void listarNombres(String[] nombres) {
		System.out.println("\nNombres guardados:");
		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i] == null || nombres[i].isBlank()
					? "(vacio)"
					: nombres[i];
			System.out.println((i + 1) + ". " + nombre);
		}
	}

	private static void actualizarNombre(String[] nombres, Scanner scanner) {
		System.out.print("Indica la posición a actualizar 1-5: ");
		int posicion = scanner.nextInt();
		scanner.nextLine();

		if (!posicionValida(posicion)) {
			System.out.println("La posición debe estar entre 1 y 5.");
			return;
		}

		System.out.print("Ingresa el nuevo nombre: ");
		nombres[posicion - 1] = scanner.nextLine();
		System.out.println("Nombre actualizado.");
	}

	private static void eliminarNombre(String[] nombres, Scanner scanner) {
		System.out.print("Indica la posición a eliminar 1-5: ");
		int posicion = scanner.nextInt();
		scanner.nextLine();

		if (!posicionValida(posicion)) {
			System.out.println("La posición debe estar entre 1 y 5.");
			return;
		}

		nombres[posicion - 1] = null;
		System.out.println("Nombre eliminado.");
	}

	private static boolean posicionValida(int posicion) {
		return posicion >= 1 && posicion <= CANTIDAD_NOMBRES;
	}
}