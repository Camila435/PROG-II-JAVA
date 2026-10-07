package casting;

class Animal {
    public void makeNoise() {
        System.out.println("generic noise");
    }
}

class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("bark");
    }

    // Método propio de la subclase
    public void playDead() {
        System.out.println("roll over");
    }
}

public class CastTest {

    public static void main(String[] args) {
        Animal[] a = { new Animal(), new Dog(), new Animal() };

        for (Animal animal : a) {
            // Despacho polimórfico dinámico: ejecuta el makeNoise correspondiente
            animal.makeNoise();

            // Comprobación de tipo y Downcasting explícito
            if (animal instanceof Dog) {
                // animal.playDead(); 
                // ❌ ERROR: animal es de referencia Animal, que no define playDead().

                // ✅ SOLUCIÓN CORRECTA: Casteo explícito a Dog
                Dog d = (Dog) animal;
                d.playDead(); 
                
                // Forma compacta en una sola línea:
                // ((Dog) animal).playDead();
            }
        }
    }
}