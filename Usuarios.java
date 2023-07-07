import java.util.LinkedList;
import java.util.Queue;

public class Usuarios {
    public static void main(String[] args) {
        Queue<String> usuarios = new LinkedList<>();

        // Agregar nombres a la cola
        usuarios.add("Nombre 1");
        usuarios.add("Nombre 2");
        usuarios.add("Nombre 3");
        usuarios.add("Nombre 4");
        usuarios.add("Nombre 5");

        // Eliminar 3 elementos de la cola e imprimir el nombre eliminado
        for (int i = 0; i < 3; i++) {
            String nombreEliminado = usuarios.poll();
            System.out.println("El nombre a eliminar es: " + nombreEliminado);
        }

        // Obtener el próximo nombre a eliminar sin eliminarlo de la cola
        String proximoNombre = usuarios.peek();
        System.out.println("El próximo nombre a eliminar es: " + proximoNombre);
    }
}
