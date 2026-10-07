package Interfaces.Empresa;

// Interfaz que define el contrato de toma de decisiones
interface ParaJefes {
    String tomarDecisiones(String decision);
}

// Superclase base
class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hablar() {
        System.out.println("Persona hablando");
    }
}

// Subclase Empleado que hereda de Persona
class Empleado extends Persona {

    public Empleado(String nombre) {
        super(nombre);
    }

    @Override
    public void hablar() {
        System.out.println("Empleado comunicando tareas");
    }
}

// Subclase Jefe que extiende Empleado e implementa ParaJefes
class Jefe extends Empleado implements ParaJefes {

    public Jefe(String nombre) {
        super(nombre);
    }

    @Override
    public String tomarDecisiones(String decision) {
        return "tomar decisiones jefe: " + decision;
    }

    public static String tomarDecisiones() {
        return "tomar decisiones jefe: por defecto";
    }

    @Override
    public void hablar() {
        System.out.println("Jefe dando directivas");
    }
}

// Clase principal ejecutora
public class Empresa {

    public static void main(String[] args) {
        Empleado emp = new Empleado("Lucas");
        Jefe jefe = new Jefe("Gonzalo");

        emp.hablar();
        jefe.hablar();

        System.out.println(jefe.tomarDecisiones("Aumentar presupuesto de desarrollo"));
        System.out.println(Jefe.tomarDecisiones());
    }
}