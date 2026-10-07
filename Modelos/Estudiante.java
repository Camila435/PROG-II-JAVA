package Modelos;

/**
 * Subclase concreta que extiende Persona.
 * Demuestra herencia, invocación a super() y sobreescritura de toString().
 */
public class Estudiante extends Persona {

    private String carrera;
    private int legajo;

    // Constructor que inicializa atributos heredados mediante super(...)
    public Estudiante(String nombre, String apellido, int dni, String carrera, int legajo) {
        super(nombre, apellido, dni); // Invocación obligatoria al constructor del padre
        this.carrera = (carrera != null && !carrera.isBlank()) ? carrera : "Sin definir";
        this.legajo = (legajo > 0) ? legajo : 0;
    }

    // Constructor sobrecargado: asigna valores por defecto
    public Estudiante(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.carrera = "Sin definir";
        this.legajo = 0;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        if (carrera != null && !carrera.isBlank()) {
            this.carrera = carrera;
        }
    }

    public int getLegajo() {
        return this.legajo;
    }

    public void setLegajo(int legajo) {
        if (legajo > 0) {
            this.legajo = legajo;
        }
    }

    // Sobreescritura reutilizando super.toString()
    @Override
    public String toString() {
        return super.toString() + " | Legajo: " + this.legajo + " | Carrera: " + this.carrera;
    }
}