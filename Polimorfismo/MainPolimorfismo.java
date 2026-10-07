package Polimorfismo;

public class MainPolimorfismo {

    public static void main(String[] args) {
        // Arreglo polimórfico de tipo Animal
        Animal[] veterinaria = new Animal[3];
        veterinaria[0] = new Perro("Firulais");
        veterinaria[1] = new Gato("Mishi");
        veterinaria[2] = new Perro("Rocky");

        for (Animal animal : veterinaria) {
            // 1. Despacho dinámico: ejecuta el método sobreescrito de cada subclase
            animal.hacerSonido();

            // 2. Comprobación y casteo seguro para métodos exclusivos
            if (animal instanceof Perro) {
                // Casteo obligatorio: convertimos la referencia Animal a Perro
                Perro p = (Perro) animal;
                p.jugarMuerto();
            }
            System.out.println("------------------------------------");
        }
    }
}