
package condiciones.y.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CondicionesYBucles {
    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int fila, columna;
        
        
        System.out.println("ingrese valores de la celdas ");  
        do{
            System.out.println("ingrese numero de filas ");
            fila = leer.nextInt();
            System.out.println("ingrese numero de columnas ");
            columna = leer.nextInt();
            if((fila | columna)<0){
                System.out.println("Sea serio y escriba bien :( ,los numeros deben ser positivos");
            }
            }while((fila | columna)<0);
            int celda[][]= new int[fila][columna];
                for(int i=0; i<fila; i++){
                    System.out.println("fila"+(i+1));
                    for(int e=0; e<columna; e++){
                        System.out.print("columna"+(e+1));
                        try {
                       celda[i][e]= leer.nextInt();
                   } catch (InputMismatchException r) {
                       System.out.println("ingresó mal el dato, digite de nuevo");
                       
                }
                        
            }       
        }
    }
}











































