package ArraydeObjetos;

public class MainPlantel {

    public static void main(String[] args) {
        // 1. Instanciación del plantel con capacidad acotada a 3
        Plantel plantel = new Plantel(3);

        System.out.println("=== 1. Carga de Jugadores ===");
        Jugador j1 = new Jugador("Lionel Messi", 10, 800);
        Jugador j2 = new Jugador("Ángel Di María", 11, 250);
        Jugador j3 = new Jugador("Emiliano Martínez", 23, 0);

        plantel.agregar(j1);
        plantel.agregar(j2);
        plantel.agregar(j3);

        // Intento de agregar un cuarto jugador excediendo la capacidad
        Jugador j4 = new Jugador("Julián Álvarez", 9, 120);
        boolean agregado = plantel.agregar(j4);
        System.out.println("¿Se pudo agregar el 4to jugador?: " + agregado);

        // Mostrar listado actual
        plantel.listarPlantel();

        System.out.println("\n=== 2. Búsquedas ===");
        // Búsqueda por dorsal existente
        Jugador encontradoDorsal = plantel.buscarPorDorsal(10);
        if (encontradoDorsal != null) {
            System.out.println("Encontrado por dorsal: " + encontradoDorsal);
        } else {
            System.out.println("Jugador no encontrado.");
        }

        // Búsqueda por dorsal inexistente
        Jugador noEncontrado = plantel.buscarPorDorsal(99);
        System.out.println("Búsqueda dorsal 99: " + (noEncontrado == null ? "No existe" : noEncontrado));

        // Búsqueda por nombre
        Jugador encontradoNombre = plantel.buscarPorNombre("Ángel Di María");
        if (encontradoNombre != null) {
            System.out.println("Encontrado por nombre: " + encontradoNombre);
        }

        System.out.println("\n=== 3. Eliminación ===");
        // Eliminar jugador por dorsal
        boolean eliminado = plantel.eliminarPorDorsal(11);
        System.out.println("¿Se eliminó el dorsal 11?: " + eliminado);

        // Mostrar plantel actualizado
        plantel.listarPlantel();

        // Ahora hay lugar disponible para sumar a Julián Álvarez
        System.out.println("\n=== 4. Reintentar Inserción ===");
        plantel.agregar(j4);
        plantel.listarPlantel();
    }
}