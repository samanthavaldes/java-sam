import java.util.*;
public class Colas{
    public static void main(String[]args){
        Queue<String>cola = new LinkedList<>();
        cola.offer("Pedro");
        cola.offer("Pablo");
        cola.offer("Luis");
        System.out.println(cola.peek());
        System.out.println(cola.element());
        //cola.pol("Luis");
        //System.out.println(cola());
    }
}