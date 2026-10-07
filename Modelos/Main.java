package Modelos;

/**
 * Clase ejecutable para verificar encapsulamiento, polimorfismo y manejo seguro de memoria.
 */
public class Main {

    public static void main(String[] args) {
        // 1. Instanciación con constructores sobrecargados
        Estudiante est1 = new Estudiante("Ana", "García", 42111222, "TUP", 1001);
        Estudiante est2 = new Estudiante("Carlos", "Pérez", 39888777); // Constructor con carrera por defecto

        // 2. Modificación controlada mediante Setters
        est2.setCarrera("Ingeniería en Sistemas");
        est2.setLegajo(1002);

        // 3. Demostración de recorrido seguro evitando NullPointerException
        Estudiante[] curso = new Estudiante[4];
        curso[0] = est1;
        curso[1] = est2;
        // curso[2] y curso[3] quedan deliberadamente en null

        System.out.println("=== Listado de Estudiantes Registrados ===");
        mostrarEstudiantes(curso);
    }

    /**
     * Recorre un arreglo de objetos filtrando posiciones no inicializadas.
     */
    public static void mostrarEstudiantes(Estudiante[] lista) {
        if (lista == null) {
            return;
        }
        for (Estudiante est : lista) {
            if (est != null) {
                System.out.println(est.toString()); // Ejecuta el toString() sobreescrito
            }
        }
    }
}