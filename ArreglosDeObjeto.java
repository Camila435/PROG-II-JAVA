
import java.util.Objects;

 class ArreglosDeObjetos {

    public static void main(String[] args) {
        // Crear un arreglo de objetos de tipo Persona

        String [] personas = new String[5];

        personas[0] = "Carlos";
        personas[1] = "Ana";
        personas[2] = "Luis";
        personas[3] = "María";
        personas[4] = "Pedro";

        System.out.println("Lista de personas:");
        Agenda listaDePersonas = new Agenda(personas);
        listaDePersonas.listarPersonas();

        System.out.println("\nDespues de agregar a Lucía:");
        listaDePersonas.agregarPersona("Lucía");
        listaDePersonas.listarPersonas();

        System.out.println("\nDespues de eliminar:");
        listaDePersonas.eliminarPersona(2);
        listaDePersonas.listarPersonas();

        System.out.println("\nDespues de editar:");
        listaDePersonas.editarPersona(1, "Lucía");
        listaDePersonas.listarPersonas();

        System.out.println("\nDespues de eliminar nombres repetidos:");
        listaDePersonas.eliminarPersonasIguales();
        listaDePersonas.listarPersonas();

    }

}

class Agenda{

    String [] personas;
    
    public Agenda(String[] personas){
        this.personas = personas;
    }

    public void listarPersonas() {
        int indice = 0;
        for (String persona : personas) {
            System.out.println(indice + ") " + persona);
            indice++;
        }
    }

    public void agregarPersona(String persona) {

        String[] nuevaLista = new String[personas.length + 1];

        nuevaLista[nuevaLista.length - 1] = persona;
        System.arraycopy(personas, 0, nuevaLista, 0, personas.length);

        personas = nuevaLista;

    }

 public void eliminarPersona(int indice){
    String [] nuevaLista = new String[personas.length - 1];

    // se copia los elementos antes del índice
    System.arraycopy(personas, 0, nuevaLista, 0, indice); 
    // se copia los elementos después del índice a la nueva lista
    System.arraycopy(personas, indice + 1, nuevaLista, indice, nuevaLista.length - indice);

    personas = nuevaLista;
 }

 public void editarPersona(int indice, String nuevoNombre){
     personas[indice] = nuevoNombre;
 }

 public void eliminarPersonasIguales(){
     for (int indice = 0; indice < personas.length; indice++) {
         int siguienteIndice = indice + 1;

         while (siguienteIndice < personas.length) {
             if (Objects.equals(personas[indice], personas[siguienteIndice])) {
                 eliminarPersona(siguienteIndice);
             } else {
                 siguienteIndice++;
             }
         }
     }
 }


}