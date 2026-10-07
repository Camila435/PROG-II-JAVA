package casting;

// Superclase base
class Transporte {
    public void viajar() {
        System.out.println("Transporte en movimiento.");
    }
}

// Subclase con sobreescritura y método propio
class Auto extends Transporte {

    // Método exclusivo de Auto (sobrecarga conceptual respecto al nombre, no existe en Transporte)
    public void viajar(int velocidad) {
        System.out.println("Auto viajando a " + velocidad + "km/h.");
    }

    // Sobreescritura válida del método heredado de Transporte
    @Override
    public void viajar() {
        System.out.println("Auto detenido.");
    }
}

public class TestDrive {

    public static void main(String[] args) {
        // Upcasting implícito: tipo de referencia Transporte, tipo de objeto real Auto
        Transporte vehiculo = new Auto();

        // LLAMADA A: Compila y resuelve por polimorfismo dinámico en tiempo de ejecución
        vehiculo.viajar(); // Salida: "Auto detenido."

        // LLAMADA B:
        // vehiculo.viajar(100); 
        // ❌ ERROR DE COMPILACIÓN: El compilador verifica el tipo Transporte, 
        // y Transporte no define ningún método 'viajar(int)'.
    }
}