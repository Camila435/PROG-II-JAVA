package OperadoresIM;

public class TestStrings {

    public static void main(String[] args) {
        // Literales de cadena: se almacenan en el String Constant Pool
        String s1 = "Hola";
        String s2 = "Hola";

        // Instanciación explícita con new: fuerza la creación de un nuevo objeto en el Heap
        String s3 = new String("Hola");

        // Comparación de identidades (direcciones de memoria en el Stack)
        System.out.println(s1 == s2); // Imprime: true  (apuntan al mismo objeto en el Pool)
        System.out.println(s1 == s3); // Imprime: false (s3 está en una dirección física distinta)

        // Comparación de contenido semántico
        System.out.println(s1.equals(s3)); // Imprime: true (ambos contienen los mismos caracteres)
    }
}