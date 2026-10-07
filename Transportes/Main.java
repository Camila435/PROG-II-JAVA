package Transportes;

public class Main {
    public static void main(String[] args) {
        Terrestre auto = new Terrestre(200, 10, 10000, 4);
        Acuatico barco = new Acuatico(500, 5, 20000, "Lancha");

        auto.mostrarInformacion();
        barco.mostrarInformacion();

        // Demostración de venta (decremento de stock)
        auto.vender();
        System.out.println("\nStock de auto tras venta: " + auto.getStock());
    }
}