package ArraydeObjetos;

public class Plantel {
    private Jugador[] jugadores;
    private int cantidad;

    public Plantel(int capacidadInicial) {
        if (capacidadInicial <= 0) {
            this.jugadores = new Jugador[5];
            System.out.println("El plantel se inicializó con 5 jugadores");
        } else {
            this.jugadores = new Jugador[capacidadInicial];
        }
        this.cantidad = 0;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public int getCapacidad() {
        return this.jugadores.length;
    }

    public boolean agregar(Jugador nuevoJugador) {
        if (nuevoJugador != null) {
            if (this.cantidad < this.jugadores.length) {
                this.jugadores[this.cantidad] = nuevoJugador;
                this.cantidad++;
                return true;
            } else {
                System.out.println("No hay lugar para agregar un nuevo jugador");
                return false;
            }
        } else {
            System.out.println("Jugador no valido");
            return false;
        }
    }

    public Jugador buscarPorDorsal(int dorsal) {
        for (int i = 0; i < this.cantidad; i++) {
            if (this.jugadores[i].getDorsal() == dorsal) {
                return this.jugadores[i];
            }
        }
        return null;
    }

    public Jugador buscarPorNombre(String nombre) {
        for (int i = 0; i < this.cantidad; i++) {
            if (this.jugadores[i].getNombre().equalsIgnoreCase(nombre)) {
                return this.jugadores[i];
            }
        }
        return null;
    }

    public boolean eliminarPorDorsal(int dorsal) {
        int indice = -1;
        for (int i = 0; i < this.cantidad; i++) {
            if (this.jugadores[i].getDorsal() == dorsal) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            return false;
        }

        Jugador[] jugadoresUnMenos = new Jugador[this.jugadores.length];
        int nuevoIndice = 0;
        for (int i = 0; i < this.cantidad; i++) {
            if (i != indice) {
                jugadoresUnMenos[nuevoIndice] = this.jugadores[i];
                nuevoIndice++;
            }
        }

        this.jugadores = jugadoresUnMenos;
        this.cantidad--;
        return true;
    }

    public void listarPlantel() {
        if (this.cantidad == 0) {
            System.out.println("El plantel está vacío.");
            return;
        }
        System.out.println("--- Lista de Jugadores (" + this.cantidad + "/" + this.jugadores.length + ") ---");
        for (int i = 0; i < this.cantidad; i++) {
            System.out.println((i + 1) + ". " + this.jugadores[i]);
        }
    }
}