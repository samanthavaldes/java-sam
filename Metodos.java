import java.util.*;
public class Metodos{
    public static void main(String[]args){
        String nombre;
        String curp;
        String folio;
        String edad;
        int edadtotal;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre de usuario: ");
        nombre = sc.nextLine();
        nombre = nombre.toLowerCase();
        
        System.out.println("Ingresa el folio: ");
        folio = sc.nextLine();
        folio = folio.toUpperCase();
        
        System.out.println("Ingresa tu CURP: ");
        curp = sc.nextLine();
        curp = curp.toUpperCase();
        
        if (curp.length() != 18) {
            System.out.println("Longitud del CURP incorrecta ");
        }
        
        System.out.println("Ingresa la edad: ");
        edad = sc.nextLine();
        edadtotal = Integer.parseInt(edad);
        int nuevaEdad = edadtotal + 5;
        System.out.println("Esta es la nueva edad: " + nuevaEdad);
    }
}
