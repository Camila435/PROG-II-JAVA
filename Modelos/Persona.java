package Modelos;

/**
 * Superclase que modela una persona base.
 * Aplica encapsulamiento estricto, constantes e inicialización validada.
 */
public class Persona {

    // Atributos privados: solo accesibles dentro de esta clase
    private final int dni; // Inmutable: no debe cambiar tras su creación
    private String nombre;
    private String apellido;

    // Constructor canónico con validación
    public Persona(String nombre, String apellido, int dni) {
        this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Sin Nombre";
        this.apellido = (apellido != null && !apellido.isBlank()) ? apellido : "Sin Apellido";
        this.dni = (dni > 0) ? dni : 0;
    }

    // Getters
    public int getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    // Setters con validación
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.isBlank()) {
            this.apellido = apellido;
        } else {
            System.out.println("Error: El apellido no puede estar vacío.");
        }
    }

    // Representación textual base
    @Override
    public String toString() {
        return "DNI: " + this.dni + " | Nombre completo: " + this.apellido + ", " + this.nombre;
    }
}