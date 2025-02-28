import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonaApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //definir la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();  // define el numero de personas de la aplicacion
        var salir = false;
        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, personas);
            } catch (Exception e){
                System.out.println("Ocurrio un error " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static void mostrarMenu (){
        // mostrar opciones
        System.out.print("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opcion?");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        // verificar la opcion
        switch (opcion) {
            case 1 -> {     // agregar personas a la lista
                System.out.print("Proporciona el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                var tel = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var email = consola.nextLine();
                // crear el objeto persona
                var persona = new Persona(nombre, tel, email);
                // agregamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");
            } // fin del case 1

            case 2 -> {     // listar personas
                System.out.println("Listado de personas: ");
                // mejora usando lambda y metodo de referencia
                // personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);  // mismo resultado que la linea de arriba pero simplificado *** METODO DE REFERENCIA ***
            } //cierre case 2
            case 3 -> {
                System.out.println("Hasta pronto... ");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion);
        } // cierre del switch
        return salir;
    }
}