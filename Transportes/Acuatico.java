package Transportes;

class Acuatico extends Vehiculo {
    private String tipoCasco;

    public Acuatico(double hp, int stock, double precio, String tipoCasco) {
        super(hp, stock, precio);
        this.tipoCasco = tipoCasco;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n--- Vehículo Acuático ---");
        System.out.println("HP: " + super.getHp());
        System.out.println("Stock: " + super.getStock());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Eslora / Tipo de casco: " + tipoCasco);
    }

    @Override
    String verCaracteriscas() {
        return "Tipo de casco: " + tipoCasco;
    }
}