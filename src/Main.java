public class Main {
    public static void main(String[] args) {
        // Obtener la variable de entorno "NAME"
        String name = System.getenv("NAME");

        // Si la variable no está definida, establecer un valor por defecto
        if (name == null || name.isEmpty()) {
            name = "mundo";
        }

        // Imprimir el mensaje
        System.out.println("¡Hola " + name + " desde una aplicación empaquetada en un archivo JAR ejecutándose en Docker!");
    }
}