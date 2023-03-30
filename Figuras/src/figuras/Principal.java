
package figuras;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangulo r = new Rectangulo();
        float alt,anc;
        System.out.println("Ingese la altura del retángulo: ");
        alt=sc.nextFloat();
        if(alt<=0 || alt>20 ){
            System.out.println("La altura no puede ser menor a 0 o mayor a 20");
        }else{
            System.out.println("Ingrese el ancho del rectángulo: ");
             anc=sc.nextFloat();
             if(anc<=0 || anc>20){
                 System.out.println("El ancho no puede ser menor a 0 o mayor a 20");
             }else{
                 r.calcularArea(anc, anc);
                 r.calcularPerimetro(anc, anc);
                 
             }
        }
        
        
    }
    
}
