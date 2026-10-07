package ExtImp;

class A {}
interface I {}
interface J {}

// DECLARACIÓN 1: Válida. Una clase hereda de una clase e implementa una interfaz.
class B extends A implements I {}

// DECLARACIÓN 2: Válida. Una interfaz puede extender múltiples interfaces a la vez.
interface K extends I, J {}

// DECLARACIÓN 3: Válida. Una clase puede implementar múltiples interfaces.
class C implements I, J {}

// DECLARACIÓN 4:
// interface L implements A {} 
// ❌ ERROR DE COMPILACIÓN: Una interfaz NUNCA puede usar 'implements' ni heredar de una clase.

// Corrección válida si L necesitara heredar de otras interfaces:
interface L extends I {}

public class JerarquiaInterfaces {

    public static void main(String[] args) {
        System.out.println("Jerarquías compiladas correctamente.");
    }
}