package biblioteca;

public class MainBiblioteca {

    public static void main(String[] args) {

        // new Libro(); // No compila: al declarar constructores propios, Java elimina el constructor por defecto sin parámetros.

        Libro libroPruebaInvalido = new Libro("", "Autor Anónimo", "000-000", 2, 12000.0);
        libroPruebaInvalido.getTitulo();

        Libro libro1 = new Libro("Clean Code", "Robert C. Martin", "9780132350884");
        boolean precioAceptado = libro1.setPrecioReposicion(-100.0);
        System.out.println("¿Se aceptó el precio -100.0? " + precioAceptado + " (se mantiene el precio anterior)\n");

        Libro libro2 = new Libro("Efectivo con Java", "Ana Restrepo", "9781234567897", 3, 22000.0);
        Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "9780307474728", 2, 18500.0);

        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();

        libro1.prestar();
        libro1.prestar();
        libro1.devolver();

        double precioAnterior = libro1.getPrecioReposicion();
        if (libro1.setPrecioReposicion(18000.0)) {
            System.out.println("Precio de reposición actualizado de \"" + libro1.getTitulo() + "\": $" + precioAnterior + " -> $" + libro1.getPrecioReposicion());
        }
    }
}