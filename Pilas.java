import java.util.*;
public class Pilas{
    public static void main(String[]args){
        //pilas ("stack")

        Stack<String>pila = new Stack<>();
        pila.push("Juan");
        pila.push("Pedro");
        pila.push("Pablo");
        //System.out.println("Los elementos de la pila son: "+ pila);
        pila.pop();
        //System.out.println("Los elementos de la pila son: "+ pila);
        System.out.println(pila.peek());
        System.out.println("La posición 1 es: " + pila.search("Juan"));
        System.out.println(pila.empty());
    }
}