package Polimorfismo;

// Subclase concreta Perro
public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " ladra: ¡Guau, guau!");
    }

    // Método exclusivo de Perro (no existe en Animal)
    public void jugarMuerto() {
        System.out.println(getNombre() + " se hace el muerto en el suelo.");
    }
}