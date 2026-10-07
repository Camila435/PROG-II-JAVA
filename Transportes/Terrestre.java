package Transportes;

class Terrestre extends Vehiculo {
    private int ruedas;

    public Terrestre(double hp, int stock, double precio, int ruedas) {
        super(hp, stock, precio);
        this.ruedas = ruedas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n--- Vehículo Terrestre ---");
        System.out.println("HP: " + super.getHp());
        System.out.println("Stock: " + super.getStock());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Ruedas: " + ruedas);
    }

    @Override
    String verCaracteriscas() {
        return "Ruedas: " + ruedas;
    }
}