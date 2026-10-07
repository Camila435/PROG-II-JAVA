package OperadoresIM;

public class MysteryIncrement {

    public static void main(String[] args) {
        int contador = 5;

        // Post-incremento: entrega el valor actual (5) y luego suma 1 en memoria (queda en 6)
        System.out.println("Linea 1: " + contador++); 

        // Pre-incremento: primero suma 1 (pasa de 6 a 7) y luego entrega el valor (7)
        System.out.println("Linea 2: " + ++contador); 

        // Consulta directa del estado actual de la variable en memoria (7)
        System.out.println("Linea 3: " + contador);   

        int resultado = 10;
        // Post-decremento en operación: toma el valor actual (7) para el cálculo (7 * 10 = 70)
        // y recién después de evaluar la multiplicación decrementa contador a 6
        resultado = contador-- * resultado;

        System.out.println("Linea 4: " + contador);   // Imprime 6
        System.out.println("Linea 5: " + resultado);  // Imprime 70
        System.out.println("Valor final de contador: " + contador); // Valor final: 6
    }
}