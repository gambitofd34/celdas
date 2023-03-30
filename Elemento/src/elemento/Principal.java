
package elemento;
import java.util.*;
public class Principal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre,codigo;
        double precio;
        System.out.println("Ingrese el nombre del producto;");
        nombre=sc.next();
        System.out.println("Ingrese el codigo del producto:");
        codigo=sc.next();
        System.out.println("Ingrese el precio del producto");
        precio=sc.nextDouble();
        Producto pr = new Producto(codigo, nombre, precio);
        pr.imprimir();
    }
    
}
