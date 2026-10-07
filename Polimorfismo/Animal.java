package Polimorfismo;

// Superclase base
public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método común a sobreescribir
    public void hacerSonido() {
        System.out.println(this.nombre + " emite un sonido genérico.");
    }
}